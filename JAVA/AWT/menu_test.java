import java.awt.*;
import java.awt.event.*;

class menu_test{
    Frame f;
    MenuBar mb;
    Menu m;
    Menu sm;
    menu_test(){
        f = new Frame();
        mb = new MenuBar();
        m = new Menu("main");
        sm = new Menu("sub");

        MenuItem i1 = new MenuItem("i1");
        MenuItem i2 = new MenuItem("i2");

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                    f.dispose();
            }
        });

        m.add(i1);
        sm.add(i2);

        m.add(sm);
        mb.add(m);

        f.setMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new menu_test();
    }
}