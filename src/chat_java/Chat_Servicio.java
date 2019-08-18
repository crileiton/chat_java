/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author crileiton
 */
public class Chat_Servicio {

    private final String tabla = "personas";

    public Chat_Java recuperarPorNombre(Connection conexion, String nombre) throws SQLException {
        Chat_Java miChat = null;
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT nombre FROM " + this.tabla + " WHERE nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                miChat = new Chat_Java(resultado.getString("nombre"));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return miChat;
    }
}
