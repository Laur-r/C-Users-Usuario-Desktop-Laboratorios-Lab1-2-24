    /*
Proposito: Elaborar un sistema que permita gestionas los datos de una biblioteca.
Autor 1: Laura Sofia Lopez - 202363055
Autor 2: LAura Valentina Galvez - 202363055
Fecha: 31-08-2024
Version: 1.0
*/
package lab1.pkg2.pkg24;

import java.util.ArrayList;

public class Library {


    private int libraryID;
    private ArrayList<String> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> prestamos;
    private ArrayList<String> autores;

    public Library (int libraryID) {
        this.libraryID = libraryID;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public int getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    public ArrayList<String> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<String> libros) {
        this.libros = libros;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public ArrayList<String> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<String> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
    
    public class Usuario {
    private String nombre;
    private String documento;
    private String telefono;

    public Usuario(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
     }
}
    