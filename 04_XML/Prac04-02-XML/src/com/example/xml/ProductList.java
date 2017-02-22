package com.example.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="productList")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductList {

    public ProductList() {
    }
    
    public ProductList(List<Product> pl) {
        this.pList = pl;
    }
    
    @XmlElement(name="product")
    private List<Product> pList = new ArrayList<>();

    public List<Product> getpList() {
        return pList;
    }
}
