package repositories;

import domains.Customer;

import java.util.List;

public interface ICustomerRepo {
    boolean addCustomer(Customer newCustomer);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
}
