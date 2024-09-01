/*
Proposito: Elaborar un sistema que permita gestionas los datos de una biblioteca.
Autor 1: Laura Sofia Lopez - 202363055
Autor 2: LAura Valentina Galvez - 202363055
Fecha: 31-08-2024
Version: 1.0
*/
package lab1.pkg2.pkg24;

import java.util.Scanner;

public class Lab1224 {

    Scanner sc = new Scanner(System.in);
    Library biblioteca = new Library(1);

    private void consultarUsuario() {
        System.out.println("Ingrese el documento del usuario a consultar: ");
        String documento = sc.nextLine();

        for (Library.Usuario u : biblioteca.getUsuarios()) {
            if (u.getDocumento().equals(documento)) {
                System.out.println("Nombre: " + u.getNombre());
                System.out.println("Documento: " + u.getDocumento());
                System.out.println("Teléfono: " + u.getTelefono());
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    private void modificarUsuario() {
        System.out.println("Ingrese el documento del usuario a modificar: ");
        String documento = sc.nextLine();

        for (Library.Usuario u : biblioteca.getUsuarios()) {
            if (u.getDocumento().equals(documento)) {
                System.out.println("Ingrese el nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                System.out.println("Ingrese el nuevo teléfono: ");
                String nuevoTelefono = sc.nextLine();

                u.setNombre(nuevoNombre);
                u.setTelefono(nuevoTelefono);
                System.out.println("Usuario modificado exitosamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    private void eliminarUsuario() {
        System.out.println("Ingrese el documento del usuario a eliminar: ");
        String documento = sc.nextLine();

        Library.Usuario usuarioAEliminar = null;
        for (Library.Usuario u : biblioteca.getUsuarios()) {
            if (u.getDocumento().equals(documento)) {
                usuarioAEliminar = u;
                break;
            }
        }

        if (usuarioAEliminar != null) {
            biblioteca.getUsuarios().remove(usuarioAEliminar);
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void crearNuevoUsuario() {
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el documento: ");
        String documento = sc.nextLine();
        System.out.println("Ingrese el teléfono: ");
        String telefono = sc.nextLine();

        Library.Usuario nuevoUsuario = biblioteca.new Usuario(nombre, documento, telefono);
        biblioteca.getUsuarios().add(nuevoUsuario);
        System.out.println("Usuario agregado exitosamente.");
    }

    public void Gestion_menu() {
        int opc;

        do {
            System.out.println("1. Nuevo Usuario.");
            System.out.println("2. Consultar usuario.");
            System.out.println("3. Modificar usuario.");
            System.out.println("4. Eliminar usuario.");
            System.out.println("5. Volver al menú principal.");
            System.out.print("Ingrese una opción: ");

            opc = sc.nextInt();
            sc.nextLine(); 

            switch (opc) {
                case 1: crearNuevoUsuario(); break;
                case 2: consultarUsuario(); break;
                case 3: modificarUsuario(); break;
                case 4: eliminarUsuario(); break;
                case 5: System.out.println("Volviendo al menú principal..."); break;
                default:System.out.println("Opción inválida.");
            }
        } while (opc != 5);
    }

    public void programadoras() {
        System.out.println("Laura Sofía López - 2363055");
        System.out.println("Laura Valentina Galvez - 2363192");
    }

    public void menu() {
        int opc;
        do {
            System.out.println("1. Gestión de Usuario.");
            System.out.println("2. Listados.");
            System.out.println("3. Estadísticas.");
            System.out.println("4. Acerca de programadoras.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese una opción: ");

            opc = sc.nextInt();
            sc.nextLine(); 

            switch (opc) {
                case 1: Gestion_menu(); break;
                case 4: programadoras(); break;
                case 5: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opc != 5);
    }

    public static void main(String[] args) {
        Lab1224 gs = new Lab1224();
        gs.menu();
    }
}