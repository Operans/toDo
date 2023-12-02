package geeks.pro.ToDo.dao;

import geeks.pro.ToDo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRep extends JpaRepository<Task, Long> {
}
