package app;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") @DefaultValue("welcome") String msg ) {

//		GetMsgService getMsgService = new GetMsgService();
//
//		return Response.status(200).entity(getMsgService.getMsg("IT man", msg)).build();
		return Response.status(200).entity("Hello").build();

	}

}