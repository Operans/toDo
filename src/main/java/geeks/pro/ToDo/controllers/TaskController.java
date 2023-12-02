package geeks.pro.ToDo.controllers;

import geeks.pro.ToDo.models.Task;
import geeks.pro.ToDo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService service;

    @Autowired
    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody Task task) {
        return new ResponseEntity<>(service.save(task), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findById")
    ResponseEntity<?> findById(@RequestParam Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/delete")
    ResponseEntity<?> delete(@RequestParam Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

}
