import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class menu implements ActionListener{
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem red, yellow, custom, fg, bg;
    JTextArea ta;
    int r, g, b;
    menu(){
        f=new JFrame();

        red=new JMenuItem("RED");
        yellow=new JMenuItem("YELLOW");
        custom=new JMenuItem("Custom");
        fg=new JMenuItem("FG");
        bg=new JMenuItem("BG");
        red.addActionListener(this);
        yellow.addActionListener(this);
        custom.addActionListener(this);
        fg.addActionListener(this);
        bg.addActionListener(this);

        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");

        file.add(red); file.add(yellow);file.add(custom);
        edit.add(fg); edit.add(bg);
        mb.add(file); mb.add(edit);

        ta=new JTextArea();
        ta.setBounds(10,10,360,310);

        f.add(mb);f.add(ta);
        f.setJMenuBar(mb);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            r=255;
            g=0;
            b=0;
        }
        if(e.getSource()==yellow){
            r=255;
            g=255;
            b=0;
        }
        if(e.getSource()==custom){
            JDialog d = new JDialog(f , "Custom Color", true);
            JTextField red, gre, blu;
            JLabel red_l, gre_l, blu_l;

            red_l = new JLabel("RED Value:");
            red_l.setBounds(10, 10, 100, 30);

            red = new JTextField();
            red.setBounds(150, 10, 50, 30);

            gre_l = new JLabel("GREE Value:");
            gre_l.setBounds(10, 60, 100, 30);

            gre = new JTextField();
            gre.setBounds(150, 60, 50, 30);

            blu_l = new JLabel("RED Value:");
            blu_l.setBounds(10, 110, 100, 30);

            blu = new JTextField();
            blu.setBounds(150, 110, 50, 30);

            JButton but = new JButton ("OK");
            but.setBounds(120, 200, 60, 50);
            but.addActionListener ( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {
                    r = Integer.parseInt(red.getText());
                    g = Integer.parseInt(gre.getText());
                    b = Integer.parseInt(blu.getText());
                    d.setVisible(false);
                }
            });
            d.add(red_l); d.add(red);
            d.add(gre_l); d.add(gre);
            d.add(blu_l); d.add(blu);

            d.add(but);
            d.setLayout(null);
            d.setSize(300,300);
            d.setVisible(true);
            }
        if(e.getSource()==fg)
            ta.setForeground(new Color(r, g, b));
        if(e.getSource()==bg)
            ta.setBackground(new Color(r, g, b));
    }
    public static void main(String[] args) {
        new menu();
    }

}