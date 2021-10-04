package Model;

public class pessoas {
    
    private int pes_id;
    private String pes_nome;
    private String pes_rg;
    private String pes_cpf;
    private String pes_end;
    private String pes_tel;
    private int status;
    
    public int getPes_id() {
        return pes_id;
    }

  
    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

   
    public String getPes_nome() {
        return pes_nome;
    }

    
    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    
    public String getPes_rg() {
        return pes_rg;
    }

   
    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }

    
    public String getPes_cpf() {
        return pes_cpf;
    }

    
    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

   
    public String getPes_end() {
        return pes_end;
    }

    
    public void setPes_end(String pes_end) {
        this.pes_end = pes_end;
    }

    
    public String getPes_tel() {
        return pes_tel;
    }

    
    public void setPes_tel(String pes_tel) {
        this.pes_tel = pes_tel;
    }

    
    public int getPes_status() {
        return status;
    }

   
    public void setPes_status(int status) {
        this.status = status;
    }

    public pessoas() {
    }

    public pessoas(int pes_id, String pes_nome, String pes_rg, String pes_cpf, String pes_end, String pes_tel, int status) {
        this.pes_id = pes_id;
        this.pes_nome = pes_nome;
        this.pes_rg = pes_rg;
        this.pes_cpf = pes_cpf;
        this.pes_end = pes_end;
        this.pes_tel = pes_tel;
        this.status = status;
    }
 
}
   