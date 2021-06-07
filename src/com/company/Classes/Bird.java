package com.company.Classes;

import com.company.Interface.FlyBehavior;

public abstract class Bird {
    FlyBehavior flyBehavior;

    public Bird() {

    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void performFly() {
         flyBehavior.fly();
    }
}
