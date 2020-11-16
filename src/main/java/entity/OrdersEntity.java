/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "orders")
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")//khóa ngoại 
    private UserEntity users;

    @ManyToOne
    @JoinColumn(name = "ordersdetails_id")//khóa ngoại 
    private OrdersDetailsEntity orderdetails;

    @ManyToOne
    @JoinColumn(name = "shipping_id")//khóa ngoại 
    private ShippingEntity shipping;

    @ManyToOne
    @JoinColumn(name = "creditCard_id")//khóa ngoại 
    private CreditCardEntity creditcard;

    public OrdersEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UserEntity getUsers() {
        return users;
    }

    public void setUsers(UserEntity users) {
        this.users = users;
    }

    public OrdersDetailsEntity getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(OrdersDetailsEntity orderdetails) {
        this.orderdetails = orderdetails;
    }

    public ShippingEntity getShipping() {
        return shipping;
    }

    public void setShipping(ShippingEntity shipping) {
        this.shipping = shipping;
    }

    public CreditCardEntity getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CreditCardEntity creditcard) {
        this.creditcard = creditcard;
    }
    
    
}
