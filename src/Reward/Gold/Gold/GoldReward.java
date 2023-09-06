package Reward.Gold.Gold;

import Abstractions.iGameItem;

public class GoldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gold coin!!");
    }
}
