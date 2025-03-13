package by.Gorbatsevich.TransportWork2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportUserManager {

    private Map<User, List<Transport>> transportByOwner = new HashMap<>();


    public void addTransport(Transport transport) {

        User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        transportByOwner.get(user).add(transport);
    }

    void printAllTransport1() {
        for(Map.Entry<User, List<Transport>> entry: transportByOwner.entrySet()){
            System.out.println(entry);
        }

    }

    public List<Transport> getTransportByOwner(User owner){
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate){
        List<Transport> transports = transportByOwner.get(owner);

    }

}
