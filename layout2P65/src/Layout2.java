import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


import static java.awt.Font.PLAIN;

import java.awt.*;

public class Layout2 extends JFrame{
    FlowLayout flowlayout1;
    JLabel display;
    JPanel panelBotones;
    GridLayout gridlayout1;
    JButton botones[];
    JButton resultado;

    public Layout2(){
     
        display();
        botones();
        resultado();
        ventana();

    }
    private void ventana(){
        flowlayout1 = new FlowLayout(FlowLayout.CENTER,10,10);
        setLayout(flowlayout1);
        setTitle("Calculadora");
        setResizable(false);
        setMinimumSize(new Dimension(260,400));
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void display(){
        display = new JLabel("0");
        display.setPreferredSize(new Dimension(230,60));
        display.setBackground(Color.black);
        display.setForeground(Color.green);
        display.setBorder(new LineBorder(Color.darkGray));
        display.setFont(new Font("MONOSPACED", PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display);

    }

    private void botones(){
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.black);
        gridlayout1 = new GridLayout(4,4,10,10);
        panelBotones.setLayout(gridlayout1);
        add(panelBotones);
        botones = new JButton[16];
        String textos_Botnes[] = new String[]{"1","2","3","+","4","5","6","-","7","8","9","*","C","0",".","/"};
        for (int i=0; i<16;i++){
            botones[i] = new JButton(textos_Botnes[i]);
            botones[i].setPreferredSize(new Dimension(50,50));
            botones[i].setBackground(Color.darkGray);
            botones[i].setBorder(new LineBorder(Color.darkGray));
            botones[i].setForeground(Color.white);
            panelBotones.add(botones[i]);

        }
    }
    private void resultado(){
        resultado = new JButton("RESULTADO");
        resultado.setPreferredSize(new Dimension(230,50));
        resultado.setBackground(Color.darkGray);
        resultado.setBorder(new LineBorder(Color.darkGray));
        resultado.setForeground(Color.white);
        add(resultado);


    }
    public static void main(String[] args) throws Exception {
        new Layout2();
    }
}
