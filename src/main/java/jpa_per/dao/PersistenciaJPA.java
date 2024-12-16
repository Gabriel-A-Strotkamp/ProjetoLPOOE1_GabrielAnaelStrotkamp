/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_per.dao;

import javax.persistence.*;
import java.util.*;
import Modelos.*;

public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory
                = Persistence.createEntityManagerFactory("pu_lpoo_ClinicaMedica");
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
    
    public List<Pacientes> getPacientes(){
        entity = getEntityManager();
        try {
            TypedQuery<Pacientes> query
                    = entity.createQuery("Select p from Pacientes p", Pacientes.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Paciente: " + e);
            return null;
        }
    }
     public List<Pacientes> getPacientes(String nome) {
        entity = getEntityManager();

        try {
            TypedQuery<Pacientes> query
                    = entity.createQuery("Select p from Pacientes p where lower(p.nome) LIKE :n",
                            Pacientes.class);
            query.setParameter("n", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Paciente: " + e);
            return null;
        }

    }
         public List<Medicos> getMedicos(){
        entity = getEntityManager();
        try {
            TypedQuery<Medicos> query
                    = entity.createQuery("Select m from Medicos m", Medicos.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Medico: " + e);
            return null;
        }
    }
     public List<Medicos> getMedicos(String nome) {
        entity = getEntityManager();

        try {
            TypedQuery<Medicos> query
                   = entity.createQuery("Select m from Medicos m where lower(m.nome) LIKE :n",
                            Medicos.class);
            query.setParameter("n", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar medico: " + e);
            return null;
        }

    }
     public List<Medicamentos> getMedicamentos(){
        entity = getEntityManager();
        try {
            TypedQuery<Medicamentos> query
                    = entity.createQuery("Select m from Medicamentos m", Medicamentos.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Medicamento: " + e);
            return null;
        }
     }
        
     public List<Medicamentos> getMedicamentos(String descricao) {
        entity = getEntityManager();

        try {
            TypedQuery<Medicamentos> query
                    = entity.createQuery("Select m from Medicamentos m where lower(m.descricao) LIKE :n",
                            Medicamentos.class);
            query.setParameter("n", "%" + descricao.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Medicamentos: " + e);
            return null;
        }

    }

}
