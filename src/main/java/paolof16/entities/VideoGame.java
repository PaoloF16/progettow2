package paolof16.entities;

public class VideoGame extends Game{
    private String platform;
    private int timeGame;
    private GameType genre;


    public VideoGame(String title, int publishYear, double price,String platform,int timeGame,GameType genre) {
        super(title, publishYear, price);
        this.platform = platform;
        this.timeGame = timeGame;
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public GameType getGenre() {
        return genre;
    }

    public int getTimeGame() {
        return timeGame;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "platform='" + platform + '\'' +
                ", timeGame=" + timeGame +
                ", genre=" + genre +
                '}';
    }
}
