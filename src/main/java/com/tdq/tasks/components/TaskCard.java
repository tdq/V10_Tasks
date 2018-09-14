package com.tdq.tasks.components;

import com.tdq.tasks.model.OptionDto;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.ModelItem;
import com.vaadin.flow.component.polymertemplate.RepeatIndex;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import com.tdq.tasks.model.TaskDto;

@Tag("task-card")
@HtmlImport("components/task-card.html")
public class TaskCard extends PolymerTemplate<TaskCard.TaskCardModel> implements HasComponents {

    private TasksList tasksList;

    public interface TaskCardModel extends TemplateModel {
        void setAuthor(String author);
        void setDate(String date);
        void setName(String name);
        void setDesc(String description);

        String getAuthor();
        String getDate();
        String getName();
        String getDesc();
    }

    public TaskCard() {
        tasksList = new TasksList(TaskDto.Type.TEXT);
        getElement().appendChild(tasksList.getElement());

        getElement().addPropertyChangeListener("name", event -> System.err.println(getModel().getName()));
        getElement().addPropertyChangeListener("desc", event -> System.err.println(getModel().getDesc()));
    }

    public TaskCard(@NotNull TaskDto dto) {
        Objects.requireNonNull(dto);
        getModel().setAuthor(dto.getAuthor());
        getModel().setDate(dto.getDate());
        getModel().setName(dto.getName());
        getModel().setDesc(dto.getDescription());

        tasksList = new TasksList(dto.getType());
        tasksList.setOptions(dto.getOptions());
        getElement().appendChild(tasksList.getElement());
    }

    @EventHandler
    private void showText() {
        tasksList.setType(TaskDto.Type.TEXT);
    }

    @EventHandler
    private void showList() {
        tasksList.setType(TaskDto.Type.LIST);
    }

    @EventHandler
    private void showOptions() {
        tasksList.setType(TaskDto.Type.OPTIONS);
    }
}
