package org.example.Classes.Rewards.Gold;

import org.example.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}
