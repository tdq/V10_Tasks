package com.tdq.tasks;

import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@Tag("main-layout")
@HtmlImport("views/main-layout.html")
@Route("")
public class MainLayout extends PolymerTemplate<TemplateModel> implements RouterLayout {

    private Element content;

    public MainLayout() {

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
