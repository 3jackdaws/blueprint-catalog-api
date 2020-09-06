package net.isogen.factorio.blueprintcatalog.models;


import javax.persistence.*;

@Entity
public class Blueprint {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String data;



    @ManyToOne
    private User author;

    public Blueprint(){}

    public Blueprint(String name, String data, User author){
        this.name = name;
        this.data = data;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
