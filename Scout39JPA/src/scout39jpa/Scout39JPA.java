/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alzaji
 */
public class Scout39JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Scout39JPAPU");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }

}
