                                        //  M A P A S

package mapas;

public class MapCoche {

    String name = "nombre de coche";

    public MapCoche() {}
    public MapCoche(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
