package robban.taskerbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import robban.taskerbackend.model.Task;
import robban.taskerbackend.service.TaskService;

import java.util.List;

@RestController
public class ClientController{
    //service
    @Autowired
    private TaskService TaskService;

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    //Add patient
    @PostMapping("/add")
    public String addTask(@RequestBody Task task){
        TaskService.addTask(task);
        return "Task added successfully!";
    }
    
    //Get Task By Id
    @RequestMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable("id") long id){
        return TaskService.getTaskById(id);
    }
    
    //Get All Tasks
    @RequestMapping("/tasks")
    public List<Task> getAllTasks(){
        return TaskService.getTasks();
    }

    //Update Task By Id
    @PutMapping("/tasks/{id}")
    public Task updateTask(@RequestBody Task task){
        return TaskService.updateTask(task);
    }

    //Delete Task By Id
    @DeleteMapping("task/{id}")
    public String deleteTask(@PathVariable("id") long id){
        TaskService.deleteTask(id);
        return "Task with id: " + id + " has been deleted successfully!";
    }

}