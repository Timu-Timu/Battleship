package com.java2304.Battleship.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdybka on 13.05.16.
 */

@Entity
public class Player {

    public Player() {}

    public Player(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
