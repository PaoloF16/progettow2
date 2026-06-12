package paolof16.entities;

import static paolof16.entities.CollectionGames.collectionGames;

public class VideoGame extends Game{
    private String platform;
    private GameType genre;


    public VideoGame(String title, int publishYear, double price,String platform,GameType genre,long id) {
        super(title, publishYear, price,id);
        this.platform = platform;
        this.genre = genre;
    }



    public String getPlatform() {
        return platform;
    }

    public GameType getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "genre=" + genre +
                ", platform='" + platform + '\'' +
                "} ";
    }
}
