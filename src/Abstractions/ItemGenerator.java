package Abstractions;

import Abstractions.iGameItem;

public abstract class ItemGenerator {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
