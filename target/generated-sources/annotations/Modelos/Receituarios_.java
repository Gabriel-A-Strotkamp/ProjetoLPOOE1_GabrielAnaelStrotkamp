package Modelos;

import Modelos.Medicamentos;
import Modelos.Medicos;
import Modelos.Pacientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-16T11:28:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Receituarios.class)
public class Receituarios_ { 

    public static volatile SingularAttribute<Receituarios, String> prescricao;
    public static volatile SingularAttribute<Receituarios, Pacientes> paciente;
    public static volatile SingularAttribute<Receituarios, Medicos> medico;
    public static volatile SingularAttribute<Receituarios, Integer> id;
    public static volatile ListAttribute<Receituarios, Medicamentos> medicamentos;

}