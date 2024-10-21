package payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        BillPayment client1Water1 = new BillPayment(MediaType.WATER,
                BigDecimal.valueOf(23.97),
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 10, 31),
                LocalDate.of(2023, 11, 14),
                false);
        BillPayment client1Gas1 = new BillPayment(MediaType.GAS,
                BigDecimal.valueOf(61.43),
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 9, 30),
                LocalDate.of(2023, 10, 14),
                true);
        BillPayment client1Electricity1 = new BillPayment(MediaType.ELECTRICITY,
                BigDecimal.valueOf(123.71),
                LocalDate.of(2023, 4, 1),
                LocalDate.of(2023, 6, 30),
                LocalDate.of(2023, 7, 14),
                true);
        BillPayment client1Electricity2 = new BillPayment(MediaType.ELECTRICITY,
                BigDecimal.valueOf(109.31),
                LocalDate.of(2023, 7, 1),
                LocalDate.of(2023, 9, 30),
                LocalDate.of(2023, 10, 14),
                false);
        BillPayment client2Water1 = new BillPayment(MediaType.WATER,
                BigDecimal.valueOf(48.12),
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 8, 31),
                LocalDate.of(2023, 9, 14),
                true);
        BillPayment client2Water2 = new BillPayment(MediaType.WATER,
                BigDecimal.valueOf(39.26),
                LocalDate.of(2023, 9, 1),
                LocalDate.of(2023, 11, 30),
                LocalDate.of(2023, 12, 14),
                false);
        BillPayment client2Electricity1 = new BillPayment(MediaType.ELECTRICITY,
                BigDecimal.valueOf(195.18),
                LocalDate.of(2023, 4, 1),
                LocalDate.of(2023, 6, 30),
                LocalDate.of(2023, 7, 14),
                true);
        BillPayment client2Electricity2 = new BillPayment(MediaType.ELECTRICITY,
                BigDecimal.valueOf(217.87),
                LocalDate.of(2023, 7, 1),
                LocalDate.of(2023, 9, 30),
                LocalDate.of(2023, 10, 14),
                false);
        Client client1 = new Client("123456789", "Jan", "Kowalski", Arrays.asList(client1Water1, client1Gas1, client1Electricity1, client1Electricity2));
        Client client2 = new Client("123456798", "Anna", "Nowak", Arrays.asList(client2Water1, client2Water2, client2Electricity1, client2Electricity2));

        /*Stream.iterate(1, i -> i < 10000, i -> i * 3)
                .forEach(i -> System.out.println(i + ", "));*/

        //client1.getBillPayments().stream()
        //        .filter(b->b.isPaid())
        //        .forEach(b-> System.out.println(b));

        //client1.getBillPayments()
        //        .stream()
        //        .filter(b -> b.getDue().isBefore(LocalDate.of(2023, 10, 31)))
        //        .filter(b -> b.getAmountOfUsage().compareTo(BigDecimal.valueOf(110)) < 0)
        //        .forEach(b -> System.out.println(b));

        /*client1.getBillPayments()
                .stream()
                .sorted((b1, b2) -> b1.getMediaTypeName().compareTo(b2.getMediaTypeName()))
                .forEach(b1 -> System.out.println(b1));*/

        /*client1.getBillPayments()
                .stream()
                .map(b-> b.getMediaTypeName() + ": " + b.getDue().toString())
                .forEach(b -> System.out.println(b))*/;

        client1.getBillPayments()
                .stream()
                .filter(b -> b.isOverdue())
                .map(b-> b.getMediaTypeName() + " : " + b.getPaymentAmount())
                .forEach(b -> System.out.println(b));

    }
}
