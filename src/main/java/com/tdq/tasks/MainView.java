
package com.tdq.tasks;

import com.vaadin.router.Route;
import com.vaadin.ui.common.HtmlImport;

import com.vaadin.ui.html.Label;

import com.vaadin.ui.layout.VerticalLayout;

import com.vaadin.flow.demo.helloworld.ExampleTemplate;


@HtmlImport("styles.html")
@Route("view")
public class MainView extends VerticalLayout {

    public MainView() {
        MainLayout layout = new MainLayout();
        ExampleTemplate example = new ExampleTemplate();
        //Label example = new Label("Example!");

        layout.setContent(example);

        add(layout);
    }
}
