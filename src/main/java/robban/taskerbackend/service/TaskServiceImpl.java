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
    private TaskRepository TaskRepository;


    @Override
    public Task addTask(Task task){
        return TaskRepository.save(task);
    }

    @Override
    public Task getTaskById(long id){
        return TaskRepository.findById(id).get();
    }

    @Override
    public List<Task> getTasks(){
        return (List<Task>) TaskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task){
        return TaskRepository.save(task);
    }

    @Override
    public void deleteTask(long id){
        TaskRepository.deleteById(id);
    }

}