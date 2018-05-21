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

public class CustomerController extends Controller {

    ICustomerRepo customerRepo = new SQLCustomerRepo();
    IAccountRepo accountRepo = new SQLAccountRepo();

    public Result addCustomer(String name) {
        Customer cust = new Customer(name, "de la Test");

        // Create an account as well.
        Account acc = new Account(cust.getFirstname() + "@outlook.com", "Password123", cust);

        customerRepo.addCustomer(cust);
        accountRepo.addAccount(acc);

        return ok(Json.toJson(acc));
    }

}
