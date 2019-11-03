/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo;

/**
 *
 * @author Luis Manuel
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     *
     * Creadas 3 configuraciones de parametros Mal Estudio,Normal Estudio y Buen Estudio
     */
    public static void main(String[] args) {

        // Control para que el numero de parametros sea el correcto
        if (args.length == 3) {
            System.out.println("Estudiante : " + args[0]);
            System.out.println(veredicto(args[1], args[2]) + "\n");
        } else {
            System.out.println("Debe introducir 3 parametros en ejecución:"
                    + "\n -Nombre \n -Numero de Modulos \n -Horas semanales de estudio\n");
        }
    }

    static private String veredicto(String valor1, String valor2) {
        // valor1= numero de modulos matriculados
        // valor2= horas de estudio semanales

        // media de horas dedicada a cada modulo
        int horasModulo;

        // para evitar error division, evito que modulos sea 0
        if (Integer.valueOf(valor1) == 0) {
            return ("No estas matriculado en ningun modulo");
        }

        horasModulo = Integer.valueOf(valor2) / Integer.valueOf(valor1);

        if (horasModulo <= 2) {
            return "Poco tiempo de estudio, solo " + horasModulo + " horas semanales, debes dedicar más tiempo.";
        } else if (horasModulo <= 4) {
            return ("Bien. Pero " + horasModulo + " horas de estudio semanal para cada módulo puede ser insuficiente.");
        } else {
            return "Ideal, " + horasModulo + " horas semanales. Trabajas los contenidos en casa.";
        }

    }

}
