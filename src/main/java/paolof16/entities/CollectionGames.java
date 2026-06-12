package paolof16.entities;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

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
        Game gameFound = collectionGames.stream().filter(game -> game.getId() == idGame).findFirst().orElseThrow(()-> new ElementNotFoundException("Game not found" + idGame));
        System.out.println(gameFound);
    }
    public static void searchByprice(){
        System.out.println("Insert the price range:");
        double priceGame = SCANNER.nextDouble();
        List gamesbyPrice = collectionGames.stream().filter(game -> game.getPrice() <= priceGame).toList();
        System.out.println(gamesbyPrice);
    }
    public static void searchByplayers(){
        System.out.println("Insert the number of players:");
        int nPlayers = SCANNER.nextInt();
        List<BoardGame> gameXplayers =collectionGames.stream().filter(game -> game instanceof BoardGame).map(game -> (BoardGame)game).filter(boardGame -> boardGame.getMinPlayers() <= nPlayers && boardGame.getMaxPlayers() >= nPlayers)
                .toList();
        System.out.println(gameXplayers);
    }
    public static void deleteID(){
        System.out.println("Insert ID");
        long idForDelete = SCANNER.nextLong();
        boolean idExist = collectionGames.stream()
                .anyMatch(game -> game.getId() == idForDelete);
        try{
            if (idExist){
                collectionGames.remove(idForDelete);
                System.out.println("Element removed");
            }
        }
        catch (ElementNotFoundException e){
            System.out.println("Id non Trovato" + e.getMessage());

        }
    }
    public static void setByID(){
        System.out.println("Insert ID");
        long idToSet = SCANNER.nextLong();
        try{
            Game gametoUpdate = collectionGames.stream()
                    .filter(game -> game.getId() == idToSet)
                    .findFirst()
                    .orElseThrow(()-> new ElementNotFoundException("Game ID not found "));
            System.out.println("Insert new title");
            String newTitle = SCANNER.nextLine();
            gametoUpdate.setTitle(newTitle);
            System.out.println("Title updated succesfully");
            SCANNER.nextLine();
            System.out.println("Insert a new Price");
            int newPrice = SCANNER.nextInt();
            gametoUpdate.setPrice(newPrice);
            System.out.println("Price updated succesfully");
            System.out.println("Insert a publish year");
            int newYear = SCANNER.nextInt();
            gametoUpdate.setPublishYear(newYear);
            System.out.println("Year updated succesfully");


        }
        catch (ElementNotFoundException e){
            System.out.println("Id non Trovato" + e.getMessage());

        }
    }

    public static void printAllStatsGames (){
        long totalVideoGames = collectionGames.stream()
                .filter(game -> game instanceof VideoGame)
                .count();

        long totalBoardGames = collectionGames.stream()
                .filter(game -> game instanceof BoardGame)
                .count();
        System.out.println(totalVideoGames);
        System.out.println(totalBoardGames);
    }

    public static void printMaxPriceGame(){
        Game mostExpensive = collectionGames.stream()
                .max(Comparator.comparingDouble(game -> game.getPrice()))
                .orElseThrow(()-> new ElementNotFoundException("No games found"));
        System.out.println("The most expensive game is : "+ mostExpensive);
    }
    public static void printAveragePrice(){
        double averagePrice = collectionGames.stream()
                .mapToDouble(game -> game.getPrice())
                .average()
                .orElse(0.0);
        System.out.println("The average price is: " + averagePrice);
    }

}
