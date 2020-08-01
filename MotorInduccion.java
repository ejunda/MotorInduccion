/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorinduccion;

interface MotorMonofasico{
    public default void Diagnostico_falla_motor(){
        System.out.println("El Diagnóstico de las fallas de motores de inducción "
         + "se realiza mediante la utilización de Redes neuronales");
    }
}
interface MotorTrifasico{
    public default void Diagnostico_falla_motor(){
        System.out.println("El Diagnóstico de las fallas de motores de inducción "
                + " se realiza mediante la utilización de codigo de colores con redes neuronales");
    }
}

/**
 *
 * @author Erick Unda
 */
public class MotorInduccion  implements MotorMonofasico,MotorTrifasico{

     /*@Override
    public void Diagnostico_falla_motor(){
        //se puede elegir la implementacion de una interfaz
        //por ejemplo ,escogemos que sea MotorMonofasico
        MotorMonofasico.super.Diagnostico_falla_motor();
    }*/

    @Override
    public void Diagnostico_falla_motor(){
    //se puede elegir la implementacion de una interfaz
    //por ejemplo,escogemos que sea VehiculosMotorInducción
    MotorTrifasico.super.Diagnostico_falla_motor();

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("____________________________________________________________");
        System.out.println("---------[UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE]---------");
        System.out.println("ASIGNATURA: PROGRAMACION");
        System.out.println("DOCENTE: ING. LUIS ALBERTO GUERRA CRUZ");
        System.out.println("NRC: 7450");
        System.out.println("ESTUDIANTE: ERICK UNDA");
        System.out.println("\tDIAGNOSTICO DE FALLAS MOTOR DE INDUCCIÓN");
                MotorInduccion vehiculo=new  MotorInduccion();
        vehiculo.Diagnostico_falla_motor();
    }

}
