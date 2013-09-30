<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste de Interação com REST</title>
    </head>
    <body>
        <h1>Teste de Interação com REST</h1>

        <table border="1" width="70%">
            <thead>
                <tr>
                    <th>Formulário</th>
                    <th>Query String</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <form method="GET" action="rest/cliente/listar">
                            <button type="submit">Listar</button>
                        </form>
                    </td>
                    <td>
                        <a href="rest/cliente/listar">Listar</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form method="POST" action="rest/cliente/cadastrar">
                            Código: <input type="number" name="codigo" /> <br/>
                            Nome: <input type="text" name="nome" /> <br />
                            <button type="submit">Cadastrar</button>
                        </form>
                    </td>
                    <td>
                        *POST necessário
                    </td>
                </tr>
                <tr>
                    <td>
                        <form method="POST" action="rest/cliente/alterar">
                            Código: <input type="number" name="codigo" /> <br/>
                            Nome: <input type="text" name="nome" /> <br />
                            <button type="submit">Alterar</button>
                        </form>
                    </td>
                    <td>
                        *POST necessário
                    </td>
                </tr>
                <tr>
                    <td>
                        <form method="POST" action="rest/cliente/consultar">
                            Código: <input type="number" name="codigo" /> <br/>
                            <button type="submit">Consultar</button>
                        </form>
                    </td>
                    <td>
                        <a href="rest/cliente/consultar/1">Consultar Cliente de id=1</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form method="POST" action="rest/cliente/excluir">
                            Código: <input type="number" name="codigo" /> <br/>
                            <button type="submit">Excluir</button>
                        </form>                    </td>
                    <td>
                        <a href="rest/cliente/excluir/3">Excluir Cliente de id=3</a>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
