package payment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class BillPayment {
    private MediaType mediaType;
    private BigDecimal amountOfUsage;
    private LocalDate from;
    private LocalDate to;
    private LocalDate due;
    private boolean paid;

    public BillPayment(MediaType mediaType, BigDecimal amountOfUsage, LocalDate from, LocalDate to, LocalDate due, boolean paid) {
        this.mediaType = mediaType;
        this.amountOfUsage = amountOfUsage;
        this.from = from;
        this.to = to;
        this.due = due;
        this.paid = paid;
    }

    public String getMediaType() {
        return mediaType.getName();
    }
    public String getMediaTypeName() {
        return mediaType.getName();
    }
    public String getMediaTypeUnit() {
        return mediaType.getUnit().getName();
    }
    public BigDecimal getAmountOfUsage() {
        return amountOfUsage;
    }
    public LocalDate getFrom() {
        return from;
    }
    public LocalDate getTo() {
        return to;
    }
    public LocalDate getDue() {
        return due;
    }
    public boolean isPaid() {
        return paid;
    }
    public void pay() {
        paid = true;
    }
    public boolean isOverdue() {
        return !paid && due.isAfter(LocalDate.now());
    }
    public BigDecimal getPaymentAmount() {
        BigDecimal price = BillPaymentUtil.getPaymentForMediaType(mediaType);
        return price.multiply(amountOfUsage).setScale(2, RoundingMode.HALF_UP);
    }
    @Override
    public String toString() {
        return "BillPayment{" +
                "rodzaj=" + mediaType.getName() +
                ", zużycie=" + amountOfUsage + " " + mediaType.getUnit() +
                ", od=" + from +
                ", do=" + to +
                ", termin płatności=" + due +
                ", czy zapłacono=" + paid +
                ", kwota=" + getPaymentAmount() +
                '}';
    }
}
