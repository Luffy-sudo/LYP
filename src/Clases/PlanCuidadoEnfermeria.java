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

// Define los tipos de Antecedentes utilizando un enum
enum TipoAntecedentes {
    PERSONALES, FAMILIARES, QUIRURGICOS, ALERGICOS, TOXICOLOGICOS
}

public class PlanCuidadoEnfermeria {
    private final String nombrePaciente;
    private final int edad;
    private final String lugarProcedencia;
    private final String lugarResidencia;
    private final String direccionResidencia;
    private final int telefono;
    private final String estadoCivil;
    private final String ocupacion;
    private final String nivelEscolaridad;
    private final String tipoAfiliacion;
    private final String religion;
    private final String enfermedadActual;
    private final float peso;
    private final float talla;
    private final String presionArterial;
    private final int frecuenciaCardiaca;
    private final int frecuenciaRespiratoria;
    private final float temperatura;
    private final ArrayList<String> tareasCuidado;
    private final ArrayList<String> antecedentesPersonales;
    private final ArrayList<String> antecedentesFamiliares;
    private final ArrayList<String> antecedentesQuirurgicos;
    private final ArrayList<String> antecedentesAlergicos;
    private final ArrayList<String> antecedentesToxicologicos;

    public PlanCuidadoEnfermeria(String nombrePaciente, int edad, String lugarProcedencia, String lugarResidencia,
            String direccionResidencia, int telefono, String estadoCivil, String ocupacion, String nivelEscolaridad,
            String tipoAfiliacion, String religion, String enfermedadActual, float peso, float talla,
            String presionArterial, int frecuenciaCardiaca, int frecuenciaRespiratoria, float temperatura) {
        
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.lugarProcedencia = lugarProcedencia;
        this.lugarResidencia = lugarResidencia;
        this.direccionResidencia = direccionResidencia;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.nivelEscolaridad = nivelEscolaridad;
        this.tipoAfiliacion = tipoAfiliacion;
        this.religion = religion;
        this.enfermedadActual = enfermedadActual;
        this.peso = peso;
        this.talla = talla;
        this.presionArterial = presionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.tareasCuidado = new ArrayList<>();
        this.antecedentesPersonales = new ArrayList<>();
        this.antecedentesFamiliares = new ArrayList<>();
        this.antecedentesQuirurgicos = new ArrayList<>();
        this.antecedentesAlergicos = new ArrayList<>();
        this.antecedentesToxicologicos = new ArrayList<>();
    }

    public void agregarTareaCuidado(String tarea) {
        tareasCuidado.add(tarea);
    }


    
    public void agregarAntecedente(TipoAntecedentes tipo, String antecedente) {
        switch (tipo) {
            case PERSONALES:
                antecedentesPersonales.add(antecedente);
                break;
            case FAMILIARES:
                antecedentesFamiliares.add(antecedente);
                break;
            case QUIRURGICOS:
                antecedentesQuirurgicos.add(antecedente);
                break;
            case ALERGICOS:
                antecedentesAlergicos.add(antecedente);
                break;
            case TOXICOLOGICOS:
                antecedentesToxicologicos.add(antecedente);
                break;
        }
    }

    @Override
    public String toString() {
        return "Paciente: " + nombrePaciente + "\n" +
               "Edad: " + edad + " años" + "\n" +
               "Lugar de Procedencia: " + lugarProcedencia + "\n" +
               "Lugar de Residencia: " + lugarResidencia + "\n" +
               "Dirección de Residencia: " + direccionResidencia + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Estado Civil: " + estadoCivil + "\n" +
               "Ocupación: " + ocupacion + "\n" +
               "Nivel de Escolaridad: " + nivelEscolaridad + "\n" +
               "Tipo de Afiliación: " + tipoAfiliacion + "\n" +
               "Religión: " + religion + "\n" +
               "Enfermedad Actual: " + enfermedadActual + "\n" +
               "Peso: " + peso + "kg" + "\n" +
               "Talla: " + talla + "m" + "\n" +
               "Presión Arterial: " + presionArterial + "mmHg" +"\n" +
               "Frecuencia Cardiaca: " + frecuenciaCardiaca + " lat./min" +"\n" +
               "Frecuencia Respiratoria: " + frecuenciaRespiratoria + " RPM" +"\n" +
               "Temperatura: " + temperatura + "°C" + "\n" +
               "Antecedentes Personales: " + antecedentesPersonales + "\n" +
               "Antecedentes Familiares: " + antecedentesFamiliares + "\n" +
               "Antecedentes Quirúrgicos: " + antecedentesQuirurgicos + "\n" +
               "Antecedentes Alérgicos: " + antecedentesAlergicos + "\n" +
               "Tareas de Cuidado: " + tareasCuidado + "\n" +                
               "Antecedentes Toxicológicos: " + antecedentesToxicologicos;
    }

}