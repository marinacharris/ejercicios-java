package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.vo.PersonaVo;
import util.JDBCUtilities;

public class PersonaDao {
    
    public PersonaVo consultarPersona(int codigo) throws SQLException{
        Connection conex = JDBCUtilities.getConnection();
        PersonaVo persona = new PersonaVo();
        boolean existe = false;
        try {
            String sql = "select * from persona where id = ?";
            PreparedStatement consulta = conex.prepareStatement(sql);
            consulta.setInt(1, codigo);
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                existe =true;
                persona.setIdPersona(res.getInt("id"));
                persona.setNombrePersona(res.getString("nombre"));
                persona.setEdadPersona(res.getInt("edad"));
                persona.setProfesionPersona(res.getString("profesion"));
                persona.setTelefonoPersona(res.getInt("telefono"));
            }
            res.close();
            conex.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la BD:"+e);
        }
        if (existe){
            return persona;
        }else{
            return null;
        }

    }
}
