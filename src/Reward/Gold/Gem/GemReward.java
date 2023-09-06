package Reward.Gold.Gem;

import Abstractions.iGameItem;

public class GemReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gem !!!!");
    }
}
