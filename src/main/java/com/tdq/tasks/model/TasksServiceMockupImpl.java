package com.tdq.tasks.model;

import java.time.LocalDateTime;
import java.util.Arrays;
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

    public TasksServiceMockupImpl() {
        TaskDto task1 = new TaskDto();
        task1.setType(TaskDto.Type.OPTIONS);
        task1.setId(UUID.randomUUID());
        task1.setDate(LocalDateTime.now().minusDays(3).toString());
        task1.setName("Task 1");
        task1.setAuthor("Nikolay");
        task1.setOptions(Arrays.asList(new OptionDto(1, "Option 1"), new OptionDto(2, "Option 2"), new OptionDto(3, "Option 3")));
        task1.setDescription("Description of task 1");

        tasks.add(task1);

        System.err.println("TasksServiceMockupImpl initialized");
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
