package WzorzecObserwator.OperatorAdam;

public class Ambulance implements IAmbulance{
    Operator operator;
    static int number = 0;
    int ourNumber;
    public Ambulance(Operator operator) {
        this.operator = operator;
        this.operator.registerObserver(this);
        ourNumber = number++;
    }

    @Override
    public void update(String accident) {
        System.out.println("Ambulans" + ourNumber +
                "Jade do: " + accident);
    }
}
