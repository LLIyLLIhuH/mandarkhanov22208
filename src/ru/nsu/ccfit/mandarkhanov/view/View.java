package ru.nsu.ccfit.mandarkhanov.view;

public interface View {

    void updateGameTextField();

    void help();

    void wrong();

    void loss();

    void victory();

    void greetings();

    String[] makeMove();
}