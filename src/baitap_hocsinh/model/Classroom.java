package baitap_hocsinh.model;

import java.io.Serializable;

public class Classroom implements Serializable{
    private final long serialVersionUID = 123456789;
    public static int INDEX = 0;
    private int id;
    private String name;
    
    public Classroom() {
    }

    public Classroom(String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public Classroom(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classroom [id=" + id + ", name=" + name + "]";
    }
}
