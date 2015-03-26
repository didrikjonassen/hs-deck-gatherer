package me.didrik.hs_deck_gatherer;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Gatherer {

    Point cardPosition;
    Point searchBoxPosition;
    Robot robot;

    public Gatherer(Point CardPosition, Point searchBoxPosition) throws AWTException {
        this.cardPosition = CardPosition;
        this.searchBoxPosition = searchBoxPosition;
        robot = new Robot();
    }

    public void Gather(Card[] cards){
        for(int i = 0; i < cards.length; i++){
            clickSearchBox();
            writeCardName(cards[i].name);
            clickCard(cards[i].count);
        }
    }

    private void clickCard(int count) {
        robot.mouseMove(cardPosition.x, cardPosition.y);
        for(int i = 0; i < count; i++){
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(50);
        }
    }

    private void writeCardName(String name) {
        for(int c: name.toCharArray()){
            if(c == '\'') c = KeyEvent.VK_QUOTE;
            robot.keyPress(c);
            robot.keyRelease(c);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(50);
    }

    private void clickSearchBox() {
        robot.mouseMove(searchBoxPosition.x, searchBoxPosition.y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(50);
    }
}
