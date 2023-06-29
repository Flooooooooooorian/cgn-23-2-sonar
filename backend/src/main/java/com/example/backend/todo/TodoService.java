package com.example.backend.todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<String> getAllTodos() {
        return todoRepository.getAllTodos();
    }

}
