package controlador;

import java.sql.SQLException;

import modelo.dao.PersonaDao;
import modelo.vo.PersonaVo;
import vista.VentanaCRUD;
import vista.VentanaPrincipal;

public class Controller {
    private PersonaDao personadao;

    public Controller(){
        this.personadao = new PersonaDao();
    }
    
    public PersonaVo consultarPersonas(int codigo) throws SQLException{
        return this.personadao.consultarPersona(codigo);
    }
    public void mostrarVentanaCRUD(){
        VentanaCRUD vBuscar = new VentanaCRUD();
        vBuscar.setVisible(true);
    }

    public void mostrarVentanaPrincipal(){
        VentanaPrincipal vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);
    }
}
