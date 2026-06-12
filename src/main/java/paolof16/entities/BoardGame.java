package paolof16.entities;

public class BoardGame extends Game {
    private int numberPlayers;
    private int timeGame;


    public BoardGame(String title, int publishYear, double price,int numberPlayers,int timeGame) {
        super(title, publishYear, price);
        this.numberPlayers = numberPlayers;
        this.timeGame = timeGame;

    }

    public int getTimeGame() {
        return timeGame;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "numberPlayers=" + numberPlayers +
                ", timeGame=" + timeGame +
                '}';
    }
}
