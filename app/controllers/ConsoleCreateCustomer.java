package controllers;

import domains.Account;
import domains.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class ConsoleCreateCustomer {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bowshop");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        testTransaction();
    }

    public static void testTransaction() {
        Scanner scanner = new Scanner(System.in);

        show("First we'll need to create a new customer");
        show("Please input this person's FIRST name:");
        String firstname = scanner.nextLine();
        show("Great, now please input " + firstname + "'s LAST name:");
        String surname = scanner.nextLine();
        show("Almost done creating " + firstname + " " + surname + ". Next we'll need this customer's email address:");
        String email = scanner.nextLine();
        show("Final step. Type in a password:");
        String password = scanner.nextLine();

        Account newAccount = new Account(email, password);
        Customer newCustomer = new Customer(firstname, surname, newAccount);
        newAccount.setCustomer(newCustomer);

        show(newCustomer.getFirstname() + " " + newCustomer.getSurname() + " has been created!");
        show("Now trying to insert this guy into our database.");

        try {
            em.getTransaction().begin();

            // Sync the new customer with database.
            em.persist(newCustomer);
            em.persist(newAccount);

            // Finally commit changes
            em.getTransaction().commit();

            show("Success! Customer has been inserted into the database.");
        } catch (Exception ex) {
            throw ex; // Just make it the user's problem.
        } finally {
            em.close();
        }
    }

    public static void show(String message) {
        System.out.println(message);
    }
}
