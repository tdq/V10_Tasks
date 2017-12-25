package com.tdq.tasks.views;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.Route;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

import com.tdq.tasks.MainLayout;

@Tag("settings-view")
@HtmlImport("views/settings-view.html")
@Route(value="settings", layout=MainLayout.class)
public class SettingsView extends PolymerTemplate<TemplateModel> {

}
