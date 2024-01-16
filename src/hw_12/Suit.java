package hw_12;

public enum Suit {
    SPADE("\u2660", "ПИК", "Пики"),
    HEART("\u2665", "ЧЕРВ", "Черви"),
    DIAMOND("\u2666", "БУБ", "Бубны"),
    CLUB("\u2663", "ТРЕФ", "Трефы");

    private final String symbol;
    private final String shortName;
    private final String fullName;

    Suit(String symbol, String shortName, String fullName) {
        this.symbol = symbol;
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }
}
