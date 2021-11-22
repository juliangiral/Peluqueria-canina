
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    ClienteJpaController clienteJPA = new ClienteJpaController();
    
    public void crearCliente(Cliente cli){
        try {
            clienteJPA.create(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha podido crear al cliente.");
        }
    }    

    public void eliminarCliente(int idCliente) {
        try {
            clienteJPA.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha podido eliminar al cliente.");
        }
        
    }


    public void modificarCliente(Cliente cliente3) {
        try {
            clienteJPA.edit(cliente3);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha podido mofidicar al cliente.");
        }
    }

    public List<Cliente> traerClientes() {
        List <Cliente> listaClientes = clienteJPA.findclienteEntities();
        return listaClientes;
    }

    public Cliente traerClienteEspecifico(int id) {
        Cliente clientee = clienteJPA.findcliente(id);
        return clientee;
    }
}
