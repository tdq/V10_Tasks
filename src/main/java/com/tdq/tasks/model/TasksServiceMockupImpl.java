package com.tdq.tasks.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.constraints.NotNull;

/**
 * Tasks service (Mockup)
 *
 * @author Nikolay Gorokhov
 */
public class TasksServiceMockupImpl implements TasksService {
   
    private final List<TaskDto> tasks = new LinkedList<>();
    private static TasksServiceMockupImpl instance = new TasksServiceMockupImpl();

    private TasksServiceMockupImpl() {}

    public static TasksServiceMockupImpl getInstance() {
        return instance;
    }

    @Override
    public List<TaskDto> getTasks() {
        return this.tasks;
    }

    @Override
    public void save(@NotNull TaskDto task) {
        Objects.requireNonNull(task);

        if(task.getId() == null) {
            task.setId(UUID.randomUUID());
            tasks.add(task);
        }
    }

    @Override
    public void delete(@NotNull TaskDto task) {
        this.tasks.remove(Objects.requireNonNull(task));
    }
}
