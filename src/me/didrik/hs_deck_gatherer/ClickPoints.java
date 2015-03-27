package me.didrik.hs_deck_gatherer;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClickPoints extends Properties {

    Point cardPoint;
    Point searchBoxPoint;

    ClickPoints() throws IOException {
        load(new FileInputStream("screenPositions.properties"));
        cardPoint = new Point(getValue("cardPositionX"), getValue("cardPositionX"));
        searchBoxPoint = new Point(getValue("searchBoxPositionX"), getValue("searchBoxPositionY"));
    }

    Point getCardPoint(){
        return cardPoint;
    }

    Point getSearchBoxPoint(){
        return searchBoxPoint;
    }

    private int getValue(String key){
        return Integer.parseInt(getProperty(key));
    }
}
