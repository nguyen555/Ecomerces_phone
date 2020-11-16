/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "manufacturer")
public class ManufacturerEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     
     @OneToMany(mappedBy = "productdetails", fetch = FetchType.LAZY)
    List<ProductDetailsEntity> productDetailsList;

    public ManufacturerEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductDetailsEntity> getProductDetailsList() {
        return productDetailsList;
    }

    public void setProductDetailsList(List<ProductDetailsEntity> productDetailsList) {
        this.productDetailsList = productDetailsList;
    }
     
     
}
