package com.targettrust.cxfrestexample.rest;

import com.google.gson.Gson;
import com.targettrust.cxfrestexample.bean.Cliente;
import com.targettrust.cxfrestexample.servico.ServicoCRUD;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Descrição dos tipos de chamadas:
 *
 * GET defines a reading access of the resource without side-effects. The
 * resource is never changed via a GET request, e.g. the request has no side
 * effects (idempotent).
 *
 * PUT creates a new resource, must also be idempotent.
 *
 * DELETE removes the resources. The operations are idempotent, they can get
 * repeated without leading to different results.
 *
 * POST updates an existing resource or creates a new resource.
 *
 */
@Path("/cliente")
public class ClienteRest extends ServicoCRUD {

    private Gson gson;

    public ClienteRest() {
        gson = new Gson();
    }

    @GET
    public Response info() {
        return Response.ok("Jersey ok!", MediaType.APPLICATION_JSON_TYPE).build();
    }

    @GET
    @Path("/listar")
    public Response listar() {
        String json = gson.toJson(super.acaoListar());
        return Response.ok(json, MediaType.APPLICATION_JSON_TYPE).build();
    }

    @POST
    @Path("/cadastrar")
    public Response cadastrar(
            @FormParam("codigo") Integer codigo,
            @FormParam("nome") String nome) {
            return Response.ok(super.acaoCadastrar(new Cliente(codigo, nome)).toString()).build();
    }

    @POST
    @Path("/consultar")
    public Response consultarForm(@FormParam("codigo") Integer codigo) {
        return consultar(codigo);
    }

    @GET
    @Path("/consultar/{codigo}")
    public Response consultar(@PathParam("codigo") Integer codigo) {
        return Response.ok(gson.toJson(super.acaoConsultar(new Cliente(codigo)))).build();
    }

    @POST
    @Path("/excluir")
    public Response excluirForm(@FormParam("codigo") Integer codigo) {
        return excluir(codigo);
    }

    @GET
    @Path("/excluir/{codigo}")
    public Response excluir(@PathParam("codigo") Integer codigo) {
        return Response.ok(super.acaoExcluir(new Cliente(codigo)).toString()).build();
    }

    @POST
    @Path("/alterar")
    public Response alterar(
            @FormParam("codigo") Integer codigo,
            @FormParam("nome") String nome) {        
        return Response.ok(super.acaoAlterar(new Cliente(codigo, nome)).toString()).build();
    }
}
