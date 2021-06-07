package com.company.Classes;

import com.company.Interface.FlyBehavior;

public class FlyWithMotor implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with Motor");
    }


}
