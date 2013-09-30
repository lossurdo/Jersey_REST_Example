package com.targettrust.cxfrestexample.util;

import com.targettrust.cxfrestexample.bean.Cliente;
import java.util.ArrayList;
import java.util.List;

public class GeradorDados {

    private static final ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();;
    
    private GeradorDados() {
        listaCliente.add(new Cliente(1, "Dexter Morgan"));
        listaCliente.add(new Cliente(2, "Debra Morgan"));
        listaCliente.add(new Cliente(3, "Harrison Morgan"));
        listaCliente.add(new Cliente(4, "Hannah McKay"));
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void inicializarLista(List<Cliente> cliente) {
        listaCliente.clear();
        listaCliente.addAll(cliente);
    }
    
    public static GeradorDados getInstance() {
        return GeradorDadosHolder.INSTANCE;
    }
    
    private static class GeradorDadosHolder {

        private static final GeradorDados INSTANCE = new GeradorDados();
    }
}
