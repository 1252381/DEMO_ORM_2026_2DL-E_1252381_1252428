package isep.eapli.demo_orm.domain.cargroup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CarGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int doorNumber;
    private Long pricePerDay;
    private String classification;

    public CarGroup() { }

    public CarGroup(String name, int doorNumber, String classification) {
        this.name = name;
        this.doorNumber = doorNumber;
        this.classification = classification;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Doors: %d | Class: %s",
                id, name, doorNumber, classification);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public Long getPricePerDay() {
        return pricePerDay;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setPricePerDay(Long pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
