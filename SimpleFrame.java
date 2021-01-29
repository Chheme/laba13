import java.awt.*;
import java.awt.event.*;

class SimpleFrame extends Frame{
    SimpleFrame(String s) {
        super(s);
        setSize(400,150);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        Frame fr = new TooSimpleFrame();
        fr.setSize(400,150);
        fr.setVisible(true);
        new SimpleFrame("Моя программа");
    }
}
