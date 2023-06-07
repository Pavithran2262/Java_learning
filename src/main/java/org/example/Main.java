package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        demo a = new demo();
        a.setId(11);
        a.setName1("kain");
        a.setTech("flutter");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();


        demo b = em.find(demo.class,1);
//                                                      demo c = em.remove();
        em.getTransaction().begin();
        demo d= em.find(demo.class,2);
        em.remove(d);
//        em.persist(b);
        em.getTransaction().commit();

        System.out.println(a);
        System.out.println(b);

    }
}