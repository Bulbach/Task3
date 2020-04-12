package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog sharik = new Dog();
        System.out.println(sharik.getDomain());
        System.out.println(sharik.getKingdom());
        System.out.println(sharik.getType());
        System.out.println(sharik.getDogClass());
        System.out.println(sharik.getSquad());
        System.out.println(sharik.getFamily());
        System.out.println(sharik.getClan());
        System.out.println(sharik.getKind());
        System.out.println(sharik.getSubspecies());
        Dog dog1 = new Dog("Веста","такса","рыжий",'Ж', 3, 7.5f,
                "Охотничии",4, 17.5d, 20 );
      /*  System.out.println("Кличка"+" " + dog1.name);
        System.out.println("Порода" +" " + dog1.breedOfDog);
        System.out.println("Окрас"+ " " + dog1.coatColor);
        System.out.println("Возраст"+" " + dog1.age);
        System.out.println("Пол" + " " +dog1.sex);
        System.out.println("Вес" + " " + dog1.weight);
        System.out.println("Группа" + " " + dog1.groupp);
        System.out.println("Количество лап" + " " + dog1.numberOfPaws);
        System.out.println("Длинна шерсти" + " " + dog1.tailLength);
        System.out.println("Высота в холке" + " " + dog1.getHeightOfTheWithers());*/
        System.out.println(dog1);
        System.out.println("Перед игрой " + dog1.getPlay());
        dog1.goToBall(2+1);
        System.out.println("После игры " + dog1.getPlay());
        System.out.println(dog1.isHungry());
        dog1.feedADog();
        System.out.println(dog1.isHungry());
        System.out.println(dog1.getTypeDog());
        Dog dog2 = new Dog("Арчи", "Дратхар","Рыжий",'м', 1, 25.7F,
                "Охотничьи ", 4, 45.1D,50 );
        System.out.println(dog2);
        System.out.println("Перед игрой " + dog2.getPlay());
        dog2.goToBall(5*3);
        System.out.println("После игры " + dog2.getPlay());
        System.out.println(dog2.isHungry());
        dog2.feedADog();
        System.out.println(dog2.isHungry());
        System.out.println(dog2.getTypeDog());
      //  System.out.println (((int) (Math.random() * 101)));
        dog1.birdSearch();
    }

}
