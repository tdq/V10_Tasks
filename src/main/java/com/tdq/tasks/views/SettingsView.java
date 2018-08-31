package com.tdq.tasks.views;

import com.tdq.tasks.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("settings-view")
@HtmlImport("views/settings-view.html")
@Route(value="settings", layout=MainLayout.class)
@SpringComponent
@UIScope
public class SettingsView extends PolymerTemplate<TemplateModel> {

}
