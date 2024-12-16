package Modelos;

import Modelos.Pacientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-16T11:28:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Medicos.class)
public class Medicos_ { 

    public static volatile SingularAttribute<Medicos, String> formacao;
    public static volatile SingularAttribute<Medicos, String> cpf;
    public static volatile ListAttribute<Medicos, Pacientes> pacientes;
    public static volatile SingularAttribute<Medicos, String> nome;
    public static volatile SingularAttribute<Medicos, Integer> id;
    public static volatile SingularAttribute<Medicos, String> crm;

}