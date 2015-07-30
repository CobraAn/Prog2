package model_classes;

/**
 * Created by cobraan on 2015-07-30.
 */
public class Position {

    private int posX;
    private int posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {return posX;}
    public int getPosY() {return posY;}
}
