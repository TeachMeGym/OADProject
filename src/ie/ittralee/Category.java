/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

/**
 *
 * @author Sean Bawn
 */
public enum Category {
    
    ARMS, BACK, CHEST, LEGS, SHOULDERS;
   
    public String toString(){
        switch(this){
            case ARMS:      return "Arms";
            case BACK:      return "Back";
            case CHEST:     return "Chest";
            case LEGS:      return "Legs";
            case SHOULDERS: return "Shoulders";
        default:            return "";        
        }
    }
}
