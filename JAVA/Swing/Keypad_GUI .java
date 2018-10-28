import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Keypad_GUI implements ActionListener{
    JFrame f;
    JPanel p, p_end;
    JButton call, end;
    JTextField tf;
    String str = "";
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Keypad_GUI (){
        f = new JFrame("Caller");

        tf = new JTextField();
        tf.setText(str);
        tf.setBounds(50, 10, 300, 30);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        tf.setEditable(false);

        p = new JPanel();
        p.setBounds(50, 50, 300, 300);

        b0=new JButton("0");
        b0.addActionListener(this);
        b1=new JButton("1");
        b1.addActionListener(this);
        b2=new JButton("2");
        b2.addActionListener(this);
        b3=new JButton("3");
        b3.addActionListener(this);
        b4=new JButton("4");
        b4.addActionListener(this);
        b5=new JButton("5");
        b5.addActionListener(this);
        b6=new JButton("6");
        b6.addActionListener(this);
        b7=new JButton("7");
        b7.addActionListener(this);
        b8=new JButton("8");
        b8.addActionListener(this);
        b9=new JButton("9");
        b9.addActionListener(this);

        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
        p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(new JLabel());p.add(b0);

        p.setLayout(new GridLayout(4, 3, 15, 15));

        call = new JButton("CALL");
        call.setForeground(new Color(255, 255, 255));
        call.setBackground(new Color(0, 100, 0));
        call.setBounds(50, 400, 100, 50);
        call.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (tf.getText().isEmpty() ){
                    tf.setText("Please Enter A Number");
                }
                else{
                    tf.setText("calling . . .");
                    end.setVisible(true);
                    call.setVisible(false);
                }
            }
        });

        end = new JButton("HANG");
        end.setForeground(new Color(0, 0, 0));
        end.setBackground(new Color(255, 0, 0));
        end.setVisible(false);
        end.setBounds(250, 400, 100, 50);
        end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
                end.setVisible(false);
                call.setVisible(true);
            }
        });

        f.add(tf);
        f.add(p);
        f.add(call);
        f.add(end);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            str = tf.getText() + '0';
            tf.setText(str);
        }
        else if(e.getSource()==b1){
            str = tf.getText() + '1';
            tf.setText(str);
        }
        else if(e.getSource()==b2){
            str = tf.getText() + '2';
            tf.setText(str);
        }
        else if(e.getSource()==b3){
            str = tf.getText() + '3';
            tf.setText(str);
        }
        else if(e.getSource()==b4){
            str = tf.getText() + '4';
            tf.setText(str);
        }
        else if(e.getSource()==b5){
            str = tf.getText() + '5';
            tf.setText(str);
        }
        else if(e.getSource()==b6){
            str = tf.getText() + '6';
            tf.setText(str);
        }
        else if(e.getSource()==b7){
            str = tf.getText() + '7';
            tf.setText(str);
        }
        else if(e.getSource()==b8){
            str = tf.getText() + '8';
            tf.setText(str);
        }
        else if(e.getSource()==b9){
            str = tf.getText() + '9';
            tf.setText(str);
        }
    }

    public static void main(String[] args) {
        System.out.println("BUILD Sucessful . . . .");
        new Keypad_GUI();
    }

}