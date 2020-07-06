package ro.ubb.web.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor


public class OwnerDTO {
    private Long id ;
    private String name ,email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "id:" + id + " name:"+ name + " email:" + email;
    }
}
