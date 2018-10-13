/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Admin
 */
public class MenuBarView extends MenuBar {

    private Menu fileMenu;
    private MenuItem newMenuItem, openMenuItem, saveMenuItem, saveAsMenuItem, exitMenuItem;

    private Menu toolMenu;
    private MenuItem redoMenuItem, undoMenuItem, pasteMenuItem;

    private Menu helpMenu;
    private MenuItem aboutMenuItem;

    public MenuBarView() {
        super();

        fileMenu = new Menu("File");
        newMenuItem = new MenuItem("New");
        openMenuItem = new MenuItem("Open");
        saveMenuItem = new MenuItem("Save");
        saveAsMenuItem = new MenuItem("Save as...");
        exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, saveAsMenuItem, exitMenuItem);

        toolMenu = new Menu("Tool");
        redoMenuItem = new MenuItem("Redo    Ctrl + Y");
        undoMenuItem = new MenuItem("Undo    Ctrl + Z");
        pasteMenuItem = new MenuItem("Paste    Ctrl + V");
        toolMenu.getItems().addAll(redoMenuItem, undoMenuItem, pasteMenuItem);

        helpMenu = new Menu("Help");
        aboutMenuItem = new MenuItem("About");
        helpMenu.getItems().addAll(aboutMenuItem);

        getMenus().addAll(fileMenu, toolMenu, helpMenu);
    }

    public void addEventHandlerInNewMenuItem(EventHandler<ActionEvent> eventHandler) {
        newMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInOpenMenuItem(EventHandler<ActionEvent> eventHandler) {
        openMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInSaveMenuItem(EventHandler<ActionEvent> eventHandler) {
        saveMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInSaveAsMenuItem(EventHandler<ActionEvent> eventHandler) {
        saveAsMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInExitMenuItem(EventHandler<ActionEvent> eventHandler) {
        exitMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInAboutMenuItem(EventHandler<ActionEvent> eventHandler) {
        aboutMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInUndoMenuItem(EventHandler<ActionEvent> eventHandler) {
        undoMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInRedoMenuItem(EventHandler<ActionEvent> eventHandler) {
        redoMenuItem.setOnAction(eventHandler);
    }

    public void addEventHandlerInPasteMenuItem(EventHandler<ActionEvent> eventHandler){
        pasteMenuItem.setOnAction(eventHandler);
    }
}
