package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;

public class ContactsData implements Serializable {

    private static final long serialVersionUID = -4441772270655226527L;
    private String ip;
    private String f;
    private String i;
    private String o;
    private String country;
    private String city;
    private String phone;
    private String email;
    private boolean orgRepresentative;
    private String orgName;
    private String orgPost;


    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOrgRepresentative() {
        return orgRepresentative;
    }

    public void setOrgRepresentative(boolean orgRepresentative) {
        this.orgRepresentative = orgRepresentative;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgPost() {
        return orgPost;
    }

    public void setOrgPost(String orgPost) {
        this.orgPost = orgPost;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;

        ContactsData that = (ContactsData) o1;

        if (orgRepresentative != that.orgRepresentative) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (f != null ? !f.equals(that.f) : that.f != null) return false;
        if (i != null ? !i.equals(that.i) : that.i != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (o != null ? !o.equals(that.o) : that.o != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (orgPost != null ? !orgPost.equals(that.orgPost) : that.orgPost != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ip != null ? ip.hashCode() : 0;
        result = 31 * result + (f != null ? f.hashCode() : 0);
        result = 31 * result + (i != null ? i.hashCode() : 0);
        result = 31 * result + (o != null ? o.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (orgRepresentative ? 1 : 0);
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (orgPost != null ? orgPost.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactsData{" +
                "ip='" + ip + '\'' +
                ", f='" + f + '\'' +
                ", i='" + i + '\'' +
                ", o='" + o + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", orgRepresentative=" + orgRepresentative +
                ", orgName='" + orgName + '\'' +
                ", orgPost='" + orgPost + '\'' +
                '}';
    }
}
