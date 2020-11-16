/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "ordersdetails")
public class OrdersDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numberOfOrders;
    private double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String paymentMethod;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    List<OrdersEntity> ordersList;

    @ManyToOne
    @JoinColumn(name = "productDetails_id")//khóa ngoại 
    private ProductDetailsEntity productdetails;

    public OrdersDetailsEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(String numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<OrdersEntity> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<OrdersEntity> ordersList) {
        this.ordersList = ordersList;
    }

    public ProductDetailsEntity getProductdetails() {
        return productdetails;
    }

    public void setProductdetails(ProductDetailsEntity productdetails) {
        this.productdetails = productdetails;
    }

}
