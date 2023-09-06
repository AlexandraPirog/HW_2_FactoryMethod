package Reward.Gold.Gold;

import Abstractions.ItemGenerator;
import Abstractions.iGameItem;

public class GoldGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
