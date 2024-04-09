package robban.taskerbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robban.taskerbackend.model.Task;
import robban.taskerbackend.repository.TaskRepository;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    //repository
    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(long id){
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> getTasks(){
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public Task updateTask(long id, Task task){
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(long id){
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteTask(){
        taskRepository.deleteAll();
    }

}