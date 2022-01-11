package Persistencia;

import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class Conexao {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","1313");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }

    public Object getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
} 
            
     
