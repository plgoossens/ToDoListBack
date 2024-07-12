package be.plgoosse.todolist.service;

import be.plgoosse.todolist.api.dto.CreateTodoDTO;
import be.plgoosse.todolist.api.dto.TodoDTO;
import be.plgoosse.todolist.api.mappers.TodoMapper;
import be.plgoosse.todolist.domain.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Long createTodo(CreateTodoDTO createTodoDTO) {
        return todoRepository.save(TodoMapper.toRest(createTodoDTO)).getId();
    }

    public List<TodoDTO> getAllTodo() {
        return TodoMapper.toDTO(todoRepository.findAll());
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
