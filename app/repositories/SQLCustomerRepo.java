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
        init();

        try {
            Customer customer = em.find(Customer.class, name);

            return customer;
        } catch (Exception ex) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public Customer getCustomerById(Long id) {
        init();

        try {
            Customer customer = em.find(Customer.class, id);

            return customer;
        } catch (Exception ex) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        init();

        try {
            List<Customer> customers = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();

            return customers;
        } catch (Exception ex) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        init();

        try {
            // Get transaction.
            et = em.getTransaction();

            // Start the transaction.
            et.begin();

            em.remove(customer);

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

    private void init() {
        emf = Persistence.createEntityManagerFactory("bowshop");
        em = emf.createEntityManager();
    }
}
