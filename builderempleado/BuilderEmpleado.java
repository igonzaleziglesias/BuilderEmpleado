/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderempleado;

/**
 *
 * @author Usuario
 */
public class BuilderEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoBuilder miBuilder = new EmpleadoBuilder("Pepe","Villuelo","36001122E");
        miBuilder.setApellido2("Rodriguez");
        
        Empleado jefeTaller = new EmpleadoBuilder2("Pepe","Villuelo","36001122E")
                .setApellido2("Rodriguez")
                .setAltura(174)
                .crearEmpleado();
    }
    
}
