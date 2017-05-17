import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bsvic on 2017-05-09.
 */
public class ViewCalc extends JFrame
{
    public ViewCalc(){
        super("Grid");

        Container container = new Container();
        container.setLayout(new GridLayout(5,5));
//        this.setContentPane(container);
        JPanel pannel = new JPanel();
        JButton button = new JButton("Red");
//        this.add(new JMenuBar());
        Icon img = new ImageIcon("C:\\Users\\bsvic\\Google Drive\\Project\\BattleShip\\images.jpg");

        int width = img.getIconWidth();
        int height = img.getIconHeight();
//        int i = 0;
        JButton button_1 = new JButton(img);
        JButton button_2 = new JButton(img);
        JButton button_3 = new JButton(img);
        JButton button_4 = new JButton(img);
        JButton button_5 = new JButton(img);
        JButton button_6 = new JButton(img);
        JButton button_7 = new JButton(img);
        JButton button_8 = new JButton(img);
        JButton button_9 = new JButton(img);
        JButton button_10 = new JButton(img);
        JButton button_11 = new JButton(img);
        JButton button_12 = new JButton(img);
        JButton button_13 = new JButton(img);
        JButton button_14 = new JButton(img);
        JButton button_15 = new JButton(img);
        JButton button_16 = new JButton(img);

        pannel.add(button_1);
        pannel.add(button_2);
        pannel.add(button_3);
        pannel.add(button_4);
        pannel.add(button_5);
        pannel.add(button_6);
        pannel.add(button_7);
        pannel.add(button_8);
        pannel.add(button_9);
        pannel.add(button_10);
        pannel.add(button_11);
        pannel.add(button_12);
        pannel.add(button_13);
        pannel.add(button_14);
        pannel.add(button_15);
        pannel.add(button_16);

        pannel.setSize(new Dimension(4*width,4*height));
        pannel.setLayout(new GridLayout(4,4));
        this.add(pannel);


        JPanel pannelScore = new JPanel();
        pannelScore.add(new JLabel("Score"));
//        pannelScore.add(new );
        pannelScore.add(new JTextArea("0"));
        pannelScore.setLayout(new FlowLayout());
        pannelScore.setSize(new Dimension(5,5));
        this.add(pannelScore);
        this.setLayout(new GridLayout(2,1));
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(4*width,4*height));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.setVisible(true);

    }

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
