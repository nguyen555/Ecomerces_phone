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
@Table(name = "creditcard")
public class CreditCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String card_Number;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;
    private String surplus;

    @ManyToOne
    @JoinColumn(name = "id")//khóa ngoại 
    private CustomerEntity customers;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    List<OrdersEntity> ordersList;

    public CreditCardEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCard_Number() {
        return card_Number;
    }

    public void setCard_Number(String card_Number) {
        this.card_Number = card_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSurplus() {
        return surplus;
    }

    public void setSurplus(String surplus) {
        this.surplus = surplus;
    }

    public CustomerEntity getCustomers() {
        return customers;
    }

    public void setCustomers(CustomerEntity customers) {
        this.customers = customers;
    }

    public List<OrdersEntity> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<OrdersEntity> ordersList) {
        this.ordersList = ordersList;
    }
    
        
    
}
