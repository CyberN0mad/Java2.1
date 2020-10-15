package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] command;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommand() {
        return command;
    }

    public void setCommand(String[] command) {
        this.command = command;
    }

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color,shelter);
        this.breed = breed;
        this.name = name;
    }

    public Dog(Color color, Shelter shelter, String name, String breed, String[] command) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.command = command;
    }

    public void makeVoice() {
        System.out.println("AW-AWh");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Gav-Gav ");
        }
        System.out.println();
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return "Dog{" +
                "Name=" + name +
                ", Breed=" + breed +
                ", Commands=" + Arrays.toString(command) +
                "} " + super.getInfo();
    }
}
