package com.targettrust.cxfrestexample.servico;

import com.targettrust.cxfrestexample.bean.Cliente;
import com.targettrust.cxfrestexample.util.GeradorDados;
import java.util.ArrayList;
import java.util.List;

public abstract class ServicoCRUD {

    public Boolean acaoExcluir(Cliente cliente) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>(GeradorDados.getInstance().getListaCliente());
        for (Cliente c : lista) {
            if (c.getCodigo().equals(cliente.getCodigo())) {
                lista.remove(c);
                GeradorDados.getInstance().inicializarLista(lista);
                return true;
            }
        }
        return false;
    }

    public Boolean acaoAlterar(Cliente cliente) {
        ArrayList<Cliente> lista = GeradorDados.getInstance().getListaCliente();
        for (Cliente c : lista) {
            if (c.getCodigo().equals(cliente.getCodigo())) {
                c.setCodigo(cliente.getCodigo());
                c.setNome(cliente.getNome());
                return true;
            }
        }
        return false;
    }

    public Boolean acaoCadastrar(Cliente cliente) {
        GeradorDados.getInstance().getListaCliente().add(cliente);
        return true;
    }

    public Cliente acaoConsultar(Cliente cliente) {
        ArrayList<Cliente> lista = GeradorDados.getInstance().getListaCliente();
        for (Cliente c : lista) {
            if (c.getCodigo().equals(cliente.getCodigo())) {
                return c;
            }
        }
        return null;
    }

    public List<Cliente> acaoListar() {
        return GeradorDados.getInstance().getListaCliente();
    }
}
