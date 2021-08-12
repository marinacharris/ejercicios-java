package vista;

import controlador.Controller;
import modelo.vo.PersonaVo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class VentanaCRUD extends JFrame implements ActionListener{
    private JLabel labelTitulo;
    private JTextField textCod, textNombre, textEdad, textProfesion, textTelefono;
    private JLabel cod, nombre, edad, profesion, telefono;
    private JButton botonInsertar, botonGuardar, botonCancelar, botonBuscar, botonModificar, botonEliminar, botonLimpiar;
    private Controller control;

    public VentanaCRUD(){
        labelTitulo = new JLabel("ADMINISTRAR PERSONAS");
        labelTitulo.setBounds(120, 20, 380, 30);
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
        add(labelTitulo);


        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(170,80,120,25);

        botonInsertar = new JButton("Insertar");
        botonInsertar.setBounds(50, 220, 120, 25);

        botonModificar= new JButton("Modificar");
        botonModificar.setBounds(190, 220, 120, 25);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(330, 220, 120, 25);

        botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(50, 250, 120, 25);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(190, 250, 120, 25);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(330, 250, 120, 25);

        add(botonBuscar);
        add(botonCancelar);
        add(botonEliminar);
        add(botonGuardar);
        add(botonInsertar);
        add(botonLimpiar);
        add(botonModificar);

        textCod = new JTextField();
        textCod.setBounds(80,80,80,25);

        textNombre = new JTextField();
        textNombre.setBounds(80,120,190,25);

        textTelefono = new JTextField();
        textTelefono.setBounds(340,160,80,25);

        textProfesion = new JTextField();
        textProfesion.setBounds(80, 160, 190,25);

        textEdad = new JTextField();
        textEdad.setBounds(340,120,80,25);

        add(textCod);
        add(textEdad);
        add(textNombre);
        add(textProfesion);
        add(textTelefono);

        cod = new JLabel("Código");
        cod.setBounds(20,80,80,25);
        
        nombre = new JLabel("Nombre");
        nombre.setBounds(20,120,80,25);

        telefono = new JLabel("Teléfono");
        telefono.setBounds(290,160,80,25);

        profesion = new JLabel("Profesión");
        profesion.setBounds(20,160,80,25);

        edad = new JLabel("Edad");
        edad.setBounds(290,120,80,25);
        
        add(cod);
        add(nombre);
        add(telefono);
        add(profesion);
        add(edad);

        botonBuscar.addActionListener(this);
        botonCancelar.addActionListener(this);
        botonEliminar.addActionListener(this);
        botonGuardar.addActionListener(this);
        botonInsertar.addActionListener(this);
        botonLimpiar.addActionListener(this);
        botonModificar.addActionListener(this);

        setSize(480,320);
        setTitle("Misión Tic 2022");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        control = new Controller();

    }

    public void muestraPersona(PersonaVo miPersona){
        textNombre.setText(miPersona.getNombrePersona());
        textEdad.setText(miPersona.getEdadPersona()+"");
		textTelefono.setText(miPersona.getTelefonoPersona() + "");
		textProfesion.setText(miPersona.getProfesionPersona());
        habilita(true,false,false,false,false, true, false, true, true);
    }

    public void limpiar(){
        textCod.setText("");
		textNombre.setText("");
		textEdad.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
        habilita(true,true,true,true,true, true, false, true, true);
    }

    public void habilita(boolean codigo, boolean nombre, boolean edad, boolean tel, boolean profesion, boolean bBuscar, boolean bGuardar, boolean bModificar, boolean bEliminar){
        textCod.setEditable(codigo);
        textNombre.setEditable(nombre);
		textEdad.setEditable(edad);
		textTelefono.setEditable(tel);
		textProfesion.setEditable(profesion);
        botonBuscar.setEnabled(bBuscar);
        botonGuardar.setEnabled(bGuardar);
		botonModificar.setEnabled(bModificar);
		botonEliminar.setEnabled(bEliminar);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== botonBuscar){
            try {
                PersonaVo miPersona = control.consultarPersonas(Integer.parseInt(textCod.getText()));
                if (miPersona == null){
                    JOptionPane.showMessageDialog(null, "La persona no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }else{
                    // mostrar los datos de miPrersona en la ventan CRUD
                    muestraPersona(miPersona);
                }

            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Error al consultar: "+e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == botonCancelar){
            this.dispose();
        }
        if (e.getSource() == botonLimpiar){
            limpiar();

        }
        
    }
    
    
}
