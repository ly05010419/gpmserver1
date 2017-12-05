package com.management.server1;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/thesisService")
public class ThesisService {

	ThesisDao thesisDao = new ThesisDao();

	@GET
	@Path("/thesis/{id}")
	public Thesis getThesisById(@PathParam("id") int id) {
		return thesisDao.getThesisById(id);
	}
	
	@GET
	@Path("/thesis")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Thesis> getThesis() {
		
		System.out.println("RestService：ThesisService wurde zugegriffen");
		
		return thesisDao.getAllThesis();
	}
	
	

	@POST
	@Path("/thesis")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newThesis(
			@FormParam("studentId") int studentId,
            @FormParam("supervisor") String supervisor,
            @FormParam("title") String title,
            @FormParam("approved") int approved
            ) {
		
		thesisDao.saveThesis(studentId,supervisor,title,approved);
	}
	
	
	@DELETE  
	@Path("/thesis/{id}")
    public void deleteThesis(@PathParam("id")int id){  
		thesisDao.deleteThesis(id);
    }  
}





