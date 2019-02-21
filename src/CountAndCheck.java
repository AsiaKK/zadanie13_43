import utils.FileUtils;
import utils.ListUtils;

import java.util.List;

public class CountAndCheck {

    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();
        ListUtils listUtils = new ListUtils();

        List<Integer> elements = fileUtils.getFromFile("MyFile.txt");

        if (elements != null && !elements.isEmpty()) {
            int maxValue = listUtils.findMaxValue(elements);

            int[] ints = new int[maxValue];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = 0;
            }

            for (int i = 0; i < elements.size(); i++) {
                Integer helperCount = elements.get(i);
                ints[helperCount - 1] = ints[helperCount - 1] + 1;

            }

            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > 0) {
                    System.out.println((i+1) + " - liczba wystąpień: " + ints[i]);
                }
            }

        } else {
            System.out.println("brak danych w pliku");
        }

    }
}