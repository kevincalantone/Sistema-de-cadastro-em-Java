package model;

public class UsuarioCredito {
    private String nome;
    private String cpf;
    private float rendaMensal;
    private String profissao;
    private String endereco;
    private String telefone;
    private String email;

    public UsuarioCredito() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public float getRendaMensal() { return rendaMensal; }
    public void setRendaMensal(float rendaMensal) { this.rendaMensal = rendaMensal; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
