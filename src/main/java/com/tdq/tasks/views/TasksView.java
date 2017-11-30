package com.tdq.tasks.views;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.Route;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

import com.tdq.tasks.MainLayout;

@Tag("tasks-view")
@HtmlImport("TasksView.html")
@Route(value="tasks", layout=MainLayout.class)
public class TasksView extends PolymerTemplate<TemplateModel> {

}

