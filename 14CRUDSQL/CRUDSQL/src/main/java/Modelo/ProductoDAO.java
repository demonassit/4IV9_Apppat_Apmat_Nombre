/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.SQLException;

/**
 *
 * @author demon
 */

import java.sql.*;
public class ProductoDAO {
    
    //aqui voy a programar cada comportamiento
    
    public void agregar(Producto prod) throws SQLException{
        //primero debo de crear su sentencia sql
        String sql = "INSERT INTO producto (id, nombre, precio, cantidad, "
                + "categoria, tipo, fecha_caducidad, es_precedero, peso, marca"
                + "garantia_meses, talla, color, material) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        
        try{
            //primero debes de conectarte al la BD
            Connection con = ConexionBD.getConexion();
            //prepara la sentencia
            PreparableStatement ps = con.prepareStatement(sql);
        }
    }
    
}
