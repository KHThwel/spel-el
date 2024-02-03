package org.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("#{'${app.street.name}'.toUpperCase()}")
    private String streetName;
    @Value("#{springBean2.taxAmount}")
    private int taxAmount;
    @Value("#{100*5}")
    private int discountAmount;

    public void print(){
        System.out.println("StreetName:"+streetName);
        System.out.println("taxAmount:"+taxAmount);
        System.out.println("discountAmount:"+discountAmount);


    }
}
