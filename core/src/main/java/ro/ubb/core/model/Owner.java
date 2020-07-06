package ro.ubb.core.model;

import lombok.*;
import javax.persistence.Entity;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
public class Owner extends BaseEntity<Long> {
 private String name , email;
 private String animals;

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "name: " + this.name + " email: " + this.email + " " + super.toString();
    }

}
