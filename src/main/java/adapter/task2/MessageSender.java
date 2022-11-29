package adapter.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MessageSender {
    public boolean send(String text, Client client, String country) {
//        return Objects.equals(client.getCountry(), country) && (client.getLastActiveData().plus(1, ChronoUnit.DAYS) <= LocalDate.now());
        return Objects.equals(client.getCountry(), Country.Ukraine);
    }
}