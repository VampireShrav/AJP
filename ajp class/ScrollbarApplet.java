import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarApplet extends Applet implements AdjustmentListener {
    Scrollbar scrollbar;   // Declare a Scrollbar
    int value = 0;         // Initialize the scrollbar value

    @Override
    public void init() {
        // Initialize the scrollbar with orientation, initial value, and range
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        add(scrollbar); // Add scrollbar to the applet
        scrollbar.addAdjustmentListener(this); // Add AdjustmentListener to scrollbar
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Update the value when the scrollbar is adjusted
        value = scrollbar.getValue();
        repaint(); // Repaint the applet to show the updated value
    }

    @Override
    public void paint(Graphics g) {
        // Display the current value of the scrollbar
        g.drawString("Scrollbar value: " + value, 20, 50);
    }
}