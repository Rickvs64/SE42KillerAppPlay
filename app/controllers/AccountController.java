package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import domains.Account;
import domains.Customer;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.IAccountRepo;
import repositories.ICustomerRepo;
import repositories.SQLAccountRepo;
import repositories.SQLCustomerRepo;

import javax.inject.Singleton;


public class AccountController extends Controller {

    IAccountRepo accountRepo = new SQLAccountRepo();

    public Result getAllAccounts() {
        return ok(Json.toJson(accountRepo.getAllAccounts()));
    }

    public Result getAccountById(Long id) {
        return ok(Json.toJson(accountRepo.getAccountById(id)));
    }

    public Result deleteAccount(Long id) {
        if (accountRepo.deleteAccount(accountRepo.getAccountById(id))) {
            return ok(Json.toJson("Successfully deleted!"));
        }
        else {
            return ok(Json.toJson("Nope. That failed."));
        }
    }

    // POST
    public Result addAccount() {
        Account acc = new Account();
        JsonNode json = request().body().asJson();
        acc.setEmail(json.findPath("email").textValue());
        acc.setPassword(json.findPath("password").textValue());
        accountRepo.addAccount(acc);
        return ok(Json.toJson(acc.getEmail() + " has been successfully created."));
    }

    public Result updateAccount(Long id) {
        Account acc = new Account();
        acc.setId(id);
        JsonNode json = request().body().asJson();
        acc.setEmail(json.findPath("email").textValue());
        acc.setPassword(json.findPath("password").textValue());
        accountRepo.updateAccount(acc);
        return ok(Json.toJson(acc));
    }

}
