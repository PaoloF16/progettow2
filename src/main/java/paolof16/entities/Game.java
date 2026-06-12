package paolof16.entities;

import java.util.Random;

public abstract class Game {
    private long id;
    private String title;
    private int publishYear;
    private double price;



    public Game(String title,int publishYear,double price){
        Random myRandom = new Random();
        this.id = myRandom.nextLong();
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
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
