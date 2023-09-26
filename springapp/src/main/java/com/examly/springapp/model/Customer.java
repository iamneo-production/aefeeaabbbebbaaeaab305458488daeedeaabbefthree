package com.examly.springapp;


@Entity
@Table(name="CUSTOMERS")
public class Customer {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CUSTOMERID")
    private int customerId;
    @Column(name="CUSTOMERNAME")
    private String customerName;
    @Column(name="AGE")
    private int age;
    @Column(name="MOBILE")
    private long mobile;

    @ManyToOne
	@JoinColumn(name ="BILLID")
    bill Bill;


    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public bill getBill() {
        return Bill;
    }
    public void setBill(bill bill) {
        Bill = bill;
    }
    public Customer(int customerId, String customerName, int age, long mobile, bill bill) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.mobile = mobile;
        Bill = bill;
    }
    public Customer() {
        super();
    }
    @Override
    public String toString() {
        return "Customer [Bill=" + Bill + ", age=" + age + ", customerId=" + customerId + ", customerName="
                + customerName + ", mobile=" + mobile + "]";
    }

    

}