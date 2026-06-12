package paolof16.exceptions;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException (String message){
        System.out.println("Element not found" + message);
    }
}
