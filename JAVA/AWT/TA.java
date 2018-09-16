import java.awt.*;

class TA{
    Frame f;
    TA(){
        f = new Frame();
        TextArea area = new TextArea("TEST");
        area.setBounds(50, 50, 200, 200);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TA();
    }
}