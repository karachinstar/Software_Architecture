package org.example.Classes.Rewards.Sapphire;

import org.example.Classes.IGameItem;
import org.example.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
