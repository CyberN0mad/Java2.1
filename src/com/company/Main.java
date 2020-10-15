package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setAge(2);
        dog1.setColor(Color.BLACK);
        dog1.setShelter(new Shelter("My pets", "Belinskaya 103"));
        dog1.setName("Gercog");
        dog1.setBreed("Doberman");
        dog1.setCommand(new String[]{"Sit", "Jump"});

        Dog dog2 = new Dog(Color.WHITE, new Shelter("Happy animals", "Chuy 111"), "Rex",
                "German Shepperd", new String[]{"Sit", "Jump"});
        dog2.setAge(3);
        Dog dog3 = new Dog(Color.GRAY, new Shelter("Cool Dogs", "Ahunbaeva 22"), "Eva",
                "German Shepperd", new String[]{"Sit", "Jump"});
        dog3.setAge(5);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        System.out.println(dog2.getInfo());
        dog2.makeVoice(3);
        System.out.println(dog3.getInfo());
        dog3.makeVoice("Waaw-Waawh", 2);

    }
}

