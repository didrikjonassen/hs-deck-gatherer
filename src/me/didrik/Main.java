package me.didrik;

import me.didrik.hs_deck_gatherer.Card;
import me.didrik.hs_deck_gatherer.Gatherer;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//        http://stackoverflow.com/questions/2419555/how-to-obtain-mouse-click-coordinates-outside-my-window-in-java/6050894#6050894
//        Used to find x and y position
//	      PointerInfo info = MouseInfo.getPointerInfo();
//        Point p = info.getLocation();
//        System.out.println("x: " + p.x + ", y: " + p.y);


        Properties properties = new Properties();
        properties.load(new FileInputStream("screenPositions.properties"));
        int cardx = Integer.parseInt(properties.getProperty("cardPositionX"));
        int cardy = Integer.parseInt(properties.getProperty("cardPositionY"));
        int searchx = Integer.parseInt(properties.getProperty("searchBoxPositionX"));
        int searchy = Integer.parseInt(properties.getProperty("searchBoxPositionY"));

        Thread.sleep(2000);
        Gatherer gatherer = new Gatherer(new Point(cardx, cardy), new Point(searchx, searchy));
        Card card1 = new Card("wisp", 2);
        Card card2 = new Card("murloc raider", 2);
        Card card3 = new Card("ship's cannon", 2);
        Card card4 = new Card("pint-sized", 2);
        gatherer.Gather(new Card[]{card1, card2, card3, card4});
    }
}
