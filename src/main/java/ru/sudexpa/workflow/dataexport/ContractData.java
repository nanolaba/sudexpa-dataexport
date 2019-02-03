package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;
import java.util.Date;

public class ContractData implements Serializable {

    private static final long serialVersionUID = 5011024454996377537L;

    private boolean org;
    private String f;
    private String i;
    private String o;
    private Date birthdate;
    private String phone;
    private String address;
    private String passportNumber;
    private Date passportDate;
    private String passportAuthCode;
    private String passportAuth;
    private FileData passport;

    private String orgFullname;
    private String orgShortname;
    private String orgJurAddress;
    private String orgAddress;
    private String orgOGRN;
    private String orgINN;
    private String orgKPP;
    private String orgBill;
    private String orgCorrBill;
    private String orgBank;
    private String orgBIK;
    private String orgPhone;
    private String orgEmail;
    private String orgF;
    private String orgI;
    private String orgO;
    private String orgPost;

    private FileData egrul;
    private FileData inn;
    private FileData director;

    public boolean isOrg() {
        return org;
    }

    public void setOrg(boolean org) {
        this.org = org;
    }

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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(Date passportDate) {
        this.passportDate = passportDate;
    }

    public String getPassportAuthCode() {
        return passportAuthCode;
    }

    public void setPassportAuthCode(String passportAuthCode) {
        this.passportAuthCode = passportAuthCode;
    }

    public String getPassportAuth() {
        return passportAuth;
    }

    public void setPassportAuth(String passportAuth) {
        this.passportAuth = passportAuth;
    }

    public FileData getPassport() {
        return passport;
    }

    public void setPassport(FileData passport) {
        this.passport = passport;
    }

    public String getOrgFullname() {
        return orgFullname;
    }

    public void setOrgFullname(String orgFullname) {
        this.orgFullname = orgFullname;
    }

    public String getOrgShortname() {
        return orgShortname;
    }

    public void setOrgShortname(String orgShortname) {
        this.orgShortname = orgShortname;
    }

    public String getOrgJurAddress() {
        return orgJurAddress;
    }

    public void setOrgJurAddress(String orgJurAddress) {
        this.orgJurAddress = orgJurAddress;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgOGRN() {
        return orgOGRN;
    }

    public void setOrgOGRN(String orgOGRN) {
        this.orgOGRN = orgOGRN;
    }

    public String getOrgINN() {
        return orgINN;
    }

    public void setOrgINN(String orgINN) {
        this.orgINN = orgINN;
    }

    public String getOrgKPP() {
        return orgKPP;
    }

    public void setOrgKPP(String orgKPP) {
        this.orgKPP = orgKPP;
    }

    public String getOrgBill() {
        return orgBill;
    }

    public void setOrgBill(String orgBill) {
        this.orgBill = orgBill;
    }

    public String getOrgCorrBill() {
        return orgCorrBill;
    }

    public void setOrgCorrBill(String orgCorrBill) {
        this.orgCorrBill = orgCorrBill;
    }

    public String getOrgBank() {
        return orgBank;
    }

    public void setOrgBank(String orgBank) {
        this.orgBank = orgBank;
    }

    public String getOrgBIK() {
        return orgBIK;
    }

    public void setOrgBIK(String orgBIK) {
        this.orgBIK = orgBIK;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgF() {
        return orgF;
    }

    public void setOrgF(String orgF) {
        this.orgF = orgF;
    }

    public String getOrgI() {
        return orgI;
    }

    public void setOrgI(String orgI) {
        this.orgI = orgI;
    }

    public String getOrgO() {
        return orgO;
    }

    public void setOrgO(String orgO) {
        this.orgO = orgO;
    }

    public String getOrgPost() {
        return orgPost;
    }

    public void setOrgPost(String orgPost) {
        this.orgPost = orgPost;
    }

    public FileData getEgrul() {
        return egrul;
    }

    public void setEgrul(FileData egrul) {
        this.egrul = egrul;
    }

    public FileData getInn() {
        return inn;
    }

    public void setInn(FileData inn) {
        this.inn = inn;
    }

    public FileData getDirector() {
        return director;
    }

    public void setDirector(FileData director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;

        ContractData that = (ContractData) o1;

        if (org != that.org) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (egrul != null ? !egrul.equals(that.egrul) : that.egrul != null) return false;
        if (f != null ? !f.equals(that.f) : that.f != null) return false;
        if (i != null ? !i.equals(that.i) : that.i != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (o != null ? !o.equals(that.o) : that.o != null) return false;
        if (orgAddress != null ? !orgAddress.equals(that.orgAddress) : that.orgAddress != null) return false;
        if (orgBIK != null ? !orgBIK.equals(that.orgBIK) : that.orgBIK != null) return false;
        if (orgBank != null ? !orgBank.equals(that.orgBank) : that.orgBank != null) return false;
        if (orgBill != null ? !orgBill.equals(that.orgBill) : that.orgBill != null) return false;
        if (orgCorrBill != null ? !orgCorrBill.equals(that.orgCorrBill) : that.orgCorrBill != null) return false;
        if (orgEmail != null ? !orgEmail.equals(that.orgEmail) : that.orgEmail != null) return false;
        if (orgF != null ? !orgF.equals(that.orgF) : that.orgF != null) return false;
        if (orgFullname != null ? !orgFullname.equals(that.orgFullname) : that.orgFullname != null) return false;
        if (orgI != null ? !orgI.equals(that.orgI) : that.orgI != null) return false;
        if (orgINN != null ? !orgINN.equals(that.orgINN) : that.orgINN != null) return false;
        if (orgJurAddress != null ? !orgJurAddress.equals(that.orgJurAddress) : that.orgJurAddress != null)
            return false;
        if (orgKPP != null ? !orgKPP.equals(that.orgKPP) : that.orgKPP != null) return false;
        if (orgO != null ? !orgO.equals(that.orgO) : that.orgO != null) return false;
        if (orgOGRN != null ? !orgOGRN.equals(that.orgOGRN) : that.orgOGRN != null) return false;
        if (orgPhone != null ? !orgPhone.equals(that.orgPhone) : that.orgPhone != null) return false;
        if (orgPost != null ? !orgPost.equals(that.orgPost) : that.orgPost != null) return false;
        if (orgShortname != null ? !orgShortname.equals(that.orgShortname) : that.orgShortname != null) return false;
        if (passport != null ? !passport.equals(that.passport) : that.passport != null) return false;
        if (passportAuth != null ? !passportAuth.equals(that.passportAuth) : that.passportAuth != null) return false;
        if (passportAuthCode != null ? !passportAuthCode.equals(that.passportAuthCode) : that.passportAuthCode != null)
            return false;
        if (passportDate != null ? !passportDate.equals(that.passportDate) : that.passportDate != null) return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (org ? 1 : 0);
        result = 31 * result + (f != null ? f.hashCode() : 0);
        result = 31 * result + (i != null ? i.hashCode() : 0);
        result = 31 * result + (o != null ? o.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (passportDate != null ? passportDate.hashCode() : 0);
        result = 31 * result + (passportAuthCode != null ? passportAuthCode.hashCode() : 0);
        result = 31 * result + (passportAuth != null ? passportAuth.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        result = 31 * result + (orgFullname != null ? orgFullname.hashCode() : 0);
        result = 31 * result + (orgShortname != null ? orgShortname.hashCode() : 0);
        result = 31 * result + (orgJurAddress != null ? orgJurAddress.hashCode() : 0);
        result = 31 * result + (orgAddress != null ? orgAddress.hashCode() : 0);
        result = 31 * result + (orgOGRN != null ? orgOGRN.hashCode() : 0);
        result = 31 * result + (orgINN != null ? orgINN.hashCode() : 0);
        result = 31 * result + (orgKPP != null ? orgKPP.hashCode() : 0);
        result = 31 * result + (orgBill != null ? orgBill.hashCode() : 0);
        result = 31 * result + (orgCorrBill != null ? orgCorrBill.hashCode() : 0);
        result = 31 * result + (orgBank != null ? orgBank.hashCode() : 0);
        result = 31 * result + (orgBIK != null ? orgBIK.hashCode() : 0);
        result = 31 * result + (orgPhone != null ? orgPhone.hashCode() : 0);
        result = 31 * result + (orgEmail != null ? orgEmail.hashCode() : 0);
        result = 31 * result + (orgF != null ? orgF.hashCode() : 0);
        result = 31 * result + (orgI != null ? orgI.hashCode() : 0);
        result = 31 * result + (orgO != null ? orgO.hashCode() : 0);
        result = 31 * result + (orgPost != null ? orgPost.hashCode() : 0);
        result = 31 * result + (egrul != null ? egrul.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContractData{" +
                "org=" + org +
                ", f='" + f + '\'' +
                ", i='" + i + '\'' +
                ", o='" + o + '\'' +
                ", birthdate=" + birthdate +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportDate=" + passportDate +
                ", passportAuthCode='" + passportAuthCode + '\'' +
                ", passportAuth='" + passportAuth + '\'' +
                ", passport=" + passport +
                ", orgFullname='" + orgFullname + '\'' +
                ", orgShortname='" + orgShortname + '\'' +
                ", orgJurAddress='" + orgJurAddress + '\'' +
                ", orgAddress='" + orgAddress + '\'' +
                ", orgOGRN='" + orgOGRN + '\'' +
                ", orgINN='" + orgINN + '\'' +
                ", orgKPP='" + orgKPP + '\'' +
                ", orgBill='" + orgBill + '\'' +
                ", orgCorrBill='" + orgCorrBill + '\'' +
                ", orgBank='" + orgBank + '\'' +
                ", orgBIK='" + orgBIK + '\'' +
                ", orgPhone='" + orgPhone + '\'' +
                ", orgEmail='" + orgEmail + '\'' +
                ", orgF='" + orgF + '\'' +
                ", orgI='" + orgI + '\'' +
                ", orgO='" + orgO + '\'' +
                ", orgPost='" + orgPost + '\'' +
                ", egrul=" + egrul +
                ", inn=" + inn +
                ", director=" + director +
                '}';
    }
}
