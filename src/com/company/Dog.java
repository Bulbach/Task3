package com.company;

import java.util.Arrays;

public class Dog {

    public String breedOfDog;
    public String coatColor;
    public float weight;
    public String groupp;
    public int age;
    public char sex;
    public double tailLength;
    public int numberOfPaws;
    public String name;
    private String subspecies;
    private int typeDog;
    private int play;
    private int x, y;
    private String domain;
    private String kingdom;
    private String type;
    private String dogClass;
    private String squad;
    private String family;
    private String clan;
    private String kind;
    private boolean hungry;
    private int heightOfTheWithers;

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
        int full = 0;

        while (full < 100) {
            full += 10;
            if (full == 100) {
                System.out.println("Собака сыта. Хрр");
            }
        }
        hungry = false;
    }

    public void doWhileFeedADog() {
        int full = 0;
        do {
            full += 10;
        }
        while (full < 100);
        if (full >= 100) {
            System.out.println("Наконец собака сыта.");
        }
    }


    public void birdSearch() {
        int birdsCount = 5;
        final int WIDTH_SEARCH = 100;
        final int LENGTH_SEARCH = 100;
        String[] birdsName = {"Бекас", "Вальдшнеп", "Дупель", " Куропатка", "Коростель"};
        x = 50;
        y = 0;

        Birds[] birds = new Birds[birdsCount];
        for (int i = 0; i < birdsCount; i++) {
            birds[i] = new Birds(birdsName[i % birdsName.length], WIDTH_SEARCH, LENGTH_SEARCH);
        }

        for (; y <= LENGTH_SEARCH; y += 10) {
            boolean directRight = false;
            if (x >= 0 && x < WIDTH_SEARCH) {
                directRight = true;
            }
            for (; x <= WIDTH_SEARCH && x >= 0; ) {

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
            x = x == (WIDTH_SEARCH + 1) ? WIDTH_SEARCH : 0;
        }

    }

    public static String[] sortString(String[] birdsName) {
        boolean change = false;
        for (int z = 0; z < birdsName.length - 1; z++) {
            char[] name1 = birdsName[z].toLowerCase().toCharArray();
            char[] name2 = birdsName[z + 1].toLowerCase().toCharArray();
            int length = Math.min(name1.length, name2.length);

            for (int i = 0; i < length; i++) {
                if (name1[i] > name2[i] || (i == length - 1 && name1 == name2 && name1.length > name2.length)){
                    String emptyBirdsName = birdsName[z];
                    birdsName[z] = birdsName[z+1];
                    birdsName[z+1] = emptyBirdsName;
                    change = true;
                    break;}
                else if(name1[i]==name2[i]){
                 continue;
                }
                break;
            }
            if (change&& z<birdsName.length-2){
               z =-1;
               change = false;
            }
        }
            return birdsName;
    }
}

