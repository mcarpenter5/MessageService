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
public class MessageService {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        MessageInput input = new KeyboardInput();
        MessageOutput output = new KeyboardOutput();
        
        
        MessageManager m = new MessageManager(input,output);
        m.processMessage();
        
    }
    
}
