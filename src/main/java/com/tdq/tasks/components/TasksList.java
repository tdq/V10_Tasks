package com.tdq.tasks.components;

import com.tdq.tasks.model.OptionDto;
import com.tdq.tasks.model.TaskDto;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Tag("tasks-list")
@HtmlImport("components/tasks-list.html")
public class TasksList extends PolymerTemplate<TasksList.TasksListModel> {

    public interface TasksListModel extends TemplateModel {
        void setOptions(List<OptionDto> options);
        void setType(String type);

        List<OptionDto> getOptions();
        String getType();
    }

    public TasksList(@NotNull TaskDto.Type itemsType) {
        this.setType(itemsType);
    }

    public void setOptions(@NotNull List<OptionDto> options) {
        getModel().setOptions(Objects.requireNonNull(options));
    }

    public void setType(@NotNull TaskDto.Type itemsType) {
        getModel().setType(Objects.requireNonNull(itemsType).name());
    }

    @ClientCallable
    private void updateOption(int itemId, boolean checked, String value) {
        System.err.println(String.format("Update option: id: %d, checked: %b, value: %s", itemId, checked, value));
        List<OptionDto> options = getModel().getOptions();
        Optional<OptionDto> perhapsItem = options.stream().filter(option -> option.getId() == itemId).findAny();

        perhapsItem.ifPresent(item -> {
            item.setChecked(checked);
            item.setValue(value);
            getModel().setOptions(options);
        });
    }

    @ClientCallable
    private void addOption(int prevOptionId, String value) {
        OptionDto newOption = new OptionDto();
        newOption.setValue(value);
        newOption.setId(0);     // TODO generate id

        //getModel().getOptions().
    }

    @ClientCallable
    private void deleteOption(int optionId) {
        getModel().getOptions().stream().filter(option -> option.getId() == optionId).findFirst().ifPresent(option -> getModel().getOptions().remove(option));
    }
}
