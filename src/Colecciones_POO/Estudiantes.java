package Colecciones_POO;

import java.util.*;
import java.lang.*;

public class Estudiantes {

    public static void agregarEstudiante(Map<String, Set<String>> estudiantes, String nombre, Set<String> materias) {
        estudiantes.put(nombre, materias);
    }

    public static void mostrarEstudiantes(Map<String, Set<String>> estudiantes) {
        for (Map.Entry<String, Set<String>> entry : estudiantes.entrySet()) {
            String nombre = entry.getKey();
            Set<String> materiasSet = entry.getValue();
            String[] materiasArray = materiasSet.toArray(new String[0]);
            System.out.println("Estudiante: " + nombre + " -> Materias: " + Arrays.toString(materiasArray));
        }
    }

    public static void mostrarMateriasEstudiante(Map<String, Set<String>> estudiantes, String nombre) {
        if (estudiantes.containsKey(nombre)) {
            Set<String> materias = estudiantes.get(nombre);
            String[] materiasAr = materias.toArray(new String[0]);
            System.out.println("Materias de " + nombre + ": " + Arrays.toString(materiasAr));
        } else {
            System.out.println("El estudiante " + nombre + " no está en la lista.");
        }
    }
}

/* Para ver si sirve el commit */