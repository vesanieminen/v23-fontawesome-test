package com.example.application.views.helloworld;

import com.example.application.views.MainLayout;
import com.flowingcode.vaadin.addons.fontawesome.FontAwesome;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(FontAwesome.Regular.Icon.class)
@Uses(FontAwesome.Solid.Icon.class)
public class HelloWorldView extends HorizontalLayout {

    public HelloWorldView() {
        add(new Button(FontAwesome.Regular.ADDRESS_CARD.create()));
        add(new Button(FontAwesome.Solid.ADDRESS_BOOK.create()));
    }

}
