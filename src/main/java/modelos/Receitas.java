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
public class Receitas {
    //receitas(list(medicamentos), paciente, descrição, médico)
    private int id;
    private Pacientes paciente;
    private Medicos medico;
    private List<Medicamentos> medicamento = new ArrayList();

    public Receitas(int id, Pacientes paciente, Medicos medico) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void addMedicamentos(Medicamentos medicamento) {
        this.medicamento.add(medicamento);
    }

    public void RemMedicamentos(Medicamentos medicamento) {
        this.medicamento.remove(medicamento);
    }
    
    
}
