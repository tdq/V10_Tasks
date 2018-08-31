package com.tdq.tasks.components;

import com.tdq.tasks.model.OptionDto;
import com.vaadin.flow.component.polymertemplate.EventHandler;
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
        void setOptions(List<OptionDto> options);

        String getAuthor();
        String getDate();
        String getName();
        String getDesc();
        String getType();
        List<OptionDto> getOptions();
    }

    public TaskCard() {
        getModel().setType(TaskDto.Type.TEXT.name());

        getElement().addPropertyChangeListener("name", event -> System.err.println(getModel().getName()));
        getElement().addPropertyChangeListener("desc", event -> System.err.println(getModel().getDesc()));
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

    /*
    @EventHandler
    private void updateOptions(String args, int code, OptionDto option) {
        System.err.println("Set options: "+args+" "+code+ " "+String.format("%d %s", option.getId(), option.getValue()));
    }

    @EventHandler
    private void setOptionValue(int optionId, String value) {
        getModel().getOptions().stream().filter(option -> option.getId() == optionId).findFirst().ifPresent(option -> option.setValue(value));
    }

    @EventHandler
    private void checkOption(int optionId, boolean checked) {
        getModel().getOptions().stream().filter(option -> option.getId() == optionId).findFirst().ifPresent(option -> option.setChecked(checked));
    }

    @EventHandler
    private void addOption(int prevOptionId, String value) {
        OptionDto newOption = new OptionDto();
        newOption.setValue(value);
        newOption.setId(0);     // TODO generate id

        //getModel().getOptions().
    }

    @EventHandler
    private void deleteOption(int optionId) {
        getModel().getOptions().stream().filter(option -> option.getId() == optionId).findFirst().ifPresent(option -> getModel().getOptions().remove(option));
    }
    */
}
