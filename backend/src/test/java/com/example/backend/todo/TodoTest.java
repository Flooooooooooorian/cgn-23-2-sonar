package com.example.backend.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

    TodoRepository todoRepository = new TodoRepository();
    TodoService todoService = new TodoService(todoRepository);

    @Test
    void test() {
        //GIVEN

        //WHEN
        List<String> actual = todoService.getAllTodos();

        //THEN
        assertEquals(actual, List.of());
    }
}
