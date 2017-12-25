package com.tdq.tasks;

import com.vaadin.flow.dom.Element;
import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.Route;
import com.vaadin.router.RouterLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

@Tag("main-layout")
@HtmlImport("views/main-layout.html")
@Route("")
public class MainLayout extends PolymerTemplate<TemplateModel> implements RouterLayout {

    private Element content;

    public MainLayout() {
        /*
        ExampleTemplate template = new ExampleTemplate();
        template.setValue("Template!!!");

        setContent(template);
        */
    }

    /**
     * Set layout content
     *
     * @param {@link Component} content
     */
    public void setContent(Component content) {
        if(this.content != null) {
            getElement().removeChild(this.content);
        }

        getElement().appendChild(content.getElement());
        this.content = content.getElement();
    }
}
