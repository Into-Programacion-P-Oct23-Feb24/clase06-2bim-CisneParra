/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String direccion;
        String empresa;
        String trabajo;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        empresa = DatoTrabajo.obtenerEmpresa();
        direccion = DatoTrabajo.obtenerDireccion();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        trabajo = String.format("Nombre de la empresa: %s\nDirección de la"
                + " empresa: %s\n", empresa,
                direccion);
        String notas = "";
        for (int i = 0; i < misNotas.length; i++) {
            notas = String.format("%s%.2f-", notas, misNotas[i]);
        }

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "TRABAJA EN: \n%s"
                + "Con notas: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                trabajo,
                notas,
                promedio);
    }

}
