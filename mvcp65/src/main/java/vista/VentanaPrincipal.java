package vista;
import controlador.Controller;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener{
    private JTextArea areaIntroduccion;
    private JLabel labelTitulo;
    private JButton botonAceptar;
    private Controller controlador;

    public VentanaPrincipal(){
        botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(150, 280, 120, 25);
		
        labelTitulo = new JLabel("PATRON MODELO VISTA CONTROLADOR");
		labelTitulo.setBounds(60, 40, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));		
		
        areaIntroduccion = new JTextArea("Aplicación MVC- Misión TIC 2022");
		areaIntroduccion.setBounds(50, 90, 380, 140);
		areaIntroduccion.setEditable(false);
		areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 14));
		
        botonAceptar.addActionListener(this);
		
        add(botonAceptar);
		add(labelTitulo);
		add(areaIntroduccion);
		setSize(480, 350);
		setTitle("Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		controlador = new Controller();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonAceptar){
            controlador.mostrarVentanaCRUD();
        }        
    }   
}
