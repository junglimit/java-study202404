package day09.poly.practice;

import java.util.Arrays;

public class Computer {
    private ComputerPart computerPart;
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        ComputerPart[] newParts = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            newParts[i] = parts[i];
        }
        newParts[parts.length] = part;
        parts = newParts;


    }

    public void showParts() {
        for (ComputerPart part : parts) {
            part.describePart();
        }
    }
}
