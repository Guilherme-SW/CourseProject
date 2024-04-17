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
public class Lego extends Product {
    private int legoCount;
    private String set;
    private int Size;



    public Lego(String name, String description, float price, int quantityAvailable, int legoCount, String set, int size) {
        super(name, description, price, quantityAvailable);
        this.legoCount = legoCount;
        this.set = set;
        Size = size;
    }

    @Override
    public String toString() {
        return "Lego count: " + legoCount + ", Set: " + set + ", Size(cm): " + Size;
    }
}