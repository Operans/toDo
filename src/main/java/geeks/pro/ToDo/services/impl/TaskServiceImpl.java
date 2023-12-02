package geeks.pro.ToDo.services.impl;

import geeks.pro.ToDo.dao.TaskRep;
import geeks.pro.ToDo.models.Task;
import geeks.pro.ToDo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRep rep;

    @Autowired
    public TaskServiceImpl(TaskRep taskRep) {
        this.rep = taskRep;
    }

    @Override
    public Task save(Task task) {
        return rep.save(task);
    }

    @Override
    public List<Task> findAll() {
        return rep.findAll();
    }

    @Override
    public Task findById(Long id) {
        return rep.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public boolean delete(Long id) {
        try {
            rep.delete(findById(id));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
