package com.tdq.tasks.views;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.spring.annotation.SpringComponent;

import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import com.tdq.tasks.MainLayout;
import com.tdq.tasks.components.TaskCard;
import com.tdq.tasks.model.TaskDto;
import com.tdq.tasks.model.TasksService;
import com.vaadin.flow.component.Component;

@Tag("tasks-view")
@HtmlImport("views/tasks-view.html")
@Route(value="tasks", layout=MainLayout.class)
@SpringComponent 
@Scope("prototype")
public class TasksView extends PolymerTemplate<TasksView.TaskViewModel> implements HasComponents {

    @Autowired
    private TasksService tasksService;
    
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

    @PostConstruct
    private void init() {
        List<TaskDto> tasks = tasksService.getTasks();
        tasks.forEach(taskDto -> this.add(new TaskCard(taskDto)));
    }
}

