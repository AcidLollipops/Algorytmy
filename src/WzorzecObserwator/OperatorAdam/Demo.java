package WzorzecObserwator.OperatorAdam;

public class Demo {
    public static void main(String[] args) {
        OperatorAdam adam = new OperatorAdam();
        Ambulance amb1 = new Ambulance(adam);
        Ambulance amb2 = new Ambulance(adam);
        Ambulance amb3 = new Ambulance(adam);

        adam.notifyObservers("Wypadek samochodowy");
        adam.notifyObservers("Przejechanie walcem");
    }
}
