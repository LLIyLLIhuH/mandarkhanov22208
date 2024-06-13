package ru.nsu.ccfit.mandarkhanov;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println("Type \"g\" for GuiView or \"t\" for text interface.");
        int a = reader.read();
        new Controller().play(a);
    }
}