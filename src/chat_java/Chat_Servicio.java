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
import java.util.ArrayList;
import java.util.List;

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

    public void guardar(Connection conexion, String nombre) throws SQLException {

        try {
            PreparedStatement consulta;
            if (nombre != null || nombre != "" || nombre != " ") {
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre) VALUES(?)");
                consulta.setString(1, nombre);
                consulta.executeUpdate();
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void eliminar(Connection conexion, String pChat) throws SQLException {
        try {
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE nombre = ?");
            consulta.setString(1, pChat);
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public List<Chat_Java> recuperarTodas(Connection conexion) throws SQLException {
        List<Chat_Java> chat = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT nombre FROM " + this.tabla + " ORDER BY nombre");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                chat.add(new Chat_Java(resultado.getString("nombre")));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return chat;
    }
}
