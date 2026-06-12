package paolof16;

import paolof16.entities.BoardGame;
import paolof16.entities.Game;
import paolof16.entities.GameType;
import paolof16.entities.VideoGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static paolof16.entities.CollectionGames.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Game crash = new VideoGame("Crash Bandicoot", 2004,34.4,"PC PS5", GameType.ACTION,);
        Game arcRaiders = new VideoGame("Arc Raiders",2025,23,"PC PS5",GameType.SHOOTERS);
        Game callofDuty = new VideoGame("Call of duty Black Ops",2011,25,"PC",GameType.SHOOTERS);
        Game littleNightmares = new VideoGame("Little Nightmares",2020,34.4,"PS4, PS5,PC",GameType.ACTION);
        Game grandtheftAutoV = new VideoGame("Grand Theft Auto V",2014,50,"PC PS5 PS4 XBOX",GameType.ACTION);
        Game mookiIsland = new BoardGame("Mooki Islan",2012,10.74,2,10);
        Game tacoVsBurrito = new BoardGame("Taco VS Burrito",2010,17.96,5,15);
        Game monopoly = new BoardGame("Monopoly",1990,31.46,8,120);
        Game eldenRing = new VideoGame("Elden Ring", 2022, 59.99, "PC PS5 XBOX", GameType.ACTION);
        Game cyberpunk = new VideoGame("Cyberpunk 2077", 2020, 49.99, "PC PS5", GameType.ACTION);
        Game doomEternal = new VideoGame("Doom Eternal", 2020, 39.99, "PC PS4 XBOX", GameType.SHOOTERS);
        Game haloInfinite = new VideoGame("Halo Infinite", 2021, 59.99, "PC XBOX", GameType.SHOOTERS);
        Game spiderMan2 = new VideoGame("Marvel's Spider-Man 2", 2023, 69.99, "PS5", GameType.ACTION);
        Game residentEvil4 = new VideoGame("Resident Evil 4 Remake", 2023, 59.99, "PC PS5 XBOX", GameType.ACTION);
        Game overwatch2 = new VideoGame("Overwatch 2", 2022, 0.0, "PC PS5 PS4 XBOX", GameType.SHOOTERS);
        Game rdr2 = new VideoGame("Red Dead Redemption 2", 2018, 59.99, "PC PS4 XBOX", GameType.ACTION);
        Game apexLegends = new VideoGame("Apex Legends", 2019, 0.0, "PC PS5 PS4 XBOX", GameType.SHOOTERS);
        Game godOfWar = new VideoGame("God of War Ragnarok", 2022, 69.99, "PS5 PS4 PC", GameType.ACTION);
        Game valorant = new VideoGame("Valorant", 2020, 0.0, "PC PS5", GameType.SHOOTERS);
        Game witcher3 = new VideoGame("The Witcher 3: Wild Hunt", 2015, 39.99, "PC PS5 PS4 XBOX", GameType.ACTION);
        Game destiny2 = new VideoGame("Destiny 2", 2017, 0.0, "PC PS5 XBOX", GameType.SHOOTERS);
        Game tlou2 = new VideoGame("The Last of Us Part II", 2020, 39.99, "PS4 PS5", GameType.ACTION);
        Game battlefield2042 = new VideoGame("Battlefield 2042", 2021, 59.99, "PC PS5 XBOX", GameType.SHOOTERS);
        Game catan = new BoardGame("Catan", 1995, 45.0, 4, 90);
        Game carcassonne = new BoardGame("Carcassonne", 2000, 35.0, 5, 45);
        Game pandemic = new BoardGame("Pandemic", 2008, 40.0, 4, 45);
        Game ticketToRide = new BoardGame("Ticket to Ride", 2004, 48.0, 5, 60);
        Game dixit = new BoardGame("Dixit", 2008, 32.99, 6, 30);
        Game explodingKittens = new BoardGame("Exploding Kittens", 2015, 20.0, 5, 15);
        Game unomundo = new BoardGame("Uno", 1971, 9.99, 10, 30);
        Game risk = new BoardGame("Risk", 1957, 34.99, 6, 120);
        Game scythe = new BoardGame("Scythe", 2016, 79.99, 5, 115);
        Game azul = new BoardGame("Azul", 2017, 39.99, 4, 45);
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
        stampaElementi();





    }

}
