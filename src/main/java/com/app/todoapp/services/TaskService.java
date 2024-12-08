package com.app.todoapp.services;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepo taskrepo;

    public TaskService(TaskRepo taskrepo) {
        this.taskrepo = taskrepo;
    }

    public List<Task> getAllTasks() {
        return taskrepo.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskrepo.save(task);
    }

    public void deleteTask(Long id) {
        taskrepo.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskrepo.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Task"));
        task.setCompleted(!task.isCompleted());
        taskrepo.save(task);
    }

    public void deleteAllTask() {
        taskrepo.deleteAll();
    }
}
