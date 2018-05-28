/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.model;

import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Coach {
    private int id;
    private String name;
    private String surname;
    private byte[] image;
    private int id_position;
    
    public Coach(){
    }

    public Coach(int id, String name, String surname, byte[] image, int id_position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.image = image;
        this.id_position = id_position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte[] getImage() {
        return image;
    }

    public int getId_position() {
        return id_position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setId_position(int id_position) {
        this.id_position = id_position;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.surname);
        hash = 97 * hash + Arrays.hashCode(this.image);
        hash = 97 * hash + this.id_position;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coach other = (Coach) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_position != other.id_position) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coach{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", image=" + image + ", id_position=" + id_position + '}';
    }

    
}
