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
        a.setId(9);
        a.setName1("Maria");
        a.setTech("Hardware");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        System.out.println( );

    }
}