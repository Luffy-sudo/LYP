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

/*

In java, the final keyword is used to indicate that a variable,
In java, the final keyword is used to indicate that a variable,
method, or class cannot be modified or extended.

The ArrayList is a resizable array, which can be found in the
java.util package.

The difference between a built-in array and an ArrayList in Java,
is that the size of an array cannot be modified (if you want to
add or remove elements to/from an array, you have to create a new
one). While elements can be added and removed from an ArrayList
whenever you want.

*/

class GestorPlanCuidado {
    final ArrayList<PlanCuidadoEnfermeria> planesCuidado;

    public GestorPlanCuidado() {
        planesCuidado = new ArrayList<>();
    }

    public void verPlanesCuidado() {
        StringBuilder listaPlanes = new StringBuilder("Planes de Cuidado Existentes:\n\n");

        if (planesCuidado.isEmpty()) {
            listaPlanes.append("Aún no se han creado planes de cuidado.");
        } else {
            for (int i = 0; i < planesCuidado.size(); i++) {
                PlanCuidadoEnfermeria plan = planesCuidado.get(i);
                listaPlanes.append(plan.toString()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, listaPlanes.toString());
    }

    public void crearPlanCuidado() {
        String nombrePaciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        if (nombrePaciente == null) {
            return;
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));

        String lugarProcedencia = JOptionPane.showInputDialog("Ingrese el lugar de procedencia del paciente: ");
        if (lugarProcedencia == null) {
            return;
        }

        String lugarResidencia = JOptionPane.showInputDialog("Ingrese el lugar de residencia del paciente: ");
        if (lugarResidencia == null) {
            return;
        }

        String direccionResidencia = JOptionPane.showInputDialog("Ingrese la dirección de residencia del paciente: ");
        if (direccionResidencia == null) {
            return;
        }

        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del paciente: "));

        String estadoCivil = JOptionPane.showInputDialog("Ingrese el estado civil del paciente: ");
        if (estadoCivil == null) {
            return;
        }

        String ocupacion = JOptionPane.showInputDialog("Ingrese la ocupación del paciente: ");
        if (ocupacion == null) {
            return;
        }
        
        String nivelEscolaridad = JOptionPane.showInputDialog("Ingrese el nivel de escolaridad del paciente: ");
        if (nivelEscolaridad == null) {
            return;
        }
        
        String tipoAfiliacion = JOptionPane.showInputDialog("Ingrese el tipo de afiliación del paciente: ");
        if (tipoAfiliacion == null) {
            return;
        }
        String religion = JOptionPane.showInputDialog("Ingrese la religión del paciente: ");
        if (religion == null) {
            return;
        }
        String enfermedadActual = JOptionPane.showInputDialog("Ingrese la enfermedad actual del paciente: ");
        if (enfermedadActual == null) {
            return;
        }
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso del paciente: "));

        float talla = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la talla del paciente: "));

        String presionArterial = JOptionPane.showInputDialog("Ingrese la presión arterial del paciente: ");
        if (presionArterial == null) {
            return;
        }

        int frecuenciaCardiaca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la frecuencia cardiaca del paciente: "));

        int frecuenciaRespiratoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la frecuencia respiratoria del paciente: "));

        float temperatura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la temperatura del paciente: "));

        ArrayList<String> tareasCuidado = null;
        ArrayList<String> antecedentesPersonales = null;
        ArrayList<String> antecedentesFamiliares = null;
        ArrayList<String> antecedentesQuirurgicos = null;
        ArrayList<String> antecedentesAlergicos = null;
        ArrayList<String> antecedentesToxicologicos = null;
        
        PlanCuidadoEnfermeria planCuidado = new PlanCuidadoEnfermeria(nombrePaciente, edad, lugarProcedencia, lugarResidencia, direccionResidencia, telefono, estadoCivil, ocupacion, nivelEscolaridad, tipoAfiliacion, religion, enfermedadActual, peso, talla, presionArterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperatura);

        while (true) {
            Object[] opciones = { "1. Agregar Tarea de Cuidado", "2. Agregar Antecedentes", "3. Finalizar Plan de Cuidado" };
            int eleccion = JOptionPane.showOptionDialog(null, "Plan de Cuidado de Enfermería para " + nombrePaciente, "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:
                    String tarea = JOptionPane.showInputDialog("Ingresa una tarea de cuidado:");
                    if (tarea != null) {
                        planCuidado.agregarTareaCuidado(tarea);
                    }
                    break;
                case 1:
                    recolectarAntecedentes(planCuidado);
                    break;
                case 2:
                    planesCuidado.add(planCuidado);
                    JOptionPane.showMessageDialog(null, "Plan de cuidados creado para " + nombrePaciente);
                    return;
                default:
                    return;
            }
        }
    }
    
    private void recolectarAntecedentes(PlanCuidadoEnfermeria planCuidado) {
        while (true) {
            Object[] opcionesAntecedentes = {
                "1. Antecedentes Personales",
                "2. Antecedentes Familiares",
                "3. Antecedentes Quirúrgicos",
                "4. Antecedentes Alérgicos",
                "5. Antecedentes Toxicológicos",
                "6. Finalizar Recolección de Antecedentes"
            };

            int eleccion = JOptionPane.showOptionDialog(null, "Selecciona el tipo de Antecedentes a agregar:", "Recolección de Antecedentes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesAntecedentes, opcionesAntecedentes[0]);

            if (eleccion == -1 || eleccion == opcionesAntecedentes.length - 1) {
                break;
            }
            
            String antecedente = JOptionPane.showInputDialog("Ingrese el antecedente:");
            if (antecedente != null) {

                switch (eleccion) {
                    case 0:
                        planCuidado.agregarAntecedente(TipoAntecedentes.PERSONALES, antecedente);
                        break;
                    case 1:
                        planCuidado.agregarAntecedente(TipoAntecedentes.FAMILIARES, antecedente);
                        break;
                    case 2:
                        planCuidado.agregarAntecedente(TipoAntecedentes.QUIRURGICOS, antecedente);
                        break;
                    case 3:
                        planCuidado.agregarAntecedente(TipoAntecedentes.ALERGICOS, antecedente);
                        break;
                    case 4:
                        planCuidado.agregarAntecedente(TipoAntecedentes.TOXICOLOGICOS, antecedente);
                        break;
                }
            }    

        }
    }
}
