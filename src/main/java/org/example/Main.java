package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        // Create operation
        em.getTransaction().begin();
        demo a = new demo();
        a.setId(21);
        a.setName1("kain");
        a.setTech("flutter");
        em.persist(a);
        em.getTransaction().commit();

        // Read operation
        demo b = em.find(demo.class, 1);
        System.out.println(b);

        // Update operation
        em.getTransaction().begin();
        demo c = em.find(demo.class, 9);
        c.setName1("updatedName");
        em.getTransaction().commit();

        // Delete operation
        em.getTransaction().begin();
        demo d = em.find(demo.class, 3);
        em.remove(d);
        em.getTransaction().commit();

        // Read all operation
        em.getTransaction().begin();
        List<demo> demos = em.createQuery("SELECT d FROM demo d", demo.class).getResultList();
        for (demo demo : demos) {
            System.out.println(demo);
        }
        em.getTransaction().commit();

        em.close();
        emf.close();
        System.out.println("hi");
//        demo b = em.find(demo.class,1);
////                                                      demo c = em.remove();
//        em.getTransaction().begin();
//        demo d= em.find(demo.class,2);
//        em.remove(d);
////        em.persist(b);
//        em.getTransaction().commit();
//
//        System.out.println(a);
//        System.out.println(b);

    }
}