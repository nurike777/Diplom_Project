/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.model;

import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Vacancy {
    private int id;
    private String vacancy;
    private String description;
    private int id_position;
    
    public Vacancy() {
    }

    public Vacancy(int id, String vacancy, String description, int id_position) {
        this.id = id;
        this.vacancy = vacancy;
        this.description = description;
        this.id_position = id_position;
    }

    public int getId() {
        return id;
    }

    public String getVacancy() {
        return vacancy;
    }

    public String getDescription() {
        return description;
    }

    public int getId_position() {
        return id_position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_position(int id_position) {
        this.id_position = id_position;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.vacancy);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + this.id_position;
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
        final Vacancy other = (Vacancy) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_position != other.id_position) {
            return false;
        }
        if (!Objects.equals(this.vacancy, other.vacancy)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vacancy{" + "id=" + id + ", vacancy=" + vacancy + ", description=" + description + ", id_position=" + id_position + '}';
    }
    
            
}
