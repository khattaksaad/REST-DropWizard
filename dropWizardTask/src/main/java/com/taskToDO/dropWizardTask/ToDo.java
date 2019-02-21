package com.taskToDO.dropWizardTask;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
 
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({
"id",
"name",
"description",
"tasks"
})
public class ToDo {
	
	 	@NotNull
	    @JsonProperty("id")
	    private Integer id;
	 	
	    @JsonProperty("name")
	    private String Name;
	    
	    @JsonProperty("description")
	    private String Description;
	    
	    @JsonProperty("tasks")
	    private List<Task> Tasks = null;
	    
	    public ToDo(){
	    }
	    
	    public ToDo(Integer id, String name, String description, List<Task> tasks) {
	        this.id = id;
	        this.Name = name;
	        this.Description = description;
	        this.Tasks = tasks;
	    }
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public String getName() {
	        return Name;
	    }
	    public void setName(String name) {
	        this.Name = name;
	    }


	    public String getDescription() {
	        return Description;
	    }


	    public void setDescription(String description) {
	        this.Description = description;
	    }
	    public List<Task> getTasks() {
	        return Tasks;
	    }
	    public void setTasks(List<Task> tsks) {
	        this.Tasks = tsks;
	    }
}
