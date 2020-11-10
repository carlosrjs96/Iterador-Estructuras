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
public class ArrayPersonas implements IContainer<Persona>{

    public Persona[] listaPersonas; // Atributo de la clase

    public ArrayPersonas(Persona[] arrayPersonas) { // Constructor de la clase
        listaPersonas = arrayPersonas;
    }
   
    @Override
    public IIterator<Persona> createIterator() {
        return new IteradorArrayPersonas();
    } // Método de la clase

    protected class IteradorArrayPersonas implements IIterator<Persona> {

        protected int posicionarray;

        public IteradorArrayPersonas() {
            posicionarray = 0;
        }

        @Override
        public boolean hasNext() {
            boolean result;
            if (posicionarray < listaPersonas.length) {
                result = true;
            } else {
                result = false;
            }
            return result;
        }

        @Override
        public Persona next() {
            posicionarray++;
            return listaPersonas[posicionarray - 1];
        }
        
    }
}
