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
public class Client {
    private int id;
    private String login;
    private String name;
    private String surname;
    private String phone;
    private String password;
    private List<Request> request;
    
    public Client(){
    }

    public Client(int id, String login, String name, String surname, String phone, String password, List<Request> request) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.password = password;
        this.request = request;
    }
    
    public Client(int id, String login, String name, String surname, String phone, String password) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.password = password;
        request = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public List<Request> getRequest() {
        return request;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.login);
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.surname);
        hash = 61 * hash + Objects.hashCode(this.phone);
        hash = 61 * hash + Objects.hashCode(this.password);
        hash = 61 * hash + Objects.hashCode(this.request);
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
        final Client other = (Client) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.request, other.request)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", login=" + login + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", password=" + password + ", request=" + request + '}';
    }

    
}
