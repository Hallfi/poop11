/**
 * Clase principal POOP11 para demostración de uso de archivos y manipulación de datos.
 * La clase realiza operaciones de escritura y lectura en archivos de texto,
 * así como manejo de objetos de tipo Alumno.
 * 
 * @author Halley Melissa Mendoza Sanchez
 */
package poop11;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class POOP11 {

    /**
     * Método principal que ejecuta la demostración de uso de archivos y manipulación de datos.
     *
     * @param args Argumentos de línea de comando (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Creación de un archivo y verificación de su existencia
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("################## File Writer##########");

        // Escritura de texto en el archivo "archivo.txt" desde la consola
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo");
            String texto = br.readLine();
            System.out.println(texto);

            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.print(texto);
            salida.println("Esta es la segunda linea");

            for (int i = 0; i < 10; i++) {
                salida.println("Linea" + i);
            }
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo " + i * 10 + "%");
            }

            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("########### FileReader ###########");

        // Lectura y visualización del contenido del archivo "archivo.txt"
        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("###");
            System.out.println("El texto del archivo es: ");
            String Linea = br.readLine();
            while (Linea != null) {
                System.out.println(Linea);
                Linea = br.readLine();
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("########## StringTokenizer ###########");

        // Tokenización de una cadena con datos de un alumno
        String alumnoParseado = "Halley Melissa, Mendoza, Sanchez, 321254601, 19, 3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }

        // Creación y muestra de objetos de la clase Alumno
        Alumno alumno1 = new Alumno("Halley", "Melissa", "Mendoza", 321254601, 19, 3);
        System.out.println(alumno1);
        Alumno alumno2 = new Alumno("Hiram", "Sanchez", "Saldibar", 117005558, 19, 4);
        System.out.println(alumno2);
        Alumno alumno3 = new Alumno("Leonel Andres", "Messi", "Cuccitini", 33224523, 36, 2);
        System.out.println(alumno3);
        Alumno alumno4 = new Alumno("Cristiano Ronaldo", "Dos Santos", "Aveiro", 321993565, 39, 5);
        System.out.println(alumno4);
        Alumno alumno5 = new Alumno("Neymar", "Da Silva", "Santos", 118004723, 32, 3);
        System.out.println(alumno5);

        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);

        System.out.println("##### imprimir lista con foreach #######");
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }

        System.out.println("##### escribiendo en .txt ########");

        // Escritura de la lista de alumnos en el archivo "alumnos.txt"
        try {
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (Alumno alumno : lista) {
                salida.println(alumno);
            }
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
