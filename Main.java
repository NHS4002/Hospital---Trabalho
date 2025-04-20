package Hospital;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dra. Clara", "111", "123", "Cirurgia");
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("João", "222", "456");
        Paciente paciente = new Paciente("Lucas", "333", "789");
        Enfermeiro enf = new Enfermeiro("Marcela", "444", "000");
        Anestesista anest = new Anestesista("Pedro", "555", "111");
        ResponsavelTecnico rt = new ResponsavelTecnico("Dr. Paulo", "666", "222");

        SistemaHospitalar sistema = new SistemaHospitalar();

        sistema.agendar(tecnico, Procedimento.Tipo.CIRURGICO, paciente, medico, enf, anest);

        Procedimento proc = sistema.procedimentos.get(0);
        proc.liberarPorResponsavel(rt);
        proc.liberarPorMedico();

        System.out.println("Paciente pode sair? " + proc.podeSair());
        sistema.mostrarProcedimentos(paciente);
    }
}