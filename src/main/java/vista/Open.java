package vista;

import javax.swing.*;
import java.awt.*;

public class Open extends JFrame {

    //Panel 1
    public JPanel panel1;
    public JLabel jltitle,jlimg,jlimg2;
    public JButton jbtEnter, jbtRegister;





    public Open (){
        setVisible(true);
        setSize(1801,900);
        setSize(1800,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Twitter");
        setLocationRelativeTo(null);
        componentsList();
    }

    public void componentsList (){
        startPanels();
        startContent();
    }

    public void startPanels(){
        panel1 = new JPanel();
        getContentPane().add(panel1);
        panel1.setLayout(null);
        panel1.setBounds(0,0,900,900);
        panel1.setVisible(true);

    }

    public void startContent(){
       //Panel1 - Start
        ImageIcon imgicon = new ImageIcon("src/main/java/img/imgtwitter.jpg");
        jlimg = new JLabel();
        jlimg.setBounds(0,0,1200,900);

        ImageIcon imgicon_result = new ImageIcon(imgicon.getImage().getScaledInstance(
                jlimg.getWidth(),jlimg.getHeight(),Image.SCALE_SMOOTH));


        jlimg2 = new JLabel(imgicon_result);
        jlimg2.setBounds(0,0,1200,900);
        panel1.add(jlimg2);


        jltitle = new JLabel("Uneix-te Avui");
        jltitle.setBounds(1300,400,150,50);
        jltitle.setFont(new Font("Open Sans",Font.BOLD,20));
        panel1.add(jltitle);



    }
}
