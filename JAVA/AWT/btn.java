import java.awt.*;

class btn extends Frame{
    Button b;
    Frame f;

    void fn(){
        f = new Frame();
        b = new Button("sr;kih");
        f.add(b);
        b.setBounds(30, 100, 100, 50);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        btn obj = new btn();
        obj.fn();
    }
}