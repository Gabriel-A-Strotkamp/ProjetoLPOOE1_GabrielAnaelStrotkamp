/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 *
 * @author 20221PF.CC0008
 */
@Entity
@Table(name = "tb_Medicos")
public class Medicos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable = false, length = 50)
    private String nome;
    
    @Column(length = 11)
    private String cpf;
    
    @Column(length = 11)
    private String crm;
    
    @Column(length = 20)
    private String formacao;
    
    @OneToMany(mappedBy = "Pacientes")
    private final List<Pacientes> pacientes;

    public Medicos() {
        this.pacientes = null;
    }

    public Medicos(int id, String nome, String formacao){
        this.id = id;
        this.nome = nome;
        this.formacao = formacao;
        this.pacientes = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void addPaciente(Pacientes paciente){
        pacientes.add(paciente);
    }
    
    public void remPaciente(Pacientes paciente){
        pacientes.remove(paciente);    
        }
    public Pacientes getpacientes(){
        return (Pacientes) this.pacientes;
    }
}
