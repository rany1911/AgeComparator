import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text nmb 1");
        printer.append("some text nmb 2", "some title");
        printer.append("some text nmb 3", 15);
        printer.append("some text nmb 4", "another title", 10);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        System.out.println(printer.getPrintedPagesCount());
        System.out.println(printer.getPendingPagesCount());
    }

}
