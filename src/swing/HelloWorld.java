/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author adminctri
 */
import javax.swing.JFrame;

public class HelloWorld extends JFrame {
    
    public HelloWorld(){
        setSize(200, 300);
        setTitle("Hello World");
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        HelloWorld myHello = new HelloWorld();
    }
}
