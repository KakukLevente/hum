package controllers;

import views.CreateFrame;
import views.MainFrame;

public class MainController {

    MainFrame mainFrame;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.handleEvent();
    }
    private void handleEvent(){
        this.mainFrame.getAddbutton().addActionListener(e ->{
            this.startAdd();
        });
    }
    private void startAdd(){
        CreateFrame createFrame = new CreateFrame();
        createFrame.setVisible(true);

    }
    }
