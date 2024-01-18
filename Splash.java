package employee.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash()
    {  //elements on frame
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
      Image i2=i1.getImage().getScaledInstance(1170,650, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      //add image to frame
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);

        setSize(1170,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);


        //creating a thread to close the frame after 5 sec
        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new Splash();
    }

}
