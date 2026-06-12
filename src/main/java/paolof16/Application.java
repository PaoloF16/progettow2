package paolof16;

import paolof16.entities.BoardGame;
import paolof16.entities.Game;
import paolof16.entities.GameType;
import paolof16.entities.VideoGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static paolof16.entities.CollectionGames.*;

public class Application {

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("Hello World!");
        Game crash = new VideoGame("Crash Bandicoot", 2004,34.4,"PC PS5", GameType.ACTION,249);
        Game arcRaiders = new VideoGame("Arc Raiders",2025,23,"PC PS5",GameType.SHOOTERS,393);
        Game callofDuty = new VideoGame("Call of duty Black Ops",2011,25,"PC",GameType.SHOOTERS,46);
        Game littleNightmares = new VideoGame("Little Nightmares",2020,34.4,"PS4, PS5,PC",GameType.ACTION,405);
        Game grandtheftAutoV = new VideoGame("Grand Theft Auto V",2014,50,"PC PS5 PS4 XBOX",GameType.ACTION,514);
        Game mookiIsland = new BoardGame("Mooki Islan",2012,10.74,2,4,10,766);
        Game tacoVsBurrito = new BoardGame("Taco VS Burrito",2010,17.96,5,6,15,342);
        Game monopoly = new BoardGame("Monopoly",1990,31.46,2,8,120,678);
        Game eldenRing = new VideoGame("Elden Ring", 2022, 59.99, "PC PS5 XBOX", GameType.ACTION,432);
        Game cyberpunk = new VideoGame("Cyberpunk 2077", 2020, 49.99, "PC PS5", GameType.ACTION,954);
        Game doomEternal = new VideoGame("Doom Eternal", 2020, 39.99, "PC PS4 XBOX", GameType.SHOOTERS,612);
        Game haloInfinite = new VideoGame("Halo Infinite", 2021, 59.99, "PC XBOX", GameType.SHOOTERS,389);
        Game spiderMan2 = new VideoGame("Marvel's Spider-Man 2", 2023, 69.99, "PS5", GameType.ACTION,803);
        Game residentEvil4 = new VideoGame("Resident Evil 4 Remake", 2023, 59.99, "PC PS5 XBOX", GameType.ACTION,977);
        Game overwatch2 = new VideoGame("Overwatch 2", 2022, 0.0, "PC PS5 PS4 XBOX", GameType.SHOOTERS,720);
        Game rdr2 = new VideoGame("Red Dead Redemption 2", 2018, 59.99, "PC PS4 XBOX", GameType.ACTION,311);
        Game apexLegends = new VideoGame("Apex Legends", 2019, 0.0, "PC PS5 PS4 XBOX", GameType.SHOOTERS,506);
        Game godOfWar = new VideoGame("God of War Ragnarok", 2022, 69.99, "PS5 PS4 PC", GameType.ACTION,923);
        Game valorant = new VideoGame("Valorant", 2020, 0.0, "PC PS5", GameType.SHOOTERS,368);
        Game witcher3 = new VideoGame("The Witcher 3: Wild Hunt", 2015, 39.99, "PC PS5 PS4 XBOX", GameType.ACTION,779);
        Game destiny2 = new VideoGame("Destiny 2", 2017, 0.0, "PC PS5 XBOX", GameType.SHOOTERS,603);
        Game tlou2 = new VideoGame("The Last of Us Part II", 2020, 39.99, "PS4 PS5", GameType.ACTION,885);
        Game battlefield2042 = new VideoGame("Battlefield 2042", 2021, 59.99, "PC PS5 XBOX", GameType.SHOOTERS,449);
        Game catan = new BoardGame("Catan", 1995, 45.0, 2,4, 90,733);
        Game carcassonne = new BoardGame("Carcassonne", 2000, 35.0,2 ,5, 45,561);
        Game pandemic = new BoardGame("Pandemic", 2008, 40.0, 1,4, 45,128);
        Game ticketToRide = new BoardGame("Ticket to Ride", 2004, 48.0, 1,5, 60,992);
        Game dixit = new BoardGame("Dixit", 2008, 32.99, 1,6 ,30,250);
        Game explodingKittens = new BoardGame("Exploding Kittens", 2015, 20.0, 1,5, 15,671);
        Game unomundo = new BoardGame("Uno", 1971, 9.99, 1,10, 30,819);
        Game risk = new BoardGame("Risk", 1957, 34.99, 1,6, 120,395);
        Game scythe = new BoardGame("Scythe", 2016, 79.99, 2,5, 115,213);
        Game azul = new BoardGame("Azul", 2017, 39.99, 1,4, 45,32435);
        //=========================================================================================================//

        collectionGames.add(crash);
        collectionGames.add(arcRaiders);
        collectionGames.add(callofDuty);
        collectionGames.add(littleNightmares);
        collectionGames.add(grandtheftAutoV);
        collectionGames.add(mookiIsland);
        collectionGames.add(tacoVsBurrito);
        collectionGames.add(monopoly);
        collectionGames.add(eldenRing);
        collectionGames.add(cyberpunk);
        collectionGames.add(doomEternal);
        collectionGames.add(haloInfinite);
        collectionGames.add(spiderMan2);
        collectionGames.add(residentEvil4);
        collectionGames.add(overwatch2);
        collectionGames.add(rdr2);
        collectionGames.add(apexLegends);
        collectionGames.add(godOfWar);
        collectionGames.add(valorant);
        collectionGames.add(witcher3);
        collectionGames.add(destiny2);
        collectionGames.add(tlou2);
        collectionGames.add(battlefield2042);
        collectionGames.add(catan);
        collectionGames.add(carcassonne);
        collectionGames.add(pandemic);
        collectionGames.add(ticketToRide);
        collectionGames.add(dixit);
        collectionGames.add(explodingKittens);
        collectionGames.add(unomundo);
        collectionGames.add(risk);
        collectionGames.add(scythe);
        collectionGames.add(azul);
        //=========================================================================================================//
        //======================================================== RUN =================================================//
        runProgram();


    }
    public static void runProgram(){
        System.out.println("Start the program");
        stampaElementi();
        while (true){
            System.out.println("""
                Program menu:
                
                1 - To show Games
                2 - Check ID repeated
                3 - Search by ID
                4 - Search Games by Price
                5 - Search Games by #Players
                6 - Delete Game by #ID
                7 - Print Stats Games
                8 - Search Game Most Expensive
                9 - Print Average Price
                10 - Set a new Data
                11 - Create Game
                q - Exit
                """);
            String option = SCANNER.next();
            if (option.equalsIgnoreCase("q")) {
                System.out.println("Exit program");
                break;
            }
            switch (option){
                case "1" ->stampaElementi();
                case "2" ->checkerID();
                case "3" ->searchID();
                case "4" ->searchByprice();
                case "5" ->searchByplayers();
                case "6" ->deleteID();
                case "7" ->printAllStatsGames();
                case "8" ->printMaxPriceGame();
                case "9" ->printAveragePrice();
                case "10" ->setByID();
                case "11" ->createGame();
                default -> System.out.println("option non valid");
            }
        }


    }
}

