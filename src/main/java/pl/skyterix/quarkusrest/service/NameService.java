package pl.skyterix.quarkusrest.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ApplicationScoped
public class NameService {

    private final String[] firstPositionNames = new String[] {
            "Pickle", "Rainbow", "Golden", "Legendary"
    };

    private final String[] secondPositionNames = new String[] {
            "Rick", "Dash", "Era", "Look"
    };

    public String generateRandomName() {
        Random random = new Random();

        return firstPositionNames[random.nextInt(4)] + " " + secondPositionNames[random.nextInt(4)];
    }

}
