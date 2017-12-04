package com.tdq.tasks.model;

import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * Tasks service interface
 *
 * @author Nikolay Gorokhov
 */
public interface TasksService {

    public List<TaskDto> getTasks();
    public void save(@NotNull TaskDto task);
    public void delete(@NotNull TaskDto task);
}
