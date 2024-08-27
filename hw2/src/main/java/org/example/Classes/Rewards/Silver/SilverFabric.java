package org.example.Classes.Rewards.Silver;

import org.example.Classes.IGameItem;
import org.example.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
