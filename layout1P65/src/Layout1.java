import javax.swing.*; //todos los componentes como botones, comboBox, etiquetas...
import java.awt.*; //layouts
import java.awt.event.*; // action listner

public class Layout1 extends JFrame implements ActionListener{
    JButton boton1, boton2, boton3, boton4, boton5;
    FlowLayout flowlayout1;

    public Layout1(){
        flowlayout1 = new FlowLayout(FlowLayout.CENTER, 5,5);
        setLayout(flowlayout1);
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Bontón 4");
        boton5 = new JButton("Bontón 5");
        add(boton1);
        boton1.addActionListener(this);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);

        
    }
    public static void main(String[] args) throws Exception {
        Layout1 formulario = new Layout1();
        formulario.setBounds(100,100,400,150);
        formulario.setTitle("Ventana 1");
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        flowlayout1.setHgap(flowlayout1.getHgap()+5);
        flowlayout1.setVgap(flowlayout1.getVgap()+5);
        setLayout(flowlayout1);
        validate();
    
        
    }
}
