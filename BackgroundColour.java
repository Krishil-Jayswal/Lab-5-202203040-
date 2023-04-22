import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class BackgroundColour extends Applet implements ItemListener {
    Choice colorChoice;
    
    public void init() {
        
        colorChoice = new Choice();
        colorChoice.add("Red");
        colorChoice.add("Blue");
        colorChoice.add("Green");
        colorChoice.add("Yellow");
        colorChoice.add("Orange");
        colorChoice.add("Magenta");
        
        add(new Label("Choose a color:"));
        add(colorChoice);
        
        
        colorChoice.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent e) {
        
        String colorName = colorChoice.getSelectedItem();
        switch (colorName) {
            case "Red":
                setBackground(Color.RED);
                break;
            case "Blue":
                setBackground(Color.BLUE);
                break;
            case "Green":
                setBackground(Color.GREEN);
                break;
            case "Yellow":
                setBackground(Color.YELLOW);
                break;
            case "Orange":
                setBackground(Color.ORANGE);
                break;
            case "Magenta":
                setBackground(Color.MAGENTA);
                break;    
            default:
                setBackground(Color.WHITE);
        }
    }
}