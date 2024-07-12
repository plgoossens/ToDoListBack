package be.plgoosse.todolist.domain.repositories;

import be.plgoosse.todolist.domain.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    Todo save(Todo todo);
}
