public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;
        double rollerMinTemp = 80.5;
        double rollerMaxTemp = 120.75;

        boolean coldPrintOn = false;
        int pagesInBook = 530;
        int booksCount = 2000;
        double rollerPrintTemp = 90;

        int papersCount = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;
        boolean paperIsEnough = paperReserve >= papersCount;
        boolean inkIsEnough = inkReserve >= inkedPapersCount;
        boolean coversAreEnough = coverReserve >= booksCount;
        boolean rollerTempIsNormal = rollerPrintTemp >= rollerMinTemp && rollerPrintTemp <= rollerMaxTemp;

        boolean errors = true;

        String message = errors ? "No print" : "Go print";
        System.out.println(message);
    }
}
