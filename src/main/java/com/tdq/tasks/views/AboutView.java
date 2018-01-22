package com.tdq.tasks.views;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import com.tdq.tasks.MainLayout;

@Tag("about-view")
@HtmlImport("views/about-view.html")
@Route(value="about", layout=MainLayout.class)
public class AboutView extends PolymerTemplate<TemplateModel> {

}
