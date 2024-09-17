package Colecciones_POO;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Estudiantes Students = new Estudiantes();
        Map<String, Set<String>> estudiantes = new HashMap<>();

        Set<String> materiasJuan = new HashSet<>(Arrays.asList("Historia", "Matemáticas", "Física"));
        Set<String> materiasMaria = new HashSet<>(Arrays.asList("Inglés", "Física", "Química"));
        Set<String> materiasCarlos = new HashSet<>(Arrays.asList("Biología", "Historia", "Inglés"));

        Students.agregarEstudiante(estudiantes, "Juan", materiasJuan);
        Students.agregarEstudiante(estudiantes, "María", materiasMaria);
        Students.agregarEstudiante(estudiantes, "Carlos", materiasCarlos);

        System.out.println("Lista de estudiantes y sus materias:");
        Students.mostrarEstudiantes(estudiantes);

        System.out.print("\nMaterias de un estudiante específico: ");
        Scanner entrada = new Scanner(System.in);
        String solicitud = entrada.next();

        Students.mostrarMateriasEstudiante(estudiantes, solicitud);
    }
}
