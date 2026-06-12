package paolof16.entities;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException (String message){
        System.out.println("Element not found" + message);
    }
}
