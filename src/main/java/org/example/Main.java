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
        a.setId(10);
        a.setName1("Mariana");
        a.setTech("php");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();


        demo b = em.find(demo.class,1);
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();

        System.out.println(a);
        System.out.println(b);

    }
}