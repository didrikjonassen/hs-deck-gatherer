package me.didrik.hs_deck_gatherer;

public class Card {

    String name;
    int count;

    public Card(String name, int count){
        this.name = name.toUpperCase();
        this.count = count;
    }

    public Card(String name, String count){
        this.name = name;
        this.count = Integer.parseInt(count);
    }
}
