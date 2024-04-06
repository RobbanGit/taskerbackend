package robban.taskerbackend.service;

import robban.taskerbackend.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    public Task addTask(Task task);
    public Task getTaskById(long id);
    public List<Task> getTasks();
    public Task updateTask(Task task);
    public void deleteTask(long id);
    
}