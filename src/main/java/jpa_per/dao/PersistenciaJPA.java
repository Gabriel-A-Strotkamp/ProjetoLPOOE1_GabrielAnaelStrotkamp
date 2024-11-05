/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_per.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vanessalagomachado
 */
public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory
                = Persistence.createEntityManagerFactory("pu_lpoo_estacionamento");
        //conecta no bd e executa a estratégia de geração.
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {

        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    /*
    Todos os métodos agora chamam getEntityManager() 
    para garantir que o EntityManager esteja sempre aberto e 
    pronto para uso.
     */
    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }

}
