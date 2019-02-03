package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;
import java.util.Date;

public class ReviewData implements Serializable {

    private static final long serialVersionUID = 3778854873561151621L;

    private String fabula;
    private String orgName;
    private String expertiseType;
    private Date expertiseDate;
    private Long pageCount;

    public String getFabula() {
        return fabula;
    }

    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getExpertiseType() {
        return expertiseType;
    }

    public void setExpertiseType(String expertiseType) {
        this.expertiseType = expertiseType;
    }

    public Date getExpertiseDate() {
        return expertiseDate;
    }

    public void setExpertiseDate(Date expertiseDate) {
        this.expertiseDate = expertiseDate;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReviewData that = (ReviewData) o;

        if (expertiseDate != null ? !expertiseDate.equals(that.expertiseDate) : that.expertiseDate != null)
            return false;
        if (expertiseType != null ? !expertiseType.equals(that.expertiseType) : that.expertiseType != null)
            return false;
        if (fabula != null ? !fabula.equals(that.fabula) : that.fabula != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (pageCount != null ? !pageCount.equals(that.pageCount) : that.pageCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fabula != null ? fabula.hashCode() : 0;
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (expertiseType != null ? expertiseType.hashCode() : 0);
        result = 31 * result + (expertiseDate != null ? expertiseDate.hashCode() : 0);
        result = 31 * result + (pageCount != null ? pageCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ReviewData{" +
                "fabula='" + fabula + '\'' +
                ", orgName='" + orgName + '\'' +
                ", expertiseType='" + expertiseType + '\'' +
                ", expertiseDate=" + expertiseDate +
                ", pageCount=" + pageCount +
                '}';
    }
}
