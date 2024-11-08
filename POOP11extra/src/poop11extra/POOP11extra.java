/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11extra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class POOP11extra {

    public static void main(String[] args) {
        // Crear una lista de alumnos
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Halley", "Melissa", "Mendoza", "321254601", 19, 3));
        listaAlumnos.add(new Alumno("Juan", "Perez", "Lopez", "321254602", 20, 4));
        listaAlumnos.add(new Alumno("Maria", "Gomez", "Sanchez", "321254603", 21, 5));
        listaAlumnos.add(new Alumno("Luis", "Garcia", "Martinez", "321254604", 22, 6));
        listaAlumnos.add(new Alumno("Ana", "Lopez", "Hernandez", "321254605", 18, 2));
        listaAlumnos.add(new Alumno("Carlos", "Ramirez", "Flores", "321254606", 23, 7));
        listaAlumnos.add(new Alumno("Lucia", "Rodriguez", "Castro", "321254607", 19, 3));
        listaAlumnos.add(new Alumno("Pedro", "Hernandez", "Ortiz", "321254608", 20, 4));
        listaAlumnos.add(new Alumno("Sofia", "Martinez", "Lozano", "321254609", 21, 5));
        listaAlumnos.add(new Alumno("Miguel", "Santos", "Jimenez", "321254610", 22, 6));

        // Exportar la lista de alumnos a un archivo CSV
        exportarAlumnosACSV(listaAlumnos, "alumnos.csv");

        // Leer el archivo CSV y crear una nueva lista de alumnos
        ArrayList<Alumno> nuevaListaAlumnos = leerAlumnosDesdeCSV("alumnos.csv");

        // Imprimir la nueva lista de alumnos
        System.out.println("Lista de alumnos leída desde el archivo CSV:");
        for (Alumno alumno : nuevaListaAlumnos) {
            System.out.println(alumno);
        }
    }

    public static void exportarAlumnosACSV(ArrayList<Alumno> listaAlumnos, String nombreArchivo) {
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo)))) {
            for (Alumno alumno : listaAlumnos) {
                salida.println(alumno.getNombre() + "," + alumno.getApPat() + "," + alumno.getApMat() + "," +
                        alumno.getCuenta() + "," + alumno.getEdad() + "," + alumno.getSemestre());
            }
            System.out.println("Alumnos exportados a " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo: " + ex.getMessage());
        }
    }

    public static ArrayList<Alumno> leerAlumnosDesdeCSV(String nombreArchivo) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokenizador = new StringTokenizer(linea, ",");
                String nombre = tokenizador.nextToken();
                String apPat = tokenizador.nextToken();
                String apMat = tokenizador.nextToken();
                String cuenta = tokenizador.nextToken();  // Leer el número de cuenta como cadena
                int edad = Integer.parseInt(tokenizador.nextToken());
                int semestre = Integer.parseInt(tokenizador.nextToken());

                Alumno alumno = new Alumno(nombre, apPat, apMat, cuenta, edad, semestre);
                listaAlumnos.add(alumno);
            }
            System.out.println("Alumnos leídos desde " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
        return listaAlumnos;
    }
}
