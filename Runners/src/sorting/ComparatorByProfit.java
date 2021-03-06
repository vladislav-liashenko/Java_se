package sorting;

import model.Runner;

import java.util.Comparator;

public class ComparatorByProfit implements Comparator<Runner> {

    public int compare(Runner a, Runner b) {
        int result = 0;

        if (a.getProfit() > b.getProfit()) {
            result = 1;
        }
        if (a.getProfit() < b.getProfit()) {
            result = -1;
        }
        if (a.getProfit() == b.getProfit()) {
            result = 0;
        }

        return result;
    }

}
