public class Printer {
    public String queue = "";
    public int pagesInQueue;
    public int printedPages;

    public void append(String text, String name, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String text) {
        queue = queue + "\nText without title - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void append(String text, int pagesCount) {
        queue = queue + "\nText without title - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void clear() {
        pagesInQueue = 0;
        queue = "";
    }

    public void print() {
        printedPages = printedPages + pagesInQueue;
        System.out.println(queue);
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return printedPages;
    }
}
