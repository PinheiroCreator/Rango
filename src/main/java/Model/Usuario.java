
package Model;


import Persistencia.IUsuarioCRUD;

public class Usuario {
    
    private long id; 
    private String cpf, nome, email;
    private String telefone;


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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override

        public String toString() {

            return  "Usuario{" + "id_Usuario=" + id + ", nome="
                    + nome + ", telefone = " + telefone + ", email=" + email + "}";
    }

    public Usuario (int id,String cpf, String nome, String email, String telefone) {

        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }
}
