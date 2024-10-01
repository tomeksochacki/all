package payment;

import java.util.List;

public class Client {
    private String id;
    private String name;
    private String secondName;
    private List<BillPayment> billPayments;
    public Client(String id, String name, String secondName, List<BillPayment> billPayments) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.billPayments = billPayments;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public List<BillPayment> getBillPayments() {
        return billPayments;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", imię='" + name + '\'' +
                ", nazwisko='" + secondName + '\'' +
                ", płatności=" + billPayments +
                '}';
    }
}
