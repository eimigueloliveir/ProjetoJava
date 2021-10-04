package Persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirDAO {
    
    public boolean Excluir(int cod) throws SQLException{
        Conexao conexao = new Conexao();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from pessoas where pes_id=?")){
            pstmt.setInt(1,cod);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
    
}


