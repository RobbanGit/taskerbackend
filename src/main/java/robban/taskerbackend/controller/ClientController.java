package robban.taskerbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import robban.taskerbackend.model.Task;
import robban.taskerbackend.service.TaskService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController{
    //service
    @Autowired
    private TaskService TaskService;

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    //Add patient
    @PostMapping("/tasks")
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
    public Task updateTask(@PathVariable("id") long id, @RequestBody Task task){
        return TaskService.updateTask(id, task);
    }

    //Update Task By Id
    @PatchMapping("/tasks/{id}")
    public Task updateTaskById(@PathVariable("id") long id, @RequestBody Task task){
        return TaskService.updateTask(id, task);
    }

    //Delete Task By Id
    @DeleteMapping("tasks/{id}")
    public String deleteTask(@PathVariable("id") long id){
        TaskService.deleteTask(id);
        return "Task with id: " + id + " has been deleted successfully!";
    }

    //Delete All Tasks
    @DeleteMapping("tasks")
    public String deleteAllTasks(){
        TaskService.deleteTask();
        return "All tasks have been deleted successfully!";
    }

}