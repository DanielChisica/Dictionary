/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This interface describes the methods to be used for the class Conjunt
 */
package Interfaces;

/**
 * Interface that describes the sets operations
 * 
 * @author Daniel Jimenez
 * @version 1.0
 * @since February 15
 */
public interface TADConjuntable {
    
    /**
     * Shows if the set is empty
     * 
     * @return True if is empty, false if isn't
     */
    public boolean isEmpty();
    
    /**
     * Calculates how many elements there are in the set
     * 
     * @return A int value with the size
     */
    public int size();
    
    /**
     * Empty the set
     */
    public void Empty();
    
    /**
     * Method used for add a element to the set
     * 
     * @param element element to be added
     */
    public void add(Object element);
    
    /**
     * Method to determine if a element belongs into the set
     * 
     * @param element to evaluate if is in the set
     * @return boolean: True if the set contains such element, false if isn't
     */
    public boolean contains(Object element);
   
    /**
     * Method used for get the join of two sets
     * 
     * @param c Set to be merged
     * @return TADConjuntable: Set composed by the merge
     */
    public TADConjuntable merge(TADConjuntable c);
    
    /**
     * Gets the difference between two sets
     * 
     * @param c Set that is going to be compared for see the difference
     * @return TADConjuntable: Set that is a result of the difference between 
     * two sets
     */
    public TADConjuntable Dif(TADConjuntable c);
    
    /**
     * Gets the intersection between two sets
     * 
     * @param C: Set that is going to be intersected
     * @return TADConjuntable with the similar objects of the two sets
     */
    public TADConjuntable Intersetion(TADConjuntable C);
    
    /**
     * Shows if the set is contained into the other
     * 
     * @param c Set to be tested if it's a subset of the other
     * @return boolean: True if is subset, false if isn't
     */
    public boolean subconjunto(TADConjuntable c);
    
    /**
     * Deletes a element of the set
     * 
     * @param element: Object that will deleted of the set 
     */
    public void delete(Object element);
    
    /**
     * Method to make a iterator about a set
     * 
     * @return Iterator Iterator about the set
     */
    public java.util.Iterator iterator();
}
