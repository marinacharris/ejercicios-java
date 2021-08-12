import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class App extends JFrame{

    public App(){
        String[] nombreColumnas = {"Nombre", "Edad", "Extranjero"};
        Object[][] datos = {
            {"Ana", 30, false},
            {"Jean", 25, true},
            {"Carlos",40, false}
        };
        DefaultTableModel modelo = new DefaultTableModel(datos,nombreColumnas);
        JTable tabla = new JTable(modelo);

        // insertar columna nueva
        String[] columnaNueva = {"Contadora","Ingeniero","Abogado"};
        modelo.addColumn("Profesion", columnaNueva);
        

        //insertar fila
        Object[] filaNueva = {"Diego",19, false,"Estudiante"};
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);
        modelo.addRow(filaNueva);

        //cambiar valor de la tabla
        modelo.setValueAt("Ana María", 0, 0); // (valor, fila, columna)

        tabla.setPreferredScrollableViewportSize(new Dimension(250,100));
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane);




    }
    public static void main(String[] args) throws Exception {
        App ventana = new App();
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);


    }
}
