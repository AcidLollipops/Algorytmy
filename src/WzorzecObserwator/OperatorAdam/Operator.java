package WzorzecObserwator.OperatorAdam;

public interface Operator {
    void registerObserver(IAmbulance ambulans);
    void removeObserver(IAmbulance ambulans);
    void notifyObservers(String accident);

}
