package Hospital;

import java.util.*;

public class SistemaHospitalar {
    List<Procedimento> procedimentos = new ArrayList<>();

    void agendar(Usuario user, Procedimento.Tipo tipo, Paciente paciente, Medico medico,
                 Enfermeiro enf, Anestesista anest) {

        if (!(user instanceof Medico || user instanceof TecnicoAdministrativo)) {
            System.out.println("Sem permissão para agendar.");
            return;
        }

        Procedimento p = new Procedimento(tipo, paciente, medico);
        if (tipo != Procedimento.Tipo.CONSULTA) p.setEnfermeiro(enf);
        if (tipo == Procedimento.Tipo.CIRURGICO) p.setAnestesista(anest);

        procedimentos.add(p);
        System.out.println("Procedimento agendado.");
    }

    void mostrarProcedimentos(Paciente paciente) {
        for (Procedimento p : procedimentos) {
            if (p.paciente == paciente) {
                System.out.println("Procedimento: " + p.tipo + " | Médico: " + p.medico.nome);
            }
        }
    }
}