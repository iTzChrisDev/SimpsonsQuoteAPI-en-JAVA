package com.example;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import views.MainFrame;

public class Main {
    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
        new MainFrame().setVisible(true);
    }
}