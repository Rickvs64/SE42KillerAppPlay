package controllers;

import com.fasterxml.jackson.databind.JsonNode;
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
        customerRepo.addCustomer(cust);
        return ok(Json.toJson(cust));
    }

}
