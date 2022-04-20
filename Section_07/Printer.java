public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (100 >= tonerLevel && tonerLevel > -1)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (0 < tonerAmount && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            }

            return tonerLevel += tonerAmount;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToprint = pages;
        if (this.duplex) {
            pagesToprint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToprint;
        return pagesToprint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
