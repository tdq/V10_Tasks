package com.tdq.tasks.views;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.spring.annotation.SpringComponent;

import org.springframework.context.annotation.Scope;

import com.tdq.tasks.MainLayout;

@Tag("settings-view")
@HtmlImport("views/settings-view.html")
@Route(value="settings", layout=MainLayout.class)
@SpringComponent
@Scope("prototype")
public class SettingsView extends PolymerTemplate<TemplateModel> {

}
