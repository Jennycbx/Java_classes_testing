public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }

    public void printCopies(int pages, int copies) {
        int result = pages * copies;
        if (result <= this.sheets) {
            this.sheets -= result;
        }
    }

    public void reduceToner(int pages, int copies) {
            this.toner -= pages * copies;
    }
}
