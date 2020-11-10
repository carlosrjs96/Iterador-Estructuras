/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorestructuras;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class HashMapPersonas implements IContainer<Persona>{
    private HashMap<Integer,Persona> listapersona;  // Campo de la clase

    public HashMapPersonas() {
        listapersona = new HashMap<Integer,Persona>();
    }  // Constructor de la clase

    
    public HashMap<Integer,Persona> getMapPersonas() {
        return listapersona;
    } //Omitimos otros métodos
    
    @Override
    public IIterator<Persona> createIterator() {
        return new IteradorHashMapPersonas();
    } // Método de la clase

    @Override
    public String toString() {
        return listapersona.toString();
    }  // Método de la clase
    
    protected class IteradorHashMapPersonas implements IIterator<Persona> { // Clase interna
        public int posicion = 0;

        Iterator keyIterator=listapersona.keySet().iterator();   // iterate through keys
        @Override
        public boolean hasNext() {
            return posicion<listapersona.size();
            //return keyIterator.hasNext();
        }  // Método
        @Override
        public Persona next() {  // Método
            //Persona res = listapersona.get(posicion); // Creamos un objeto Persona igual al que recorremos
            posicion++;
            for (Integer p : listapersona.keySet()){
                if (p == posicion) {
                    return listapersona.get(p);
                }
            }
            return null;
            //return listapersona.get(keyIterator.next());
        }
    } // Cierre de la clase interna
}
