
package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearCliente(Cliente cli){
        controlPersistencia.crearCliente(cli);
    }
    
    public void crearCliente(String nombrePerro,String raza,String color,String alergico,String atencion,String nombreDuenio,
            String celular,String observaciones){
        
        Cliente cli = new Cliente();
        cli.setNombre_perro(nombrePerro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setEsAlergico(alergico);
        cli.setRequiereAtencionEspecial(atencion);
        cli.setNombre_duenio(nombreDuenio);
        cli.setCelular_duenio(celular);
        cli.setObservaciones(observaciones);
        
        controlPersistencia.crearCliente(cli);
    }
    //TERMINAR DE CREAR TODOE STO        
}
