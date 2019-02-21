package com.taskToDO.dropWizardTask;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.taskToDO.dropWizardTask.ToDosTempDB;
@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)

public class TodoController {

	private ToDosTempDB tb;
	public TodoController() {
        tb = new ToDosTempDB();
    }
	// Get List of ToDos - Parameter : none
	@GET
    public Response getToDos() {
		List<ToDo> td = tb.getToDos();
		
        return Response.ok(td).build();
    }
	//Get single ToDo - Parameter : ID
    @GET
    @Path("/{id}")
    public Response getToDoById(@PathParam("id") Integer id) {
        ToDo tDo = tb.getToDo(id);
        if (tDo != null)
            return Response.ok(tDo).build();
        else
            return Response.status(Status.NOT_FOUND).build();
    }
    //Delete single ToDo - Parameter : ID
    @DELETE
    @Path("/{id}")
    public Response deleteToDoById(@PathParam("id") Integer id) {
        ToDo tDo = tb.getToDo(id);
        if (tDo != null) {
            tb.removeToDo(id);
            return Response.ok().build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
    
    
    // Post a new ToDo - Parameter : ToDO object
    @POST
    public Response createToDo(ToDo p_todo) throws URISyntaxException {
        // validation
        
        if (p_todo != null) {
        	int id = tb.getToDos().size()+1;
        	p_todo.setId(id);
        	tb.updateToDo(id, p_todo);
            return Response.ok(p_todo).build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
    // overwrite an existing ToDO : Parameter : ID, ToDo obj - to be modified
    @PUT
    @Path("/{id}")
    public Response updateToDoByID(@PathParam("id") Integer id, ToDo p_todo) {
        // validation
        ToDo tdo = tb.getToDo(id);
        if (tdo != null) {
            p_todo.setId(id);
            tb.updateToDo(id, p_todo);
            return Response.ok(p_todo).build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
    
    
    
}
