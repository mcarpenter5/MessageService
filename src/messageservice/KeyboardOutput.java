/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author dominicalaus
 */
public class KeyboardOutput implements MessageOutput {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message Sent!");
        System.out.print("Message Recieved:");
        System.out.println(message);
        
    }
}
