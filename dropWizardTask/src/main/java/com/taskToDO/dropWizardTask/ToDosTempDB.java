package com.taskToDO.dropWizardTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.taskToDO.dropWizardTask.ToDo;
import com.taskToDO.dropWizardTask.Task;
public class ToDosTempDB {
	public static HashMap<Integer, ToDo> to_dos = new HashMap<>();
    public ToDosTempDB(){
    	ArrayList<Task> tks = new ArrayList<Task>();
    	tks.add(new Task(1,"Play Piano","Read notes, play piano"));
    	tks.add(new Task(2,"Table Tennis time","Grab your racket coz its Ping pong time.."));
    	
    	to_dos.put(1, new ToDo(1, "Task1", "Something related to task1",null));
    	to_dos.put(2, new ToDo(2, "Daily tasks", "To be done by today",tks));
    	to_dos.put(3, new ToDo(3, "Misc....", "Something about task 3",null));
    } 
    public List<ToDo> getToDos(){
        return new ArrayList<ToDo>(to_dos.values());
    }
     
    public ToDo getToDo(Integer id){
        return to_dos.get(id);
    }
     
    public void updateToDo(Integer id, ToDo tDo){
    	to_dos.put(id, tDo);
    }
     
    public void removeToDo(Integer id){
    	to_dos.remove(id);
    }
}
