package payment;

public enum MediaType {
    WATER("woda zimna", MediaTypeUnit.M3),
    HOT_WATER("ciepła woda użytkowa", MediaTypeUnit.M3),
    CENTRAL_HEATING("centralne ogrzewanie", MediaTypeUnit.GJ),
    ELECTRICITY("energia elektryczna", MediaTypeUnit.KWH),
    GAS("gaz ziemny", MediaTypeUnit.KWH);
    private String name;
    private MediaTypeUnit unit;
    MediaType(String name, MediaTypeUnit unit) {
        this.name = name;
        this.unit = unit;
    }
    public String getName() {
        return name;
    }
    public MediaTypeUnit getUnit() {
        return unit;
    }
}
