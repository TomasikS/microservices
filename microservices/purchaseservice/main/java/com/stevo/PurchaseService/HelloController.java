package com.stevo.PurchaseService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    Database db = new Database();

    @GET
    public String sayHello() {
        return "Hello World";
    }

    /**
     *
     * @param nakup
     */
    @POST
    @Path("/add/")
    @Consumes("application/json")
    public void addNakup(Purchase nakup)throws  WebApplicationException {
        
        if (nakup == null) throw new WebApplicationException(Response.Status.BAD_REQUEST);
        
        else if (null != nakup) {
        try {
            db.insertData(nakup);
            
            
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    @DELETE
    @Path("/delete/{id}")
    public void deleteNakup(@PathParam("id") int id) throws SQLException, ClassNotFoundException, IOException  {
  
        Purchase nakup=db.findbyId(id);
      if (nakup == null) throw new WebApplicationException(Response.Status.BAD_REQUEST);
      else{  db.remove(nakup.getId());
      } 
            
            
       
       
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNakup(@PathParam("id") int id) throws SQLException, IOException, ClassNotFoundException{
     //   
     Purchase nakup=db.findbyId(id);
      if (nakup == null) throw new WebApplicationException(Response.Status.BAD_REQUEST);
      else return Response.ok(nakup).build();
     
    }

}
