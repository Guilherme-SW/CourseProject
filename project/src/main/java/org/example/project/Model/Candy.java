package org.example.project.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Candy extends Product {
    private String flavor;
    private String type;

    public Candy(String name, String description, float price, int quantityAvailable, String flavor, String type) {
        super(name, description, price, quantityAvailable);
        this.flavor = flavor;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy: Flavor " + flavor + ", Candy type: " + type ;
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}