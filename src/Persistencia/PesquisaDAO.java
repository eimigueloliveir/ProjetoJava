package Persistencia;

import Model.pessoas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisaDAO {
    
    pessoas objpes = new pessoas();
    public boolean PesquisaTela(pessoas objpes) throws SQLException
    {
        int cod=objpes.getPes_id();
        
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = 
       conexao.getConnection().prepareStatement(
        "SELECT * FROM pessoas where pes_id =?");
        pstmt.setInt(1,cod);
        
        ResultSet rs= pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setPes_nome(rs.getString("pes_nome"));
            objpes.setPes_rg(rs.getString("pes_rg"));
            objpes.setPes_cpf(rs.getString("pes_cpf"));
            objpes.setPes_end(rs.getString("pes_end"));
            objpes.setPes_tel(rs.getString("pes_tel"));
            objpes.setPes_status(rs.getInt("pes_status"));
    }
        return true;
    }
}


