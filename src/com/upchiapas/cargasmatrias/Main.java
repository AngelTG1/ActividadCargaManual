package com.upchiapas.cargasmatrias;

import com.upchiapas.cargasmatrias.modelos.Alumno;
import com.upchiapas.cargasmatrias.modelos.Materia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        ingresarAlumno();
        //registroMateria();
    }


    static Scanner entrada = new Scanner(System.in);

    static Materia mater;

    public static void ingresarAlumno(){
        int i = 0;
        String usuario, matricula;


        ArrayList<Alumno> listAlumnos = new ArrayList();

        Alumno u1 = new Alumno("Angel", "211223", "211223");
        Alumno u2 = new Alumno("Osvaldo", "211222", "211222");
        Alumno u3 = new Alumno("Yahir", "211224", "211224");
        Alumno u4 = new Alumno("Arisel", "211225", "211225");
        Alumno u5 = new Alumno("Andrea", "211226", "211226");

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = u1;
        alumnos[1] = u2;
        alumnos[2] = u3;
        alumnos[3] = u4;
        alumnos[4] = u5;








    }


    /*public static void registroMateria() {
        int cantidad;
        String nombreMateria, grupo;


        System.out.println("cuantas materias: ");
        cantidad = entrada.nextInt();
        entrada.nextLine();
        for (int i = 1; i<=cantidad; i++){
            System.out.println("Asignatura: "+i);
            System.out.println("Materia: ");
            nombreMateria = entrada.nextLine();
            System.out.println("Grupo: ");
            grupo = entrada.next();
            entrada.nextLine();
            mater = new Materia(nombreMateria, grupo);
            listaMateria.add(mater);

        }
        mostrarMaterias();

    }*/

    /*public static void mostrarMaterias(){
        Iterator<Materia> iterator = listaMateria.iterator();
        System.out.println("----CARGAR LISTA--------");
        while (iterator.hasNext()){
            mater = iterator.next();
            System.out.println(mater.getGrupo()+" "+mater.getNombreMaterias());
        }
    }*/




}
