/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author gt
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //target of abstraction code organization through collect common attributes or methods in one abstract class and through inheritance principle , all childs can implement their own code
        Cat c1 = new Cat();
        c1.play();
        Dog c2 = new Dog();
        c2.play();
    }
    
}
