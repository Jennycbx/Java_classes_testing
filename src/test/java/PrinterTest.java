import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(1000, 2000);
    }

    @Test
    public void hasSheets() {
        assertEquals(1000, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(2000, printer.getToner());
    }

    @Test
    public void printIfEnoughPaper() {
        printer.printCopies(80, 10);
        assertEquals(200, printer.getSheets());
    }

    @Test
    public void reduceTonerForEachPagePrinted() {
        printer.reduceToner(70, 2);
        assertEquals(1860, printer.getToner());
    }
}
