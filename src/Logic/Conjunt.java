/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Interfaces.TADConjuntable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The class Conjunt implements the interface TADConjuntable, with their methods
 * based in the set operations, also this class contains owned attributes
 * and methods
 * 
 * @author Daniel Jimenez
 * @version 1.0
 * @since February 19
 */
public class Conjunt implements TADConjuntable {

    /**
     * Get the data inside the array data[]
     * 
     * @return the array data
     */
    public Object[] getData() {
        return data;
    }

    /**
     * Modifies the array data[]
     * 
     * @param data: The array that represents a set
     */
    public void setData(Object[] data) {
        this.data = data;
    }

    /**
     * Constructor of a set with capacity for 20 elements
     */
   public Conjunt(){
        this(20);
    }
   
   /**
    * Constructor of a set with capacity for indicated elements, if the
    * introduced size is less than zero, builds a set with capacity for twenty
    * objects
    * 
    * @param size The size of the set
    */
    public Conjunt(int size){
      data = new Object[size<=0 ? 20 : size]; //Otra forma de if dentro de la linea
        for (int i = 0; i < data.length; i++) {
            data[i]=null;   
        }
        nElements = 0;
    }
    
    /**
     * Constructor of a clone
     * 
     * @param C Set taken like a base to be cloned
     */
    public Conjunt(Conjunt C){
        data = new Object[C.data.length];
        for (int i = 0; i < C.data.length; i++) {
            data[i] = C.data[i];
        }
            nElements = C.nElements;
    }

    
    
    private Object[] data;                  //Array to stock our data
    
    
    private int nElements;                  //accountant of elements number 
    
    
     /**
     * Shows if the set is empty
     * 
     * @return True if is empty, false if isn't
     */
    @Override
    public boolean isEmpty() {
        return nElements<=0;
    }

    /**
     * Calculates how many elements there are in the set
     * 
     * @return A int value with the size
     */
    @Override
    public int size() {
       return nElements;
    }
    
    /**
     * Empty the set
     */
    @Override
    public void Empty() {
       nElements=0;
    }
    
    /**
     * Method used for add a element to the set
     * 
     * @param element element to be added
     */
    @Override
    public void add(Object element) {
       if(!contains(element)){
           if (nElements>=data.length) {
               growArray();
           }
           data[nElements++]=element;
       }
    }
    
    /**
     * Method to determine if a element belongs into the set
     * 
     * @param element to evaluate if is in the set
     * @return boolean: True if the set contains such element, false if isn't
     */
    @Override
    public boolean contains(Object element) {
        if(!isEmpty()){
            for (int i = 0; i <nElements; i++) {
                if(data[i].equals(element)){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Method used for get the join of two sets
     * 
     * @param c Set to be merged
     * @return TADConjuntable: Set composed by the merge
     */
    @Override
    public TADConjuntable merge(TADConjuntable c) {
        Conjunt conjuntMerge= new Conjunt(this);
        Iterator iterator=c.iterator();
        while (iterator.hasNext()) {            
            conjuntMerge.add(iterator.hasNext());
        }
        return conjuntMerge;
    }
    
    /**
     * Gets the difference between two sets
     * 
     * @param c Set that is going to be compared for see the difference
     * @return Conjunt: Set that is a result of the difference between 
     * two sets
     */
    public Conjunt Difference(Conjunt c) {
       Conjunt difference= new Conjunt(this);
       Iterator iterator=iterator();
            while (iterator.hasNext()) {            
            Object next=iterator.next();
                if (c.contains(next)) {
                    difference.Empty();
                }
        }
        return difference;
    }
    
    /**
     * Gets the intersection between two sets
     * 
     * @param C: Set that is going to be intersected
     * @return Conjunt: Set with the similar objects of the two sets
     */
    public Conjunt Intersection(Conjunt C) {
        Conjunt intersection= new Conjunt(this);
        Iterator itreceived= iterator();
            while (itreceived.hasNext()) {            
                 Object next=itreceived.next();
                 if (!C.contains(next)) {
                    intersection.Empty();
                }
        }
        
        return intersection;
    }
    
    /**
     * Shows if the set is contained into the other
     * 
     * @param c Set to be tested if it's a subset of the other
     * @return boolean: True if is subset, false if isn't
     */
    @Override
    public boolean subconjunto(TADConjuntable c) {
        Iterator iterator=iterator();
        while (iterator.hasNext()) {            
            Object next= iterator.next();
            if (!c.contains(next)) {
                return false;
            }
            
        }
        return true;
    }
    
    /**
     * Method to make a iterator about a set
     * 
     * @return Iterator Iterator about the set
     */
    @Override
    public Iterator iterator() {
        return new myIterator();
    }
    
    /**
     * Deletes a element of the set
     * 
     * @param element: Object that will deleted of the set 
     */
    @Override
    public void delete(Object element) {
        if(!isEmpty()){
            for (int i = 0; i <nElements; i++) {
               if(data[i].equals(element)){ 
                data[i]=data[nElements--];
                break;
               }
               }
               
        }
    }
    
    /**
     * Increase the set capacity with 10 more positions
     */
    public void growArray(){
        int newSize=data.length+10;
        Object[] New= new Object[newSize];
        for (int i = 0; i < nElements; i++) {
            New[i]=data[i];
        }
        data=New;
    }

    @Override
    public TADConjuntable Dif(TADConjuntable c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TADConjuntable Intersetion(TADConjuntable C) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This Class implements the Iterator interface and add the position
     * attribute
     */
    private class myIterator implements Iterator{
        
        
        private int pos;        //Index for walk through the set
        
        /**
         * Declares a new iterator
         */
        public myIterator() {
            pos=0;
        }
        
        /**
         * Shows if there are still elements in the set
         * 
         * @return boolean True if there are elements, false if there aren't
         */
        @Override
        public boolean hasNext() {
            return (pos<nElements);
        }
        
        /**
         * Return the next element in the set and advance the position index
         * 
         * @return The next object in the set
         * @throws NoSuchElementException : Obtained exception when there aren't
         * elements in the set
         */
        @Override
        public Object next() throws NoSuchElementException{
            if (hasNext())
                return data[pos++];
            throw new NoSuchElementException("No hay elementos en el conjunto");
        }
        
        /**
         * Not implemented operation
         */
        @Override
        public void remove() {
            Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
