package org.example.Classes.Rewards.Platinum;

import org.example.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}
