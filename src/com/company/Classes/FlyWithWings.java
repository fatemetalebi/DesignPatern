package com.company.Classes;

import com.company.Interface.FlyBehavior;

public class FlyWithWings  implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with Wings");
    }

}
