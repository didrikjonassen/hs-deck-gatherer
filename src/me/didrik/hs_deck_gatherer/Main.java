package me.didrik.hs_deck_gatherer;

import java.awt.*;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//        http://stackoverflow.com/questions/2419555/how-to-obtain-mouse-click-coordinates-outside-my-window-in-java/6050894#6050894
//        Used to find x and y position
//	      PointerInfo info = MouseInfo.getPointerInfo();
//        Point p = info.getLocation();
//        System.out.println("x: " + p.x + ", y: " + p.y);

        Thread.sleep(2000);
        ClickPoints clickPoints = new ClickPoints();
        Gatherer gatherer = new Gatherer(clickPoints.getCardPoint(), clickPoints.getSearchBoxPoint());
        Card card1 = new Card("wisp", 2);
        Card card2 = new Card("murloc raider", 2);
        Card card3 = new Card("ship's cannon", 2);
        Card card4 = new Card("pint-sized", 2);
        Card card5 = new Card("4000", 1);
        gatherer.Gather(new Card[]{card1, card2, card3, card4, card5});
    }
}
