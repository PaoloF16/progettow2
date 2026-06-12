package paolof16.entities;

import static paolof16.entities.CollectionGames.collectionGames;

public class BoardGame extends Game {
    private int minPlayers;
    private int maxPlayers;
    private int timeGame;


    public BoardGame(String title, int publishYear, double price,int minPlayers,int maxPlayers,int timeGame,long id) {
        super(title, publishYear, price,id);
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.timeGame = timeGame;

    }

    public int getTimeGame() {
        return timeGame;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @Override
    public String toString() {
        return super.toString()+"BoardGame{" +
                "minPlayers=" + minPlayers +
                "maxPlayers=" + maxPlayers +
                ", timeGame=" + timeGame + "minutes"+
                '}';
    }

}
