/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m4.irenyafortin.pkg202410060535;

/**
 *
 * @author IRENYA FORTIN
 */
import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private final List<Empleado> Empleados;
    int total;
    
    public GestorEmpleados() {
        Empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        Empleados.add(empleado);
        System.out.println("Empleado " +empleado.getNombre()+ " agregado correctamente");
    }

    public void mostrarEmpleados() {
        if (Empleados.isEmpty()) {
            System.err.println("La lista esta vacia, agregue un empleado");
            System.out.println("------------------------------------------------------");
        } else {
            System.out.println("----Lista de Empleados----");
            for (Empleado empleado : Empleados) {
                empleado.mostrarInformacionEmpleado();
                total = total + 1;
            }
            if (total==1){
            System.out.println("Total de empleados creados: " + total);
            }else{
               System.out.println("Total de empleados creados: " + (total-1)); 
            }
        }
    }
}