/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11extra;

/**
 * Clase Alumno que representa a un estudiante con atributos básicos.
 * Incluye métodos para obtener y modificar atributos, así como para
 * representar el objeto en formato CSV.
 * 
 */
class Alumno {
    private String nombre;
    private String apPat;
    private String apMat;
    private String cuenta;  // Cambiado a String para conservar formato exacto
    private int edad;
    private int semestre;

    public Alumno(String nombre, String apPat, String apMat, String cuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.cuenta = cuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getNombre() { return nombre; }
    public String getApPat() { return apPat; }
    public String getApMat() { return apMat; }
    public String getCuenta() { return cuenta; }
    public int getEdad() { return edad; }
    public int getSemestre() { return semestre; }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPat=" + apPat + ", apMat=" + apMat +
                ", cuenta=" + cuenta + ", edad=" + edad + ", semestre=" + semestre + '}';
    }
}
