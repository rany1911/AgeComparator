public class Main {
    public static void main(String[] args) {
        Country country = new Country("USA");
        country.setCapital("Washington");
        country.setSea(true);
        System.out.println(country.getName());
        System.out.println(country.getCapital());
        System.out.println(country.getSea());
    }
}
