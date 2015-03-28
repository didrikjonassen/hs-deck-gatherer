package me.didrik.hs_deck_gatherer;

import java.awt.*;
import java.io.File;
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

        File file = new File("decks" + File.separator + "testdeck.deck");
        gatherer.Gather(FileParser.parse(file));
    }
}
