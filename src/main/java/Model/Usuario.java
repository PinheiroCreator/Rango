
package Model;


public class Usuario {
    
    private long id; 
    private String cpf, nome, email;
    private int telefone;
    
    
    public long getId() { 
        return id;
    }
    
    public void setId (long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    public void Usuario (String cpf, String nome, String email, int telefone) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        
    }
}
