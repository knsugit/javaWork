import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class TextEditor extends JFrame {
    JTextPane textPane = new JTextPane();
    JLabel statusBar = new JLabel(); //״̬��
    JFileChooser fileChooser = new JFileChooser(); //�ļ�ѡ����

    public TextEditor() {
        super("TextEditor"); //����JFrame�����ַ����Ĺ��캯�����ܹ��ı䴰�ڵı���

        Action[] actions = {
            new NewAction(),  //"�½�"����
            new OpenAction(), //"��"����
            new SaveAction(), //"����"����
            new ExitAction(), //"�˳�"����
        };

        setJMenuBar(createJMenuBar(actions)); //�˵���
        Container container = getContentPane();
        //container.add(createJToolBar(actions), BorderLayout.NORTH);
        container.add(textPane, BorderLayout.CENTER);
        container.add(statusBar, BorderLayout.SOUTH);

        setSize(330, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JMenuBar createJMenuBar(Action[] actions) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuFile.add(new JMenuItem(actions[0]));
        menuFile.add(new JMenuItem(actions[1]));
        menuFile.add(new JMenuItem(actions[2]));
        menuFile.add(new JMenuItem(actions[3]));
        menuBar.add(menuFile);
        return menuBar;
    }

    class NewAction extends AbstractAction {
        public NewAction() {
            super("New");
        }
        public void actionPerformed(ActionEvent e) {
            textPane.setDocument(new DefaultStyledDocument());
        }
    }

    class OpenAction extends AbstractAction {
        public OpenAction() {
            super("Open");
        }
        public void actionPerformed(ActionEvent e) {
            int i = fileChooser.showOpenDialog(TextEditor.this);
            if(i == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
                try {
                    InputStream is = new FileInputStream(f);
                    textPane.read(is, "d");
                } 
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    class SaveAction extends AbstractAction {
        public SaveAction() {
            super("Save");
        }
        public void actionPerformed(ActionEvent e) {
            int i = fileChooser.showSaveDialog(TextEditor.this);
            if(i == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
                try {
                    FileOutputStream out = new FileOutputStream(f);
                    out.write(textPane.getText().getBytes());
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    class ExitAction extends AbstractAction {
        public ExitAction() {
            super("Exit");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}

