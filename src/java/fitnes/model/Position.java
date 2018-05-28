/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Position {
    private int id;
    private String name;
    private List<Vacancy> vacancy;
    private List<Coach> coach;
    
    public Position(){
    }

    public Position(int id, String name, List<Vacancy> vacancy, List<Coach> coach) {
        this.id = id;
        this.name = name;
        this.vacancy = vacancy;
        this.coach = coach;
    }

    public Position(int id, String name) {
        this.id = id;
        this.name = name;
        vacancy = new ArrayList<>();
        coach = new ArrayList<>();
    }
        
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Vacancy> getVacancy() {
        return vacancy;
    }

    public List<Coach> getCoach() {
        return coach;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVacancy(List<Vacancy> vacancy) {
        this.vacancy = vacancy;
    }

    public void setCoach(List<Coach> coach) {
        this.coach = coach;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.vacancy);
        hash = 37 * hash + Objects.hashCode(this.coach);
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
        final Position other = (Position) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.vacancy, other.vacancy)) {
            return false;
        }
        if (!Objects.equals(this.coach, other.coach)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Position{" + "id=" + id + ", name=" + name + ", vacancy=" + vacancy + ", coach=" + coach + '}';
    }
    
    
}
