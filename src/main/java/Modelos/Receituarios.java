/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.io.Serializable;
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
@Table(name = "tb_Receituarios")
public class Receituarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable = false, length = 200)
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Medicos medico;
    
    @Enumerated(EnumType.STRING)
    private Pacientes paciente;
    
    @OneToMany(mappedBy = "Medicamentos")
    private final List<Medicamentos> medicamentos;

    public Receituarios() {
        this.medicamentos = null;
    }

    public Receituarios(int id, Medicos medico, Pacientes paciente) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.medicamentos = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
    
    public void addMedicamento(Medicamentos medicamento){
        medicamentos.add(medicamento);
    }
    
    public void remMedicamento(Medicamentos medicamento){
        medicamentos.remove(medicamento);    
        }
    public Medicamentos getMedicamentos(){
        return (Medicamentos) this.medicamentos;
    }
}
