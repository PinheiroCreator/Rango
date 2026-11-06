
package Model;

public class Estabelecimento {

    private long id;
    private String nomeFantasia;
    private String razaoSocial;
    private String telefone;
    private String descricao;
    private boolean aberto;
    private String[] categoria = {"Lanchonete", 
                                  "Marmitaria", 
                                  "Pizzaria", 
                                  "Hamburgueria", 
                                  "Doceria", 
                                  "Padaria", 
                                  "Cafeteria", 
                                  "Acaiteria", 
                                  "Churrascaria", 
                                  "Japonesa", 
                                  "FOOD TRUCK",
                                  "Outro"};
    
    public long getId() {
        return id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAberto() {
        return aberto;
    }

    public String[] getCategoria() {
        return categoria;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }

    
    public void Estabelecimento (long id, String nomeFantasia,String razaoSocial, String telefone, String descricao, boolean aberto, String[] categoria) {

        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.descricao = descricao;
        this.aberto = aberto;
        this.categoria = categoria;
    }
    
    
    
    
}
