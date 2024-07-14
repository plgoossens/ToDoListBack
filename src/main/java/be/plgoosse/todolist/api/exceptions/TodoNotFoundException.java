package be.plgoosse.todolist.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "To do not found")
public class TodoNotFoundException extends RuntimeException{
}
