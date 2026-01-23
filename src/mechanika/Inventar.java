package mechanika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Inventar {
   private HashMap<String ,Predmet> predmety;

    public HashMap<String, Predmet> getPredmety() {
        return predmety;
    }

    public void setPredmety(HashMap<String, Predmet> predmety) {
        this.predmety = predmety;
    }

    public Inventar(HashMap<String, Predmet> predmety) {
        this.predmety = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inventar inventar = (Inventar) o;
        return Objects.equals(predmety, inventar.predmety);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(predmety);
    }
}
