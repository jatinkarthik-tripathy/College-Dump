import java.awt.*;
import java.awt.event.*;

class clos extends Frame {
    Button b;
    Frame f;
    TextField tf;
    Button b2;

    void fn(){
        f = new Frame();

        tf = new TextField();
        tf.setBounds(10, 100, 100, 30);
        b = new Button("enter");
        b.setBounds(10, 200, 100, 50);

        b2 = new Button("EXIT");
        b2.setBounds(10, 300, 100, 10);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Ssup");
            }
        });

        b2.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        f.add(b);
        f.add(b2);
        f.add(tf);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        clos obj = new clos();
        obj.fn();
    }
}