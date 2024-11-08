/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author poo03alu24
 */
class Alumno {
    
    private String nombre;
    private String apPat;
    private String apMat;
    private int cuenta;
    private int edad;
    private int semestre;

    public Alumno(String nombre, String apPat, String apMat, int cuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.cuenta = cuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPat=" + apPat + ", apMat=" + apMat + ", cuenta=" + cuenta + ", edad=" + edad + ", semestre=" + semestre + '}';
    }
    
    
}

