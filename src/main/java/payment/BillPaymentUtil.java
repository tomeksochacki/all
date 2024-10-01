package payment;

import java.math.BigDecimal;

public class BillPaymentUtil {
    private BillPaymentUtil(){}
    public static BigDecimal getPaymentForMediaType(MediaType mediaType) {
        switch (mediaType) {
            case WATER: return BigDecimal.valueOf(8.32);
            case HOT_WATER:
                return BigDecimal.valueOf(11.85);
            case CENTRAL_HEATING:
                return BigDecimal.valueOf(0.78);
            case ELECTRICITY:
                return BigDecimal.valueOf(0.72);
            case GAS:
                return BigDecimal.valueOf(0.47);
        }
        throw new IllegalArgumentException("Nierozpoznany argument");
    }
}
