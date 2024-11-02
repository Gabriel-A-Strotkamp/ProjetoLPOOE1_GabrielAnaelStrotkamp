/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jennifer Ebertz
 */
public class Medicos extends Pessoas {
    //médico(formação, list(paciente), crm)
    private String formacao;
    private List<Pacientes> paciente = new ArrayList();
    private String crm;
    
}
