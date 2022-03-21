package dao;

import models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoImpl implements IClientDao{
//    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
//    EntityManager em=emf.createEntityManager();

    @Override
    public Client save(Client c) {
//        em.getTransaction().begin();
//        em.persist(c);
//        em.getTransaction();
        return null;
    }

    public ClientDaoImpl(){
        System.out.println("Client Dao");
    }
}
