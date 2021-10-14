package calbill;

public class BillWater {

    private String clientCode;
    private String clientName;
    private int amountMonth;
    private int volumn;
    private int moneyToPay;

    public BillWater(
            String clientCode,
            String clientName,
            int amountMonth,
            int Volumn
    ) {
        this.clientCode = clientCode;
        this.clientName = clientName;
        this.amountMonth = amountMonth;
        this.volumn = Volumn;
        calBill();
    }

    public void calBill() {
        moneyToPay = amountMonth * volumn;
    }

    public String getClientCode() {
        return clientCode;
    }

    public int getAmountMonth() {
        return amountMonth;
    }

    public String getClienName() {
        return clientName;
    }

    public int getVolumn() {
        return volumn;
    }

    public int getMoneyToPay() {
        return moneyToPay;
    }

}
