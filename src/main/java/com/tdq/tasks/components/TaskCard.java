package com.tdq.tasks.components;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;
import javax.validation.constraints.NotNull;

import java.util.Objects;

import com.tdq.tasks.model.TaskDto;

@Tag("task-card")
@HtmlImport("components/task-card.html")
public class TaskCard extends PolymerTemplate<TaskCard.TaskCardModel> {

    public interface TaskCardModel extends TemplateModel {
        void setTask(TaskDto task);

        TaskDto getTask();
    }

    public TaskCard(@NotNull TaskDto dto) {
        getModel().setTask(Objects.requireNonNull(dto));
    }
}
