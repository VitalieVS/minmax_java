import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    @Test
    public void minmax() {
        generateMin();
    }

    void generateMin() {
        String number = "1024";
        ArrayList<Integer> variations = new ArrayList<Integer>();

        for (int i = 0; i < number.length(); i++) {
            String variation = number.substring(0, i) + number.substring(i + 1);
            int numberVariation = Integer.parseInt(variation);
            variations.add(numberVariation);
        }
        Collections.sort(variations);
        System.out.println(variations.get(0) + ":" + variations.get(variations.size() - 1));
    }
}
