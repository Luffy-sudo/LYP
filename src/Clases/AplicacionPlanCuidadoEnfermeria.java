/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author luffy
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AplicacionPlanCuidadoEnfermeria {
    public static void main(String[] args) {
        GestorPlanCuidado gestor = new GestorPlanCuidado();

        while (true) {
            Object[] opciones = { "1. Crear un Nuevo Plan de Cuidados", "2. Ver Planes de Cuidados Existentes", "3. Salir" };
            int eleccion = JOptionPane.showOptionDialog(null, "Sistema de Plan de Cuidados de Enfermería", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:
                    gestor.crearPlanCuidado();
                    break;
                case 1:
                    gestor.verPlanesCuidado();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    return;
            }
        }
    }
}
