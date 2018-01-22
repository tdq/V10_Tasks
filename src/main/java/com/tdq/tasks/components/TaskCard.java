package com.tdq.tasks.components;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.tdq.tasks.model.TaskDto;

@Tag("task-card")
@HtmlImport("components/task-card.html")
public class TaskCard extends PolymerTemplate<TaskCard.TaskCardModel> {

    public interface TaskCardModel extends TemplateModel {
        void setAuthor(String author);
        void setDate(String date);
        void setName(String name);
        void setDesc(String description);
        void setType(String type);
        void setOptions(List<String> options);

        String getAuthor();
        String getDate();
        String getName();
        String getDescription();
        String getType();
        List<String> getOptions();
    }

    public TaskCard(@NotNull TaskDto dto) {
        Objects.requireNonNull(dto);
        getModel().setAuthor(dto.getAuthor());
        getModel().setDate(dto.getDate());
        getModel().setName(dto.getName());
        getModel().setDesc(dto.getDescription());
        getModel().setType(dto.getType().name());
        getModel().setOptions(dto.getOptions());
    }
}
