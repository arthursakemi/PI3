/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.ejb;

import br.senac.sp.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arthur.msakemi
 */
public class ClienteEJB {

    public List<String> getNomes() {
        List<String> nomes = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexao.getConnexao();
            String sql = "SELECT nome FROM cliente";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                nomes.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteEJB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteEJB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return nomes;
    }

}
