package com.hillel.java.introduction.game.model;

public class UsableItem extends Item {

    public UsableItem(Characteristics characteristics, double value, double price) {
        super(characteristics, value, price);
    }

    public void use(Unit unit) {
        // in case if this item can be usable (magic damage, or disables)

        // increasing the cooldown after being used
        coolDown += 2;
    }
}
