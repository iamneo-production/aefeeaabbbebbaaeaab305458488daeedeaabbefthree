package com.examly.springapp.model;
import java.lang.annotation.Inherited;

@Entity
@Table(name="BILLS")
public class Bill{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BILLID")
    private int billId;
    @Column(name="TOTAL")
    private int total;
    public int getBillId() {
        return billId;
    }
    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public Bill(int billId, int total) {
        this.billId = billId;
        this.total = total;
    }
    public Bill() {
        super();
    }
    @Override
    public String toString() {
        return "Bill [billId=" + billId + ", total=" + total + "]";
    }
}