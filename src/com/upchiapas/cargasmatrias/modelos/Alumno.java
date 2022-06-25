package com.upchiapas.cargasmatrias.modelos;

import java.util.ArrayList;

public class Alumno {
    private String nombreAlumno;
    private String matriculaAlumno;
    private String contraseñaAlumno;

    ArrayList<Materia> listaMateria = new ArrayList<>();

    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public Alumno(String nombreAlumno, String matriculaAlumno, String contraseñaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.matriculaAlumno = matriculaAlumno;
        this.contraseñaAlumno = contraseñaAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getMatriculaAlumno() {
        return matriculaAlumno;
    }

    public void setMatriculaAlumno(String matriculaAlumno) {
        this.matriculaAlumno = matriculaAlumno;
    }

    public String getContraseñaAlumno() {
        return contraseñaAlumno;
    }

    public void setContraseñaAlumno(String contraseñaAlumno) {
        this.contraseñaAlumno = contraseñaAlumno;
    }
}
