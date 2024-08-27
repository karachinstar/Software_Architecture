package org.example.Classes.Rewards.Platinum;

import org.example.Classes.IGameItem;
import org.example.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
