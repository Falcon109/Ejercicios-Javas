package controller;

import view.MainVista;

import javax.swing.*;

public class MainControler {

    private MainVista mainVista;

    public MainControler(MainVista mainVista) {
        this.mainVista = mainVista;
    }

    public void starApp(){
        mainVista.setTitle("Test Gui");
        mainVista.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainVista.setLocationRelativeTo(null);
        mainVista.setVisible(true);
    }
}
