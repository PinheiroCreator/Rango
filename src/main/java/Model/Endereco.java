package Model;

public class Endereco {

    private long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    
    

    public long getId() {
        return id;
    }


    public String getRua() {
        return rua;
    }


    public String getNumero() {
        return numero;
    }


    public String getBairro() {
        return bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public String getEstado() {
        return estado;
    }


    public String getCep() {
        return cep;
    }

    
    public String getComplemento() {
        return complemento;
    }


    public void setId(long id) {
        this.id = id;
    }

 
    public void setRua(String rua) {
        this.rua = rua;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void Endereco (long id, String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento) {

        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }
    
}
