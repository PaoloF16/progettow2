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
    public static void createGame(){
        while (true){
            System.out.println("""
            Program menu:
            1 - To create video Game
            2 - To create board Game
            q - Exit
            """);
            String option = SCANNER.nextLine();
            switch (option){
                case "1" -> createVideoGame();
                case "2" -> createTableGame();
                case "q","Q" -> {
                    System.out.println("Exit program");
                    System.out.println("Exiting update menu...");
                    return;
                }
                default -> System.out.println("Option non valid");
            }
        }


    }
    public static void createVideoGame (){
        System.out.println("Insert the name the videogame");
        String title = SCANNER.nextLine();
        System.out.println("Enter the year release number ");
        int releasedYear = SCANNER.nextInt();
        System.out.println("Enter a price");
        double price = SCANNER.nextDouble();
        System.out.println("Insert the platforms");
        String platform = SCANNER.nextLine();
        System.out.println("Insert a genre");
        System.out.println("""
                Choose the list
                ACTION
                STRATEGY
                SHOOTERS
                RPG
                MOBA
                CARDS
                TRPG
                PUZZLES
                BOARDGAME
                """);
            GameType genre = GameType.valueOf(SCANNER.nextLine());
        System.out.println("Insert a ID");
        long id = SCANNER.nextLong();
        Game myVideoGame = new VideoGame(title,releasedYear,price,platform,genre,id);
        System.out.println("Game Created succesfully");
        System.out.println(myVideoGame);
    }
    public  static void createTableGame(){
        System.out.println("Insert the name the BoardGame");
        String title = SCANNER.nextLine();
        System.out.println("Enter the year release number ");
        int releasedYear = SCANNER.nextInt();
        System.out.println("Enter a price");
        double price = SCANNER.nextDouble();
        System.out.println("Insert the MIN # players");
        int minplayers = SCANNER.nextInt();
        System.out.println("Insert the MAX # players");
        int maxplayers = SCANNER.nextInt();
        System.out.println("Insert the time to play");
        int timeplay = SCANNER.nextInt();
        System.out.println("Insert a ID");
        long id = SCANNER.nextLong();
        Game myVideoGame = new BoardGame(title,releasedYear,price,minplayers,maxplayers,timeplay,id);
        System.out.println("Game Created succesfully");
        System.out.println(myVideoGame);
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
        SCANNER.nextLine();

        try{
            Game gametoUpdate = collectionGames.stream()
                    .filter(game -> game.getId() == idToSet)
                    .findFirst()
                    .orElseThrow(()-> new ElementNotFoundException("Game ID not found "));


            while (true){
                System.out.println("""
            Program menu:
            1 - To set new Title
            2 - To set Year
            3 - To set Price
            q - Exit
            """);

                String option = SCANNER.next();
                SCANNER.nextLine();
                switch (option) {
                    case "1" -> {
                        System.out.println("Insert new title");
                        String newTitle = SCANNER.nextLine();
                        gametoUpdate.setTitle(newTitle);
                        System.out.println("Title updated successfully");
                    }
                    case "2" -> {
                        System.out.println("Insert new Year");
                        int newYear = SCANNER.nextInt();
                        gametoUpdate.setPublishYear(newYear);
                        System.out.println("Year updated successfully");
                    }
                    case "3" -> {
                        System.out.println("Insert a new Price");
                        double newPrice = SCANNER.nextDouble(); // Recuerda usar double para precios
                        gametoUpdate.setPrice(newPrice);
                        System.out.println("Price updated successfully");
                    }
                    case "q", "Q" -> {
                        System.out.println("Exiting update menu...");
                        return;
                    }
                    default -> System.out.println("Option non valid");
                }
            }
        }
        catch (ElementNotFoundException e){
            System.out.println("Id non Trovato: " + e.getMessage());
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
