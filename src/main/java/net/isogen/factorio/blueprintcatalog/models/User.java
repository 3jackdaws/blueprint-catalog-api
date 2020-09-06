package net.isogen.factorio.blueprintcatalog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String lcusername;

    public User(){

    }

    public User(String username){
        this.setUsername(username);
    }

    public void setUsername(String username) {
        this.username = username;
        this.lcusername = username.toLowerCase();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
