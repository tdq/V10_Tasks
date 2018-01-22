package com.tdq.tasks.views;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.List;

import com.tdq.tasks.MainLayout;
import com.tdq.tasks.components.TaskCard;
import com.tdq.tasks.model.TaskDto;
import com.tdq.tasks.model.TasksServiceMockupImpl;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("tasks-view")
@HtmlImport("views/tasks-view.html")
@Route(value="tasks", layout=MainLayout.class)
public class TasksView extends PolymerTemplate<TasksView.TaskViewModel> implements HasComponents {

    
    public interface TaskViewModel extends TemplateModel {
        //void setTasks(List<TaskDto> tasks);

        //List<TaskDto> getTasks();
    }
    

    public void add(Component child) {
        getElement().appendChild(child.getElement());
    }

    public void remove(Component child) {
        getElement().removeChild(child.getElement());
    }

    public TasksView() {
        List<TaskDto> tasks = TasksServiceMockupImpl.getInstance().getTasks();
        //getModel().setTasks(tasks);
        tasks.forEach(taskDto -> this.add(new TaskCard(taskDto)));
    }
}

