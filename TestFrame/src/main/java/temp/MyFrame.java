package temp;

import java.awt.*;

public class MyFrame extends Frame {
    private Button quit = new Button("Quit");

    public MyFrame() throws HeadlessException {
        super("Test");
        add(quit);
        pack();
        setVisible(true);
    }
}
