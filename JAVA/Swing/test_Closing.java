import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class test_Closing{
    test_Closing(){
        JFrame f = new JFrame();

        final DefaultListModel<String> model = new DefaultListModel<>();

        model.addElement("gsin");
        model.addElement(";skukduvh");

        final JList<String> tf = new JList(model);
        tf.setBounds(100,50, 100, 30);
        f.add(tf);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new test_Closing();
    }

}