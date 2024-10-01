package payment;

public enum MediaTypeUnit {
    M3("metr sześcienny"), KWH("kilowatogodzina"), GJ("gigadżul");
    private String name;
    MediaTypeUnit(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

