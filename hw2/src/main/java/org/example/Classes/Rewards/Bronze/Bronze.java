package org.example.Classes.Rewards.Bronze;

import org.example.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}
