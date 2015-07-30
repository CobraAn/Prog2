package model_classes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cobraan on 2015-07-30.
 */
public class Location extends JComponent{

    private String name;
    private String description;
    private Color color;
    private Position position;

    public Location(String name, Color color, Position position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public Location(String name, String description, Color color, Position position) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.position = position;
    }

    public Position getPosition() {return position;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    public Color getColor() {return color;}
}
