package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String streat;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String streat, String zipcode) {
        this.city = city;
        this.streat = streat;
        this.zipcode = zipcode;
    }
}
