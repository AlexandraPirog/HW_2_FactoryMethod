import Abstractions.ItemGenerator;
import Reward.Gold.Gem.GemGenerator;
import Reward.Gold.Gold.GoldGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        for (int i = 0; i < 10; i++) {
            ItemGenerator ItemGenerator = generatorList.get(0);
            ItemGenerator.openReward();

        }
    }
}