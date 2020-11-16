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
@Table(name = "color")
public class ColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String color_type;

    @OneToMany(mappedBy = "productdetails", fetch = FetchType.LAZY)
    List<ProductDetailsEntity> productDetailsList;

    public ColorEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor_type() {
        return color_type;
    }

    public void setColor_type(String color_type) {
        this.color_type = color_type;
    }

    public List<ProductDetailsEntity> getProductDetailsList() {
        return productDetailsList;
    }

    public void setProductDetailsList(List<ProductDetailsEntity> productDetailsList) {
        this.productDetailsList = productDetailsList;
    }

}
