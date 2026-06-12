package paolof16.exceptions;

public class idDuplicateException extends Exception {
    public idDuplicateException(String message){
        System.out.println("Id's duplicarted"+ message);
    }
}
