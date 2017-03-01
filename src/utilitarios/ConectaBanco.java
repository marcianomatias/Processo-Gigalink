/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marci
 */
public class ConectaBanco {
   public Statement stm;
   public ResultSet rs;
   private final String DRIVER = "com.msql.jdbc.Driver";
   private final String URL = "jdbc:mysql://localhost:3306/bd_vendas";
   private final String usuario = "root";
   private final String senha = "emcasa12";
   public Connection conn;
   
   public void conexao(){
      
       try {
           System.setProperty("jdbc.Driver", DRIVER);
           conn = DriverManager.getConnection(URL, usuario, senha);
           JOptionPane.showMessageDialog(null, "SEJA BEM VINDO!!!");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro de conexão ao BD !!! \n Erro:"+ex.getMessage());
       }   
   }
   public void executaSQL(String sql){
       try {
           stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm .executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro EXECUTA sql !!! \n Erro:"+ex.getMessage());
       }
   }
   public void desconecta(){
       try {
           conn.close();
           JOptionPane.showMessageDialog(null, "Desconectado com Sucesso ao BD!!!");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão ao BD !!! \n Erro:"+ex.getMessage());
       }
   
   }

    public void Conexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Desconecta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  }
