package ru.sudexpa.workflow.dataexport;

import ru.sudexpa.workflow.dataexport.enums.CourtSide;
import ru.sudexpa.workflow.dataexport.enums.ExpertiseType;

import java.io.Serializable;

public class CourtDetailsData implements Serializable {

    private static final long serialVersionUID = -8775626060263567383L;

    private ExpertiseType type;
    private String courtName;
    private String number;
    private String judgeF;
    private String judgeI;
    private String judgeO;
    private String claimant;
    private String defendant;
    private CourtSide courtSide;

    public ExpertiseType getType() {
        return type;
    }

    public void setType(ExpertiseType type) {
        this.type = type;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getJudgeF() {
        return judgeF;
    }

    public void setJudgeF(String judgeF) {
        this.judgeF = judgeF;
    }

    public String getJudgeI() {
        return judgeI;
    }

    public void setJudgeI(String judgeI) {
        this.judgeI = judgeI;
    }

    public String getJudgeO() {
        return judgeO;
    }

    public void setJudgeO(String judgeO) {
        this.judgeO = judgeO;
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public CourtSide getCourtSide() {
        return courtSide;
    }

    public void setCourtSide(CourtSide courtSide) {
        this.courtSide = courtSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourtDetailsData that = (CourtDetailsData) o;

        if (claimant != null ? !claimant.equals(that.claimant) : that.claimant != null) return false;
        if (courtName != null ? !courtName.equals(that.courtName) : that.courtName != null) return false;
        if (courtSide != that.courtSide) return false;
        if (defendant != null ? !defendant.equals(that.defendant) : that.defendant != null) return false;
        if (judgeF != null ? !judgeF.equals(that.judgeF) : that.judgeF != null) return false;
        if (judgeI != null ? !judgeI.equals(that.judgeI) : that.judgeI != null) return false;
        if (judgeO != null ? !judgeO.equals(that.judgeO) : that.judgeO != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (type != that.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (courtName != null ? courtName.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (judgeF != null ? judgeF.hashCode() : 0);
        result = 31 * result + (judgeI != null ? judgeI.hashCode() : 0);
        result = 31 * result + (judgeO != null ? judgeO.hashCode() : 0);
        result = 31 * result + (claimant != null ? claimant.hashCode() : 0);
        result = 31 * result + (defendant != null ? defendant.hashCode() : 0);
        result = 31 * result + (courtSide != null ? courtSide.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CourtDetailsData{" +
                "type=" + type +
                ", courtName='" + courtName + '\'' +
                ", number='" + number + '\'' +
                ", judgeF='" + judgeF + '\'' +
                ", judgeI='" + judgeI + '\'' +
                ", judgeO='" + judgeO + '\'' +
                ", claimant='" + claimant + '\'' +
                ", defendant='" + defendant + '\'' +
                ", courtSide=" + courtSide +
                '}';
    }
}
