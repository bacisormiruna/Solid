package bad;

import invoice.ComplexInvoice;
import invoice.Invoice;

public interface BadInvoicePrinter_I {
    void print(Invoice invoice);

    void printComplexInvoice(ComplexInvoice complexInvoice);

    void someOtherPrintMethod(Invoice invoice);
}
