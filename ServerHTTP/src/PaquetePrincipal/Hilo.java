/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePrincipal;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author friki
 */
public class Hilo extends Thread{
    private Socket socketCliente;

    public Hilo(Socket socketCliente) {

        this.socketCliente = socketCliente;

}
    
    
    public void run() {

    try{
      
        ServidorHTTP.procesaPeticion(socketCliente);
        //cierra la conexión entrante
        socketCliente.close();
        System.out.println("cliente atendido");
          
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    
  }

}

