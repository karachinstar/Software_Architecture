package org.example.Classes.Rewards.Bronze;

import org.example.Classes.IGameItem;
import org.example.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
