package com.diallodev.tasks;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();


    public List<Task> findAll() {
        return tasks;
    }

    public void create(Task task) {
        tasks.add(task);
    }

    public void delete(String id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    @PostConstruct
    private void init() {
        tasks.addAll(List.of(
                new Task("Complete project python"),
                new Task("Review code changes"),
                new Task("Mentoring junior"),
                new Task("Refactoring source code"),
                new Task("Plan next sprint"),
                new Task("Run unit tests"),
                new Task("Fixed reporting bugs"),
                new Task("Update documentation")
        ));
    }
}
