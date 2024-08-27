package org.example.Classes.Rewards.Gem;

import org.example.Classes.ItemGenerator;
import org.example.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
