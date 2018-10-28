import javax.swing.*;
import java.awt.event.*;

class AsgnQ1{
    JFrame f;
    JButton calc;
    JLabel l1, l2, l3, l4, l5;
    JTextField tf1, tf2, tf3, tf4, tf5, res, name, regid;
    double m1, m2, m3, m4, m5;

    AsgnQ1(){
        f = new JFrame("Ques 1");
        JLabel regidl = new JLabel("Reg ID:");
        regidl.setBounds(50, 0, 100, 20);
        regid = new JTextField();
        regid.setBounds(150, 0, 100, 20);

        JLabel namel = new JLabel("Name:");
        namel.setBounds(50, 50, 100, 20);
        name = new JTextField();
        name.setBounds(150, 50, 100, 20);

        l1 = new JLabel("Subject 1:");
        l1.setBounds(50, 100, 100, 20);
        tf1 = new JTextField();
        tf1.setBounds(150, 100, 100, 20);

        l2 = new JLabel("Subject 2:");
        l2.setBounds(50, 150, 100, 20);
        tf2 = new JTextField();
        tf2.setBounds(150, 150, 100, 20);

        l3 = new JLabel("Subject 3:");
        l3.setBounds(50, 200, 100, 20);
        tf3 = new JTextField();
        tf3.setBounds(150, 200, 100, 20);

        l4 = new JLabel("Subject 4:");
        l4.setBounds(50, 250, 100, 20);
        tf4 = new JTextField();
        tf4.setBounds(150, 250, 100, 20);

        l5 = new JLabel("Subject 5:");
        l5.setBounds(50, 300, 100, 20);
        tf5 = new JTextField();
        tf5.setBounds(150, 300, 100, 20);


        res = new JTextField("RESULT");
        res.setEditable(false);
        res.setBounds(50, 400, 250, 20);

        calc = new JButton("SUBMIT");
        calc.setBounds(50, 350, 100, 30);
        calc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty() || name.getText().isEmpty() || regid.getText().isEmpty())
                    res.setText("PLEASE ENTER ALL DETAILS");
                else{
                    m1 = Double.parseDouble(tf1.getText());
                    m2 = Double.parseDouble(tf2.getText());
                    m3 = Double.parseDouble(tf3.getText());
                    m4 = Double.parseDouble(tf4.getText());
                    m5 = Double.parseDouble(tf5.getText());

                    if(m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100 || m4<0 || m4>100 || m5<0 || m5>100)
                        res.setText("PLEASE ENTER VALID DETAILS");
                    else{
                        double result = (m1+m2+m3+m4+m5)/5;

                        if(result>50)
                            res.setText(name.getText() + " of reg id, " + regid.getText() + ", you PASSED!!");
                        else
                            res.setText(name.getText() + " of reg id, " + regid.getText() + ", you FAILED!!");
                    }
                }
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });

        f.add(namel);f.add(regidl);
        f.add(name);f.add(regid);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);
        f.add(calc);f.add(res);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new AsgnQ1();
    }
}