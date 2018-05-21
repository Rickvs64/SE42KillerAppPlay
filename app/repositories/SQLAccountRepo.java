package repositories;

import domains.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class SQLAccountRepo implements IAccountRepo {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction et = null;

    @Override
    public boolean addAccount(Account newAccount) {
        init();

        try {
            // Get transaction.
            et = em.getTransaction();

            // Start the transaction.
            et.begin();

            // Sync the new customer with database.
            em.persist(newAccount);

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
    public Account getAccountByEmail(String email) {
        return null;
    }

    @Override
    public Account getAccountById(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public boolean deleteAccount(Account account) {
        return false;
    }

    private void init() {
        emf = Persistence.createEntityManagerFactory("bowshop");
        em = emf.createEntityManager();
    }
}
