public class Country {
    private final String name;
    private int count;
    private double square;
    private String capital;
    private boolean sea;

    public Country(String name) {
        this.name = name;
    }

    public void setCapital (String capital) {
        this.capital = capital;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }

    public String getName(String name) {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean getSea() {
        return sea;
    }
}
