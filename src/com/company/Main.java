package com.company;

import com.company.Classes.Bird;
import com.company.Classes.Eagle;
import com.company.Classes.FlyWithMotor;
import com.company.Classes.NoFly;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Strategy Design Patern***");
        System.out.println("************Start***********");
        Bird eagle=new Eagle();
        eagle.performFly();
        eagle.setFlyBehavior(new NoFly());
        eagle.performFly();
        System.out.println("************End*************");
    }
}
