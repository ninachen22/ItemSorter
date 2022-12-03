package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] itemArr;
    public ItemSorter(Item[] items) {
        this.itemArr = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        // comment out code with explanation
        for (int i = 0; i < itemArr.length -1; i++) {
            boolean b = false;
            for (int j = 0; j < itemArr.length -1; j++) {
                if (comparator.compare(itemArr[j], itemArr[j + 1]) > 0) {
                    Item it = itemArr[j];
                    itemArr[j] = itemArr[j+1];
                    itemArr[j+1] = it;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
        }
        return itemArr;
//        return null;
    }
}
