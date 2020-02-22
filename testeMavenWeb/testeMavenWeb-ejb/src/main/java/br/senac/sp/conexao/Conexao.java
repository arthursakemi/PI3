/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arthur.msakemi
 */
public class Conexao {

    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDataSource");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnexao() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/senac",
                "senac",
                "senac");
        return con;
    }

}
