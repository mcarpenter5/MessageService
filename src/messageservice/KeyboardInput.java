/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author dominicalaus
 */
public class KeyboardInput implements MessageInput {

    @Override
    public String getMessage() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a message: ");
        
    
        return s.nextLine();
        
    }
    
        
}
