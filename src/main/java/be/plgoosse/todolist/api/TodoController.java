package be.plgoosse.todolist.api;

import be.plgoosse.todolist.api.dto.CreateTodoDTO;
import be.plgoosse.todolist.api.dto.TodoDTO;
import be.plgoosse.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<TodoDTO> getAllTodo() {
        return todoService.getAllTodo();
    }

    @PostMapping
    public Long createTodo(@RequestBody CreateTodoDTO createTodoDTO) {
        return todoService.createTodo(createTodoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
