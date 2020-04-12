package com.company;

public class Birds {
    public String name;
    public int coordinateX;
    public int coordinateY;

    Birds(String name, int maxX, int maxY) {
        this.name = name;
        coordinateX = (int) (Math.random() * (maxX + 1));
        coordinateY = (int) (Math.random() * (maxY + 1));
    }

    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
