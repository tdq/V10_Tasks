package com.tdq.tasks.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public class TaskServiceImpl implements TasksService {

    @Override
    public List<TaskDto> getTasks() {
        return null;
    }

    @Override
    public void save(@NotNull TaskDto task) {

    }

    @Override
    public void delete(@NotNull TaskDto task) {

    }
}
