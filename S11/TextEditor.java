import java.awt.*;
import java.awt.event.*;

public class TextEditor extends Frame 
    implements ActionListener, WindowListener{
    private Panel p = new Panel();
    private TextArea editArea;
    private Button saveButton;
    public TextEditor() {
        setLayout(new FlowLayout());
        editArea = new TextArea(5, 40);
        add(editArea);

        saveButton = new Button("Save");
        add(saveButton);

        addWindowListener(this);

        setTitle("TextEditor");
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }

    @Override
    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }
}