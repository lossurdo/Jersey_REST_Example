package com.targettrust.cxfrestexample.soap;

import com.targettrust.cxfrestexample.bean.Cliente;
import com.targettrust.cxfrestexample.servico.ServicoCRUD;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "servico")
public class MeuServicoSoap extends ServicoCRUD {

    @WebMethod(operationName = "excluir")
    @Override
    public Boolean acaoExcluir(@WebParam(name = "cliente") Cliente cliente) {
        return super.acaoExcluir(cliente);
    }

    @WebMethod(operationName = "alterar")
    @Override
    public Boolean acaoAlterar(@WebParam(name = "cliente") Cliente cliente) {
        return super.acaoAlterar(cliente);
    }

    @WebMethod(operationName = "cadastrar")
    @Override
    public Boolean acaoCadastrar(@WebParam(name = "cliente") Cliente cliente) {
        return super.acaoCadastrar(cliente);
    }

    @WebMethod(operationName = "consultar")
    @Override
    public Cliente acaoConsultar(@WebParam(name = "cliente") Cliente cliente) {
        return super.acaoConsultar(cliente);
    }

    @WebMethod(operationName = "listar")
    @Override
    public List<Cliente> acaoListar() {
        return super.acaoListar();
    }
    
}
