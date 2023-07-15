package com.example.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    private String username;
    private String currenFirstName;
    private String currentLastName;
    private String currentMiddleName;
    private String externalUserId;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
