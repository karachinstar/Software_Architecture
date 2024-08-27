package org.example.Classes.Rewards.Gold;

import org.example.Classes.ItemGenerator;
import org.example.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
