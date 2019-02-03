package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;
import java.util.Date;

public class LetterData implements Serializable {

    private static final long serialVersionUID = -4029024052670383013L;

    private boolean sendByEmail;
    private boolean sendByMail;
    private boolean sendByFax;
    private boolean sendPersonal;

    private String fax;
    private String address;
    private Date courtDate;

    public boolean isSendByEmail() {
        return sendByEmail;
    }

    public void setSendByEmail(boolean sendByEmail) {
        this.sendByEmail = sendByEmail;
    }

    public boolean isSendByMail() {
        return sendByMail;
    }

    public void setSendByMail(boolean sendByMail) {
        this.sendByMail = sendByMail;
    }

    public boolean isSendByFax() {
        return sendByFax;
    }

    public void setSendByFax(boolean sendByFax) {
        this.sendByFax = sendByFax;
    }

    public boolean isSendPersonal() {
        return sendPersonal;
    }

    public void setSendPersonal(boolean sendPersonal) {
        this.sendPersonal = sendPersonal;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCourtDate() {
        return courtDate;
    }

    public void setCourtDate(Date courtDate) {
        this.courtDate = courtDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LetterData that = (LetterData) o;

        if (sendByEmail != that.sendByEmail) return false;
        if (sendByFax != that.sendByFax) return false;
        if (sendByMail != that.sendByMail) return false;
        if (sendPersonal != that.sendPersonal) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (courtDate != null ? !courtDate.equals(that.courtDate) : that.courtDate != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (sendByEmail ? 1 : 0);
        result = 31 * result + (sendByMail ? 1 : 0);
        result = 31 * result + (sendByFax ? 1 : 0);
        result = 31 * result + (sendPersonal ? 1 : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (courtDate != null ? courtDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LetterData{" +
                "sendByEmail=" + sendByEmail +
                ", sendByMail=" + sendByMail +
                ", sendByFax=" + sendByFax +
                ", sendPersonal=" + sendPersonal +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", courtDate=" + courtDate +
                '}';
    }
}
