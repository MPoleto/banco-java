package Entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private LocalDate birthday;
    private String cpf;
    private long cellphone;
    private String email;
    private String address;
    
    public Client(String name, LocalDate birthday, String cpf, long cellphone, String email, String address) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.cellphone = cellphone;
        this.email = email;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public long getCellphone() {
        return cellphone;
    }
    
    public void setCellphone(long cellphone) {
        this.cellphone = cellphone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
