package com.taskToDO.dropWizardTask;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({
"id",
"Name",
"Description"
})
public class Task {
 	@NotNull
    @JsonProperty("id")
 	private Integer id;
 	
    @JsonProperty("Name") 	
    private String name;
    
    @JsonProperty("Description") 
    private String description;
    
    public Task(int id,String name, String Desc)
    {
    	this.id = id;
    	this.name = name;
    	this.description = Desc;
    }
    public Task()
    {}

    public int getId()
    {
    	return this.id;
    }
    public void setId(int id)
    {
    	this.id = id;
    }
   
    public String getName()
    {
    	return this.name;
    }
    public void setName(String Name)
    {
    	this.name = Name;
    }
    public String getDescription()
    {
    	return this.description;
    }
    public void setDescription(String Dessssc)
    {
    	this.description = Dessssc;
    }
}
