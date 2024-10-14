package good;

public class EmployeePaymentService {
    EmployeeAdditionalPaymentService additionalPaymentService;

    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService){
        this.additionalPaymentService=additionalPaymentService;

    }
    public int calculatePay(GoodEmployee employee) {
        switch (employee.getStatus()) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }
}
