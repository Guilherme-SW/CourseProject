package org.example.project.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Plushie extends Product {
    private String material;
    private String size;


    public Plushie(String name, String description, float price, int quantityAvailable, String material, String size) {
        super(name, description, price, quantityAvailable);
        this.material = material;
        this.size = size;
    }



    @Override
    public String toString() {
        return "Plushie Size(cm): " + size + ", Plushie material: " + material ;
    }


    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }




}