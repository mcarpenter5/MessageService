/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import java.util.Random;
//import javax.swing.JOptionPane; 

/**
 *
 * @author dominicalaus
 */
public class RandomInput implements MessageInput {

    @Override
    public String getMessage() {
    String [] messages = {"Welcome to our website!", "Go Packers Go!", "Go Brewers Go!", "Advanced Java is Awesome!", "Random message generator!"};
         Random r = new Random(System.nanoTime());
    
    int select = r.nextInt(messages.length);
       
          return messages[select];
    }
    
    
    
}
