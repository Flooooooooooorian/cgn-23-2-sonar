package com.example.backend.todo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private List<String> todos = new ArrayList<>();

    public List<String> getAllTodos() {
        return todos;
    }
}
