package com.tdq.tasks.views;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.Route;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

import com.tdq.tasks.MainLayout;

@Tag("about-view")
@HtmlImport("AboutView.html")
@Route(value="about", layout=MainLayout.class)
public class AboutView extends PolymerTemplate<TemplateModel> {

}
