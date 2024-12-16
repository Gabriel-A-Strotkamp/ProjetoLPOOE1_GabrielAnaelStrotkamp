package Testes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import jpa_per.dao.PersistenciaJPA;
import Modelos.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestePersistencia {

    PersistenciaJPA jpa = new PersistenciaJPA();

    public TestePersistencia() {
    }

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
        /*
        Medicamentos m = new Medicamentos(1);
        m.setDescricao("Paracetamol");
        m.setLaboratorio("EMS");

        Medicos med = new Medicos();
        med.setId(1);
        med.setNome("Dr. Carlos");
        med.setFormacao("Clinico Geral");

        Pacientes p = new Pacientes(1, "Lucas", 25);
        p.setDoenca("Dor de cabeça");

        med.addPaciente(p);

        //(int id, Medicos medico, Pacientes paciente)
        Receituarios r = new Receituarios(1, med, p);
        r.setDescricao("Tomar 1cp cod: 1  (de 6h em 6h)");
        r.addMedicamento(m);

        try {
            jpa.persist(med);
            jpa.persist(p);
            jpa.persist(m);
            jpa.persist(r);

            //jpa.remover(p);

        } catch (Exception e) {
            System.err.println("Erro ao persistir modelo: " + m);
        }*/

    }
}
