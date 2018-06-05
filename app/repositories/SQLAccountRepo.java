package repositories;

import domains.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class SQLAccountRepo implements IAccountRepo {

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
            // em.close();
        }
    }

    @Override
    public Account getAccountByEmail(String email) {
        return null;
    }

    @Override
    public Account getAccountById(Long id) {
        init();

        try {
            Account account = em.find(Account.class, id);

            return account;
        } catch (Exception ex) {
            return null;
        } finally {
            // em.close();
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        init();

        try {
            List<Account> accounts = em.createQuery("SELECT a FROM Account a", Account.class).getResultList();

            return accounts;
        } catch (Exception ex) {
            return null;
        } finally {
            // em.close();
        }
    }

    @Override
    public boolean deleteAccount(Account account) {
        init();

        try {
            // Get transaction.
            et = em.getTransaction();

            // Start the transaction.
            et.begin();

            em.persist(account);
            em.remove(account);

            // Finally commit changes.
            et.commit();

            return true;
        } catch (Exception ex) {
            // Do a rollback just in case.
            et.rollback();
            return false;
        } finally {
            // em.close();
        }
    }

    @Override
    public boolean updateAccount(Account newAccProperties) {
        init();

        try {
            // Get transaction.
            et = em.getTransaction();

            // Start the transaction.
            et.begin();

            // Obviously NOT the NewAcc, which only acts as a temporary shell that contains new info!
            Account existingAcc = em.find(Account.class, newAccProperties.getId());
            em.persist(existingAcc);

            // Manual approach to UPDATE.
            // Copy over a few properties.
            existingAcc.setEmail(newAccProperties.getEmail());
            existingAcc.setPassword(newAccProperties.getPassword());

            // Finally commit changes.
            et.commit();

            return true;
        } catch (Exception ex) {
            // Do a rollback just in case.
            et.rollback();
            return false;
        } finally {
            // em.close();
        }
    }

    private void init() {
        em = DBConnector.getEntityManager();
    }
}
