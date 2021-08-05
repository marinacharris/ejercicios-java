import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
//import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener, ChangeListener{
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField textNombre, textApellido;
    private JButton boton1, boton2;
    private JComboBox<String> combo1;
    private JCheckBox check1, check2;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoBoton1;
    
    public static void main(String[] args) throws Exception {
        /*JFrame ventana = new JFrame();
        ventana.setBounds(200,40,400,400); //columna, fila, ancho, alto (pixeles)
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        Formulario ventana = new Formulario();
        ventana.setBounds(200,40,400,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    //constructor
    public Formulario(){
        setLayout(null);

        etiqueta1 = new JLabel("Nombre");
        etiqueta1.setBounds(30,30, 100,20);
        add(etiqueta1);
        etiqueta2 = new JLabel("Apellido");
        etiqueta2.setBounds(30, 60, 100,20);
        add(etiqueta2);
        etiqueta3 = new JLabel();
        etiqueta3.setBounds(30, 90, 200, 20);
        add(etiqueta3);

        textNombre = new JTextField();
        textNombre.setBounds(100,30,100,20);
        add(textNombre);
        textApellido = new JTextField();
        textApellido.setBounds(100,60,100,20);
        add(textApellido);

        boton1 = new JButton("Unir");
        boton1.setBounds(30,300,80,25);
        boton1.addActionListener(this);
        add(boton1);
        boton2 = new JButton("Limpiar");
        boton2.setBounds(130,300,80,25);
        boton2.addActionListener(this);
        add(boton2);

        combo1 = new JComboBox<String>();
        combo1.setBounds(230,30,100,20);
        combo1.addItem("Colombia");
        combo1.addItem("Ecuador");
        combo1.addItem("Brasil");
        combo1.addItem("Panamá");
        combo1.addItem("Perú");
        combo1.addActionListener(this);
        add(combo1);
        
        grupoBoton1 = new ButtonGroup();
        radio1 = new JRadioButton("400 x 400");
        radio1.setBounds(30,140,80,20);
        radio1.addChangeListener(this);
        add(radio1);
        grupoBoton1.add(radio1);
        radio2 = new JRadioButton("500 x 500");
        radio2.setBounds(30,160,80,20);
        radio2.addChangeListener(this);
        add(radio2);
        grupoBoton1.add(radio2);
        radio3 = new JRadioButton("600 x 600");
        radio3.setBounds(30,180,80,20);
        radio3.addChangeListener(this);
        add(radio3);
        grupoBoton1.add(radio3);

        check1 = new JCheckBox("Español");
        check1.setBounds(160,140,80,20);
        check1.addChangeListener(this);
        add(check1);
        check2 = new JCheckBox("Inglés");
        check2.setBounds(160,160,80,20);
        check2.addChangeListener(this);
        add(check2);
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1){
            etiqueta3.setText(textNombre.getText()+" "+textApellido.getText());
        }
        if (e.getSource()== boton2){
            textNombre.setText("");
            textApellido.setText("");
        }
        if (e.getSource()== combo1){
            etiqueta3.setText(textNombre.getText()+" "+textApellido.getText()+" - "+combo1.getSelectedItem());
        }
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        String idiomas="";
        if(radio1.isSelected()){
            setSize(400, 400);
        }
        if(radio2.isSelected()){
            setSize(500,500);
        }
        if(radio3.isSelected()){
            setSize(600,600);
        }    
        if (check1.isSelected()){
            idiomas = idiomas + "Español ";
        }    
        if (check2.isSelected()){
            idiomas = idiomas + "Inglés ";
        }
        etiqueta3.setText(("La persona habla: " + idiomas));
        //JOptionPane.showMessageDialog(this,"La persona habla:"+idiomas);
    }
}
