package Hospital;

class Procedimento {
    enum Tipo { CONSULTA, ESTETICO, CIRURGICO }

    Tipo tipo;
    Paciente paciente;
    Medico medico;
    Enfermeiro enfermeiro;
    Anestesista anestesista;
    ResponsavelTecnico responsavel;
    boolean liberadoResponsavel = false;
    boolean liberadoMedico = false;

    Procedimento(Tipo tipo, Paciente paciente, Medico medico) {
        this.tipo = tipo;
        this.paciente = paciente;
        this.medico = medico;
    }

    void setEnfermeiro(Enfermeiro enf) {
        this.enfermeiro = enf;
    }

    void setAnestesista(Anestesista anest) {
        this.anestesista = anest;
    }

    void liberarPorResponsavel(ResponsavelTecnico rt) {
        this.responsavel = rt;
        liberadoResponsavel = true;
    }

    void liberarPorMedico() {
        if (tipo == Tipo.CIRURGICO) {
            liberadoMedico = true;
        }
    }

    boolean podeSair() {
        if (tipo == Tipo.CIRURGICO) {
            return liberadoResponsavel && liberadoMedico;
        }
        return liberadoResponsavel;
    }
}