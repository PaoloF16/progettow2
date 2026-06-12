package paolof16;

import paolof16.entities.Game;
import paolof16.entities.GameType;
import paolof16.entities.VideoGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static paolof16.entities.CollectionGames.getCollectionGames;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Game myVideoGame1 = new VideoGame("Crash", 2004,34.4,"PC PS5",3, GameType.ACTION);
        System.out.println(getCollectionGames());
    }
}
