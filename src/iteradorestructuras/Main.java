/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorestructuras;

import java.util.Iterator;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("============== ARRAYLIST ==============");
        ArrayListPersonas arrayListPersonas = new ArrayListPersonas();
        IIterator<Persona> iterador1;
        Persona persona1;
        
        arrayListPersonas.getListaPersonas().add(new Persona(1, "Diego", 30));
        arrayListPersonas.getListaPersonas().add(new Persona(2, "Carlos", 25));
        arrayListPersonas.getListaPersonas().add(new Persona(3, "Gunther", 20));
        
        iterador1 = arrayListPersonas.createIterator();
        while (iterador1.hasNext()) {
            persona1 = iterador1.next();
            System.out.println(persona1.toString());
        }
        System.out.println("=======================================");
        
        System.out.println("=========== ARRAY ESTATICO ============");
        Persona per1 = new Persona(1, "Jose", 35);
        Persona per2 = new Persona(2, "Ricardo", 17);
        Persona per3 = new Persona(3, "Maria", 26);
        Persona[] list = {per1,per2,per3};
        ArrayPersonas arrayPersonas = new ArrayPersonas(list);
        IIterator<Persona> iterador2;
        iterador2 = arrayPersonas.createIterator();
        Persona persona2;
        while (iterador2.hasNext()) {
            persona2 = iterador2.next();
            System.out.println(persona2.toString());
        }
        System.out.println("=======================================");
        
        System.out.println("============= LINKEDLIST ==============");
        LinkedListPersonas linkedListPersonas = new LinkedListPersonas();
        IIterator<Persona> iterador3;
        Persona persona3;
        
        linkedListPersonas.getListaPersonas().add(new Persona(1, "Fernando", 70));
        linkedListPersonas.getListaPersonas().add(new Persona(2, "Noelia", 65));
        linkedListPersonas.getListaPersonas().add(new Persona(3, "Karina", 18));
        
        iterador3 = linkedListPersonas.createIterator();
        while (iterador3.hasNext()) {
            persona3 = iterador3.next();
            System.out.println(persona3.toString());
        }
        
        System.out.println("=======================================");
        
        System.out.println("============== HASHMAP ================");
        
        HashMapPersonas hashMapPersonas = new HashMapPersonas();
        IIterator<Persona> iterador4;
        Persona persona4;
    
        hashMapPersonas.getMapPersonas().put(1,new Persona(1, "Fernando", 70));
        hashMapPersonas.getMapPersonas().put(2,new Persona(2, "Noelia", 65));
        hashMapPersonas.getMapPersonas().put(3,new Persona(3, "Karina", 18));

        iterador4 = hashMapPersonas.createIterator();
        while (iterador4.hasNext()) {
            persona4 = iterador4.next();
            System.out.println(persona4.toString());
        }
        System.out.println("=======================================");
    }
}
