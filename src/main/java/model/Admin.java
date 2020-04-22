package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_admin")
    private int id;
    private String email;
    private  String password;
    private String role;
}
