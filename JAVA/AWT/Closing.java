import java.awt.*;
import java.awt.event.*;

class Closing{
    Frame f;
    Button b;
    Closing(){
        f = new Frame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                    f.dispose();
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    void fn(){
        b = new Button("sr;kih");
        f.add(b);
        b.setBounds(30, 100, 100, 50);
    }

    public static void main(String[] args){
        Closing obj = new Closing();
        obj.fn();
    }
\