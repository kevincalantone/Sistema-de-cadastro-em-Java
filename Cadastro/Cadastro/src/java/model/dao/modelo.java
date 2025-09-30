package model.DAO;

import config.ConectaBanco;
import model.UsuarioCredito;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class modelo {

    public boolean cadastrar(UsuarioCredito user) {
        try {
            Connection conn = ConectaBanco.conectar(); // abre a conexão
            String sql = "INSERT INTO UsuarioCredito(nome, cpf, rendaMensal, profissao, endereco, telefone, email) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getCpf());
            ps.setFloat(3, user.getRendaMensal());
            ps.setString(4, user.getProfissao());
            ps.setString(5, user.getEndereco());
            ps.setString(6, user.getTelefone());
            ps.setString(7, user.getEmail());

            ps.executeUpdate(); // executa INSERT
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
