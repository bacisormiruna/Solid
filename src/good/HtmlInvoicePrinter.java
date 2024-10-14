package good;

import invoice.ComplexInvoice;
import invoice.Invoice;

public class HtmlInvoicePrinter implements GoodInvoicePrinter_I{
    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice in a good way: " + invoice);
    }
    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing complex invoice: " + complexInvoice);
    }
}
