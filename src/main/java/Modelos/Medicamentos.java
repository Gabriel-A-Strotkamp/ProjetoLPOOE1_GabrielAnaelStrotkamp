/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author 20221PF.CC0008
 */

@Entity
@Table(name = "tb_Medicamentos")
public class Medicamentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable = false, length = 50)
    private String descricao;
    
    @Column(length = 20)
    private String laboratorio;

    public Medicamentos(int id) {
        this.id = id; 
    }
    public Medicamentos(){
        
    }
    public Medicamentos(int id, String descricao, String laboratorio) {
        this.id = id;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    
}
