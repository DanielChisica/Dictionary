/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This packages lodges the logic configuration of the program
 */
package Logic;



/**
 * This class determines the dictionary logic
 * 
 * @author Daniel Jimenez
 * @version 1.0
 * @since February 19
 */
public class DictionaryLogic {
    
    /**
     * Gets the String with the dictionary words
     * 
     * @return The words of the dictionary
     */
    public String getDictionary() {
        return dictionary;
    }
    
    /**
     * Sets the String with the dictionary words
     * 
     * @param dictionary The string with the words
     */
    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }
    
    /**
     * Gets the dictionary set
     * 
     * @return the set with the dictionary words
     */
    public Conjunt getConjunctDictionary() {
        return conjunctDictionary;
    }
    
    /**
     * Modifies the dictionary set
     * 
     * @param conjunctDictionary the set with the dictionary words
     */
    public void setConjunctDictionary(Conjunt conjunctDictionary) {
        this.conjunctDictionary = conjunctDictionary;
    }
    
    /**
     * Gets the user input message
     * 
     * @return the user input message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Establish the user input message
     * 
     * @param message The words that the user inputs
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Gets the set with the user input message
     * 
     * @return the set of the user input words
     */
    public Conjunt getMessageConjuct() {
        return messageConjuct;
    }
    
    /**
     * Sets the set with the user input message
     * @param messageConjuct the set of the user input words
     */
    public void setMessageConjuct(Conjunt messageConjuct) {
        this.messageConjuct = messageConjuct;
    }
    
    private Conjunt conjunctDictionary;//The set corresponding to the dictionary
    
    //The string with the words of the dictionary
    private String dictionary="class,object,inheritance,extends,serializable,"
            + "superclass,abstract,data,java,application,code,program,frame"
            + ",interface,method,modular,sets,algorithm,tree,list";     //
    
    private String message; //String woth the input words
    
    private Conjunt messageConjuct;         //Set with the input words
    
    public String Parts2[]=dictionary.split(",");  //Split the dictionary String
       
       
    
}
