import java.awt.*;
import javax.swing.*;

public class YourIcon implements Icon {
    private int size;

    public YourIcon(int aSize) {
        size = aSize;
    }

    public int getIconWidth() {
        return size;
    }

    public int getIconHeight() {
        return size;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        //add stuff here lol
    }
}
