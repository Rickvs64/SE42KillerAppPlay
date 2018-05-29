package repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnector {
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("bowshop");
            em = emf.createEntityManager();
            return em;
        }
        else {
            return em;
        }
    }
}
