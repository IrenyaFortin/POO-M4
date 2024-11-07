/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2.m4.irenyafortin.pkg202410060535;

import java.util.Scanner;

/**
 *
 * @author IRENYA FORTIN
 */
public class POOP2M4IRENYAFORTIN202410060535 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner datosentrada = new Scanner(System.in);
       
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        int salida=0;
        String nombre;
        int edad;
        double salario;

        while (salida==0) {
            System.out.println("---Sistema de gestion de empleados IREN INC.----------");
            System.out.println("Ingrese el numero de la opcion es escoger");
            System.out.println("1. Agregar nuevo empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = datosentrada.nextInt();
            System.out.println("------------------------------------------------------");

            switch (opcion) {
                case 1 -> {
                    datosentrada.nextLine();  
                    System.out.print("Se ingresara nuevo empleado,");
                    System.out.println("ingrese el nombre completo ");
                    nombre = datosentrada.nextLine();
                    
                    System.out.println("Ingrese la edad ");
                    edad = datosentrada.nextInt();
                    
                    System.out.println("Ingrese el salario en Lempiras ");
                    salario = datosentrada.nextDouble();

                    Empleado empleado = new Empleado(nombre, edad, salario);
                    gestorEmpleados.agregarEmpleado(empleado);
               }

                case 2 -> gestorEmpleados.mostrarEmpleados();

                case 3 -> {
                    salida = 1;
                    System.out.println("------------------------------------------------------");
                    System.out.println("------------Gracias por usar el sistema---------------");
                    System.out.println("------------------------------------------------------");
               }

                default -> {
                    System.err.println("------------------------------------------------------");
                    System.err.println("OPCION INVALIDA.");
                    System.err.println("Debe ingresar una opcion entre 1 y 3.");
                    System.err.println("------------------------------------------------------");
               }
            }
            System.out.println();
        }
        
        datosentrada.close();
    }
}
    

