package com.company.Classes;

import com.company.Interface.FlyBehavior;

public class NoFly  implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
