package com.tsystems.tu;


import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsystems.tu.negocio.logica.ColisionBO;

//GET : http://servidor/app/rest/usuario
//GET : http://servidor/app/rest/usuario/1 <-- PathParam
//POST: http://servidor/app/rest/usuario 	<-- JSON
//PUT:  http://servidor/app/rest/usuario	<-- JSON
//DELETE: http://servidor/app/rest/usuario/1 <-- PathParam
@Path("/usuario")
public class UsuarioRESTService {
	
	private static final Logger LOG = LogManager.getLogger();
	
	@EJB
	private ColisionBO colisionBO;
	
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDTO> obtenerUsuario(){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response obtenerUsuario(@PathParam("id") final long id) {
		LOG.info("Obtener Usuario por id: "+ id);
		//invocar al EJB
		//retornar el resultado
		UserDTO usuarioDto = new UserDTO("usuario", "usuario"+id+"@t-systems.com");
		return Response.ok(usuarioDto).build();
	}
	
}
