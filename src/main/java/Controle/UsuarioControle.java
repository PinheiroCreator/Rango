package Controle;

import Persistencia.IUsuarioCRUD;
import Model.Usuario;
import java.util.List;

public class UsuarioControle {

    private final IUsuarioCRUD crud;

    public UsuarioControle (IUsuarioCRUD crud) {
        this.crud = crud;
    }

    public void incluir (String nome, String cpf, String email, String telefone) throws Exception {

        validar (nome, cpf, email, telefone);

        crud.incluir(new Usuario(0,  cpf.trim(), nome.trim(), email.trim(), telefone.trim() ));
    }

    private void validar (String cpf, String nome, String telefone, String email) {

        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o cpf.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o nome.");
        }

        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe o Telefone.");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Informe o email.");
        }
    }
}