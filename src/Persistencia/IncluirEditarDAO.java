package Persistencia;

import Model.pessoas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirEditarDAO {

    pessoas objpes = new pessoas();
    
    public int Incluir(pessoas objpes) throws SQLException

    {          
          Conexao conexao = new Conexao();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO pessoas(pes_nome,pes_rg, pes_cpf,pes_end,pes_tel,pes_status)"+
     " VALUES (?,?,?,?,?,?)"))                               {
          pstmt.setString(1,objpes.getPes_nome().toUpperCase().trim());
          pstmt.setString(2,objpes.getPes_rg().trim());
          pstmt.setString(3,objpes.getPes_cpf().trim());
          pstmt.setString(4,objpes.getPes_end().trim());
          pstmt.setString(5,objpes.getPes_tel().trim()); 
          pstmt.setInt(6,objpes.getPes_status());
                  
          registros = pstmt.executeUpdate();        
    }
          
    PreparedStatement pstmtAux = conexao.getConnection().prepareStatement("SELECT @@IDENTITY");
    ResultSet rs = pstmtAux.executeQuery();
    int codigo = 0;
    
    if ((registros==1)&&(rs != null)){
        rs.next();
        codigo = rs.getInt(1);
        return codigo; }
    else {
        return codigo;}
    
    
    }//fim do metodo incluir
    
    public boolean Editar (pessoas objpes) throws SQLException
        {       
           Conexao conexao = new Conexao();
           int registros;
           try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
               ("update pessoas set pes_nome=?, pes_rg=?,pes_cpf=?, pes_end=?, pes_tel=?,pes_status where pes_id =?")){
                   
               pstmt.setString(1,objpes.getPes_nome().toUpperCase().trim());
               pstmt.setString(2,objpes.getPes_rg().trim());
               pstmt.setString(3,objpes.getPes_cpf().trim());
               pstmt.setString(4,objpes.getPes_end().trim());
               pstmt.setString(5,objpes.getPes_tel().trim());        
               pstmt.setInt(6,objpes.getPes_status());
               pstmt.setInt(7,objpes.getPes_id());
               registros = pstmt.executeUpdate();
           }  
           if (registros ==1){
               return true;}
           else {
               return false; } 
               
           
           
           }
    
}
