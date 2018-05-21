package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import domains.Account;
import domains.Customer;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.ICustomerRepo;
import repositories.SQLCustomerRepo;

public class CustomerController extends Controller {

    ICustomerRepo customerRepo = new SQLCustomerRepo();

    public Result addCustomer(String name) {
        Customer cust = new Customer(name, "de la Test");
        cust.setAccount(new Account(cust.getFirstname() + ".delaTest@gmail.com", "Welkom123", cust));
        customerRepo.addCustomer(cust);
        return ok(Json.toJson(cust));

        // NOTE:
        // The account created cannot be shown here, as this would cause an infinite recursion.
        // Namely, account will attempt to show the linked customer, which in turn will want to show the linked account, etc.
    }

}
