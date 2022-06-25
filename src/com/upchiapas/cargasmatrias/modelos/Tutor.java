package com.upchiapas.cargasmatrias.modelos;

public class Tutor {
    private String nombreTutor;
    private String matriculaTutor;
    private String contraseñaTutor;

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getMatriculaTutor() {
        return matriculaTutor;
    }

    public void setMatriculaTutor(String matriculaTutor) {
        this.matriculaTutor = matriculaTutor;
    }

    public String getContraseñaTutor() {
        return contraseñaTutor;
    }

    public void setContraseñaTutor(String contraseñaTutor) {
        this.contraseñaTutor = contraseñaTutor;
    }

    public Tutor(String nombreTutor, String matriculaTutor, String contraseñaTutor) {
        this.nombreTutor = nombreTutor;
        this.matriculaTutor = matriculaTutor;
        this.contraseñaTutor = contraseñaTutor;
    }
}
