<%@ page import="model.UsuarioCredito" %>
<%@ page import="model.UsuarioCredito" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Dados do Usuário</title>
        <meta charset="UTF-8">
                <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                color: #333;
                text-align: center;
                padding: 50px;
            }
            h1 {
                color: #0056b3;
            }
            p {
                background-color: #e9e9e9;
                padding: 10px;
                margin: 10px auto;
                width: 50%;
                border-radius: 5px;
            }
        </style>
    </head>
    <body>
        <%
            UsuarioCredito user = new UsuarioCredito();
            user.setNome(request.getParameter("name_user"));
            user.setCpf(request.getParameter("cpf_user"));
            user.setRendaMensal(Float.parseFloat(request.getParameter("renda_user")));
            user.setProfissao(request.getParameter("profissao_user"));
            user.setEndereco(request.getParameter("endereco_user"));
            user.setTelefone(request.getParameter("telefone_user"));
            user.setEmail(request.getParameter("email_user"));
        %>

        <h1>Dados do Usuário</h1>
        <p>Nome: <%= user.getNome() %></p>
        <p>CPF: <%= user.getCpf() %></p>
        <p>Renda Mensal: R$ <%= user.getRendaMensal() %></p>
        <p>Profissão: <%= user.getProfissao() %></p>
        <p>Endereço: <%= user.getEndereco() %></p>
        <p>Telefone: <%= user.getTelefone() %></p>
        <p>Email: <%= user.getEmail() %></p>
    </body>
</html>
