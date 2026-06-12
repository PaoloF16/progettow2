package paolof16.entities;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CollectionGames {
   public static List<Game> collectionGames = new ArrayList<>();

    public static String getCollectionGames() {
        return collectionGames.toString();
    }
}
