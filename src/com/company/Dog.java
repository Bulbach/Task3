package com.company;

import java.util.Arrays;

public class Dog {
    private String domain;
    private String kingdom;
    private String type;
    private String dogClass;
    private String squad;
    private String family;
    private String clan;
    private String kind;
    private String subspecies;
    private boolean hungry;
    public String breedOfDog;
    public String coatColor;
    public float weight;
    private int heightOfTheWithers;
    public String name;
    public String groupp;
    public int age;
    public char sex;
    public double tailLength;
    public int numberOfPaws;
    private int typeDog;
    private int play;
    private int x, y;

    public Dog() {
        domain = "Домен eukaryotic";
        kingdom = "Царство animals";
        type = "Тип chord";
        dogClass = "Класс mammals";
        squad = "Отряд predatory";
        family = "Семейство canine";
        clan = "Род wolwes";
        kind = "Вид wolf";
        subspecies = "Подвид dog";
    }

    {
        domain = "Домен eukaryotic";
        kingdom = "Царство animals";
        type = "Тип chord";
        dogClass = "Класс mammals";
        squad = "Отряд predatory";
        family = "Семейство canine";
        clan = "Род wolves";
        kind = "Вид wolf";
        subspecies = "Подвид dog";
    }

    public Dog(String name, String breedOfDog, String coatColor, char sex, int age, float weight, String groupp,
               int numberOfPaws, double tailLength, int heightOfTheWithers) {
        this.name = name;
        this.breedOfDog = breedOfDog;
        this.coatColor = coatColor;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.numberOfPaws = numberOfPaws;
        this.tailLength = tailLength;
        setHeightOfTheWithers(heightOfTheWithers);
        this.groupp = groupp;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDogClass() {
        return dogClass;
    }

    public void setDogClass(String dogClass) {
        this.dogClass = dogClass;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubspecies() {
        return subspecies;
    }


    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public int getHeightOfTheWithers() {
        return heightOfTheWithers;
    }

    public void setHeightOfTheWithers(int heightOfTheWithers) {
        this.heightOfTheWithers = heightOfTheWithers;
        if (heightOfTheWithers <= 20) {
            typeDog = 1;
        } else if (heightOfTheWithers <= 45) {
            typeDog = 2;
        } else {
            typeDog = 3;
        }

    }

    public String getTypeDog() {
        String str;
        switch (typeDog) {
            case 1:
                str = "маленькая";
                break;
            case 2:
                str = "средняя";
                break;
            case 3:
                str = "большая";
                break;
            default:
                str = "Собака не установленного размера";
                break;
        }
        return str;
    }

    public int getPlay() {
        return play;
    }

    @Override
    public String toString() {
        return "Dog{" + "\n" +
                domain + "\n" +
                kingdom + "\n" +
                type + "\n" +
                dogClass + "\n" +
                squad + "\n" +
                family + "\n" +
                clan + "\n" +
                kind + "\n" +
                subspecies + "\n" +
                "Порода " + breedOfDog + "\n" +
                "Окрас " + coatColor + "\n" +
                "Вес " + weight + "\n" +
                "Высота в холке " + heightOfTheWithers + "\n" +
                "Кличка " + name + "\n" +
                "Группа " + groupp + "\n" +
                "Возраст " + age + "\n" +
                "Пол " + sex + "\n" +
                "Длинна шерсти " + tailLength + "\n" +
                "Колличество лап " + numberOfPaws + "\n" +
                "}";
    }

    public void goToBall(int ball) {
        if (ball > 0) {
            System.out.println("Go to the ball");
            hungry = true;
            play = play + ball * 100;
        } else {
            System.out.println("Stay to lie");
        }
    }

    public String isHungry() {
        return hungry ? "Гав" : "Xpp";
    }

    public void feedADog() {
        hungry = false;
    }


    public void birdSearch() {
        int birdsCount = 5;
        int widthSearch = 100;
        int lengthSearch = 100;
        String[] birdsName = {"Бекас", "Вальдшнеп", "Дупель", " Куропатка", "Коростель"};
        x = 50;
        y = 0;

        Birds[] birds = new Birds[birdsCount];
        for (int i = 0; i < birdsCount; i++) {
            birds[i] = new Birds(birdsName[i % birdsName.length], widthSearch, lengthSearch);
        }

        for (; y <= lengthSearch; y += 10) {
            boolean directRight = false;
            if (x >= 0 && x < widthSearch) {
                directRight = true;
            }
            for (; x <= widthSearch && x >= 0; ) {

                {
                    for (int g = 0; g < birds.length; g++) {
                        Birds bird = birds[g];
                        if (bird != null &&
                                bird.coordinateX <= x + 5 && bird.coordinateX >= x - 5 &&
                                bird.coordinateY <= y + 5 && bird.coordinateY >= y - 5) {
                            System.out.println("Вот птица " + bird.name + " " + bird.coordinateX + " " + bird.coordinateY);
                            birds[g] = null;
                        }
                    }
                }

                if (directRight) {
                    x++;
                } else {
                    x--;
                }
            }
            x = x == (widthSearch + 1) ? widthSearch : 0;
        }

    }

}

