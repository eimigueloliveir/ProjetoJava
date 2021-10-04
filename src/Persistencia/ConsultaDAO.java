package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaDAO {


public static ResultSet carregaTabela() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT pes_nome,pes_rg,pes_cpf,pes_tel,pes_status FROM pessoas");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }

 public static ResultSet filtrar (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like'"+arg+"%'";
        
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT pes_nome,pes_rg,pes_cpf,pes_tel,pes_status FROM pessoas where " + argumento);
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }

}
