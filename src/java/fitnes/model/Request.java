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
public class Request {
    private int id;
    private Date datestart;
    private String statuspay;
    private int id_price;
    private int id_client;
    
    public Request(){
    }

    public Request(int id, Date datestart, String statuspay, int id_price, int id_client) {
        this.id = id;
        this.datestart = datestart;
        this.statuspay = statuspay;
        this.id_price = id_price;
        this.id_client = id_client;
    }

    public int getId() {
        return id;
    }

    public Date getDatestart() {
        return datestart;
    }

    public String getStatuspay() {
        return statuspay;
    }

    public int getId_price() {
        return id_price;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public void setStatuspay(String statuspay) {
        this.statuspay = statuspay;
    }

    public void setId_price(int id_price) {
        this.id_price = id_price;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.datestart);
        hash = 23 * hash + Objects.hashCode(this.statuspay);
        hash = 23 * hash + this.id_price;
        hash = 23 * hash + this.id_client;
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
        final Request other = (Request) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_price != other.id_price) {
            return false;
        }
        if (this.id_client != other.id_client) {
            return false;
        }
        if (!Objects.equals(this.statuspay, other.statuspay)) {
            return false;
        }
        if (!Objects.equals(this.datestart, other.datestart)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", datestart=" + datestart + ", statuspay=" + statuspay + ", id_price=" + id_price + ", id_client=" + id_client + '}';
    }
    
    
}
