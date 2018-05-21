package repositories;

import domains.Customer;

import java.util.List;

public interface ICustomerRepo {
    boolean addCustomer(Customer newCustomer);
    Customer getCustomerByName(String name);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
    boolean deleteCustomer(Customer customer);
}
