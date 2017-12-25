package com.tdq.tasks.views;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.Route;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HasComponents;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

import java.util.List;

import com.tdq.tasks.MainLayout;
import com.tdq.tasks.components.TaskCard;
import com.tdq.tasks.model.TaskDto;
import com.tdq.tasks.model.TasksServiceMockupImpl;

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

