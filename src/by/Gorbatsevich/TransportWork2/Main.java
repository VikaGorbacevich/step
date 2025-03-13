package by.Gorbatsevich.TransportWork2;


public class Main {
    public static void main(String[] args) {
        TransportUserManager manager = new TransportUserManager();

        for (int i = 0; i < 20; i++) {
            Transport transport = TransportFactory.next();
            User user = UserFactory.next();
            transport.setUser(user);
            manager.addTransport(transport);
        }

        manager.printAllTransport1();

    }
}