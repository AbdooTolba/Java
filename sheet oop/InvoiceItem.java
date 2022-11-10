
// make class InoviceItem String id String desc int qty double unitPrice and make 2 objects of this class first with id "A001" and desc "Hammer" and qty 10 and unitPrice 5.5 and second with id "A002" and desc "Nail" and qty 100 and unitPrice 0.5 and print the details of each item and then print both objects
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    public double getTotal(double discountPercent) {
        return this.getTotal() - (this.getTotal() * (discountPercent / 100));
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + this.id + ", desc=" + this.desc + ", qty=" + this.qty + ", unitPrice=" + this.unitPrice + "]";
    }
}