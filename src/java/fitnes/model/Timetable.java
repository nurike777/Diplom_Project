/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.model;

import java.util.Date;
import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Timetable {
    private int id;
    private String name;
    private Date date;
    private int dayweek;
    private String description;
    private int id_coach;
    
    public Timetable(){
    }

    public Timetable(int id, String name, Date date, int dayweek, String description, int id_coach) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.dayweek = dayweek;
        this.description = description;
        this.id_coach = id_coach;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getDayweek() {
        return dayweek;
    }

    public String getDescription() {
        return description;
    }

    public int getId_coach() {
        return id_coach;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDayweek(int dayweek) {
        this.dayweek = dayweek;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_coach(int id_coach) {
        this.id_coach = id_coach;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.date);
        hash = 61 * hash + this.dayweek;
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + this.id_coach;
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
        final Timetable other = (Timetable) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.dayweek != other.dayweek) {
            return false;
        }
        if (this.id_coach != other.id_coach) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Timetable{" + "id=" + id + ", name=" + name + ", date=" + date + ", dayweek=" + dayweek + ", description=" + description + ", id_coach=" + id_coach + '}';
    }
    
    
}
