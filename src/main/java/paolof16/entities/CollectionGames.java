package paolof16.entities;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import paolof16.entities.Game;
import paolof16.exceptions.ElementNotFoundException;
import paolof16.exceptions.idDuplicateException;


public class CollectionGames{
   public static List<Game> collectionGames = new ArrayList<>();
   public static final Scanner SCANNER = new Scanner(System.in);


    public static String getCollectionGames() {
        return collectionGames.toString();
    }

    public static void stampaElementi(){
        for (Game allGames : collectionGames){
            System.out.println(allGames.toString());
        }

    }

    @Override
    public String toString() {
        return "CollectionGames{}";
    }

    public static void checkerID (){
        System.out.println("Insert ID");
        long idGame = SCANNER.nextLong();
        boolean idExist = collectionGames.stream()
                .anyMatch(game -> game.getId() == idGame);
        try{
            if (idExist){
                throw new idDuplicateException("The id is already exists in the system");
            }
        }
        catch (idDuplicateException e){
            System.out.println(e.getMessage());
        }
    }
    public static void searchID(){
        System.out.println("Insert ID");
        long idGame = SCANNER.nextLong();
        Optional<Game> searchId = collectionGames.stream().filter(game -> game.getId() == idGame).findFirst();


    }
}
