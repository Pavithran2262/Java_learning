package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class demo
{
    @Id
    private int id;
    private String name1;
    private String tech;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "demo [id=" + id + ", name1=" + name1 + ", TECH=" + tech + "]";
    }


}