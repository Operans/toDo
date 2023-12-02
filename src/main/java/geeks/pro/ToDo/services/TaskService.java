package geeks.pro.ToDo.services;

import geeks.pro.ToDo.models.Task;
import java.util.List;

public interface TaskService {

    Task save(Task task);

    List<Task> findAll();

    Task findById(Long id);

    boolean delete(Long id);
}
