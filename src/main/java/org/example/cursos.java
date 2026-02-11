package org.example;

public class cursos {

    private String codigo;
    private String nombre;
    private String semestre;

    public cursos() {
    }

    public cursos(String codigo, String nombre, String semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "cursos{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }

}

