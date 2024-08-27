package org.example.Classes.Rewards.Ruby;

import org.example.Classes.IGameItem;
import org.example.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
