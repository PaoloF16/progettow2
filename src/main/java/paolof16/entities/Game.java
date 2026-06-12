package paolof16.entities;

import java.util.Random;

import static paolof16.entities.CollectionGames.collectionGames;

public  abstract class Game {
    private long id;
    private String title;
    private int publishYear;
    private double price;



    public Game(String title,int publishYear,double price){
        Random myRandom = new Random();
        this.id = myRandom.nextLong(0,30);
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        collectionGames.add(this);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishYear=" + publishYear +
                ", price=" + price +
                '}';
    }
}
