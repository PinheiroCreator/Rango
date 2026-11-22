package Persistencia;

import Model.Usuario;
import java.lang.Exception;
import java.lang.*;
import java.sql.*; // import de interface para a comunicação com o banco de dados

public class UsuarioDAO implements IUsuarioCRUD {

    private Connection conexao = null;

    public UsuarioDAO() throws Exception {

        try {
            conexao = ConexaoBD.getConexao();
        } catch (java.lang.Exception erro) {
            throw erro;
        }
    }

    @Override

    public void incluir(Usuario objUsuario) throws Exception {

        try {
            String sql = "INSERT INTO Usuario(cpf,nome,email,telefone)  VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, objUsuario.getCpf());
            preparedStatement.setString(2, objUsuario.getNome());
            preparedStatement.setString(3, objUsuario.getEmail());
            preparedStatement.setString(4, objUsuario.getTelefone());

            preparedStatement.executeUpdate();

        } catch (SQLException erroSQL) {
            // Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL ERRO INCLUIR: " + erroSQL.getMessage());
        }
    }
}