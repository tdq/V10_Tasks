package com.tdq.tasks.views;

import com.tdq.tasks.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("about-view")
@HtmlImport("views/about-view.html")
@Route(value="about", layout=MainLayout.class)
@SpringComponent
@UIScope
public class AboutView extends PolymerTemplate<TemplateModel> {

}
