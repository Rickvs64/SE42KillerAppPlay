package repositories;

import domains.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class SQLCustomerRepo implements ICustomerRepo {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction et = null;

    @Override
    public boolean addCustomer(Customer newCustomer) {
        init();

        try {
            // Get transaction.
            et = em.getTransaction();

            // Start the transaction.
            et.begin();

            // Sync the new customer with database.
            em.persist(newCustomer);

            // Finally commit changes.
            et.commit();

            return true;
        } catch (Exception ex) {
            // Do a rollback just in case.
            et.rollback();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public Customer getCustomerByName(String name) {

        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public boolean deleteCustomer(Customer customer) {

        return false;
    }

    private void init() {
        emf = Persistence.createEntityManagerFactory("bowshop");
        em = emf.createEntityManager();
    }
}
