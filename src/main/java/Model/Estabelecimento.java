
package Model;

public class Estabelecimento {

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @return the categoria
     */
    public String[] getCategoria() {
        return categoria;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }
    
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
                                  "FOOD TRUCK"};
    
    
    
    
    
    
    
}
