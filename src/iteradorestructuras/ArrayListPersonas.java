/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorestructuras;

/**
 *
 * @author Carlos
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListPersonas implements IContainer<Persona>{
    
    private List<Persona> listapersona = null;  // Campo de la clase

    public ArrayListPersonas() {
        listapersona = new ArrayList<Persona>();
    }  // Constructor de la clase

    public List<Persona> getListaPersonas() {
        return listapersona;
    } //Omitimos otros métodos

    @Override
    public IIterator<Persona> createIterator() {
        return new IteradorArrayListPersonas();
    } // Método de la clase

    @Override
    public String toString() {
        return listapersona.toString();
    }  // Método de la clase

    
    protected class IteradorArrayListPersonas implements IIterator<Persona> { // Clase interna
        public int posicion = 0;
        @Override
        public boolean hasNext() {
            return posicion < listapersona.size();
        }  // Método
        @Override
        public Persona next() {  // Método
            Persona res = listapersona.get(posicion); // Creamos un objeto Persona igual al que recorremos
            posicion++;
            return res;
        }
    } // Cierre de la clase interna
}
