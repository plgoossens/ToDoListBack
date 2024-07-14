package be.plgoosse.todolist.api.mappers;

import be.plgoosse.todolist.api.dto.CreateTodoDTO;
import be.plgoosse.todolist.api.dto.TodoDTO;
import be.plgoosse.todolist.domain.entities.Todo;

import java.util.List;
import java.util.stream.Collectors;

public class TodoMapper {

    public static Todo toRest(CreateTodoDTO createTodoDTO) {
        if (createTodoDTO == null) {
            return null;
        }
        Todo todo = new Todo();
        todo.setContent(createTodoDTO.getContent());
        return todo;
    }

    public static List<TodoDTO> toDTO(List<Todo> todoList) {
        if (todoList == null) {
            return List.of();
        }
        return todoList.stream()
                .map(TodoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static TodoDTO toDTO(Todo todo) {
        if (todo == null) {
            return null;
        }
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setId(todo.getId());
        todoDTO.setContent(todo.getContent());
        todoDTO.setChecked(todo.getChecked());
        return todoDTO;
    }
}
