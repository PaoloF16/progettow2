package paolof16.entities;

import static paolof16.entities.CollectionGames.collectionGames;

public class BoardGame extends Game {
    private int numberPlayers;
    private int timeGame;


    public BoardGame(String title, int publishYear, double price,int numberPlayers,int timeGame,long id) {
        super(title, publishYear, price,id);
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
        return super.toString()+"BoardGame{" +
                "numberPlayers=" + numberPlayers +
                ", timeGame=" + timeGame + "minutes"+
                '}';
    }
}
