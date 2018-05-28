/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author nurzh
 */
public class Price {
    private int id;
    private String name;
    private String description;
    private int price;
    private Time timestart;
    private Time timeend;
    private int countday;
    private List<Request> request;
    
    public Price(){
    }

    public Price(int id, String name, String description, int price, Time timestart, Time timeend, int countday, List<Request> request) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.timestart = timestart;
        this.timeend = timeend;
        this.countday = countday;
        this.request = request;
    }
    
    public Price(int id, String name, String description, int price, Time timestart, Time timeend, int countday) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.timestart = timestart;
        this.timeend = timeend;
        this.countday = countday;
        request = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public Time getTimestart() {
        return timestart;
    }

    public Time getTimeend() {
        return timeend;
    }

    public int getCountday() {
        return countday;
    }

    public List<Request> getRequest() {
        return request;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTimestart(Time timestart) {
        this.timestart = timestart;
    }

    public void setTimeend(Time timeend) {
        this.timeend = timeend;
    }

    public void setCountday(int countday) {
        this.countday = countday;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.price;
        hash = 29 * hash + Objects.hashCode(this.timestart);
        hash = 29 * hash + Objects.hashCode(this.timeend);
        hash = 29 * hash + this.countday;
        hash = 29 * hash + Objects.hashCode(this.request);
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
        final Price other = (Price) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (this.countday != other.countday) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.timestart, other.timestart)) {
            return false;
        }
        if (!Objects.equals(this.timeend, other.timeend)) {
            return false;
        }
        if (!Objects.equals(this.request, other.request)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Price{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", timestart=" + timestart + ", timeend=" + timeend + ", countday=" + countday + ", request=" + request + '}';
    }
    
    
}
