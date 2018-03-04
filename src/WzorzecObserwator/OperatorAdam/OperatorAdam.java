package WzorzecObserwator.OperatorAdam;

import java.util.ArrayList;

public class OperatorAdam implements Operator {
    ArrayList<IAmbulance> ambulances = new ArrayList<>();

    @Override
    public void registerObserver(IAmbulance ambulans) {
        ambulances.add(ambulans);
    }

    @Override
    public void removeObserver(IAmbulance ambulans) {
        ambulances.remove(ambulans);
    }

    @Override
    public void notifyObservers(String accident) {
        for (IAmbulance ambulance : ambulances) {
            ambulance.update(accident);
        }

    }
}
