package ru.sudexpa.workflow.dataexport;

import ru.sudexpa.workflow.dataexport.enums.DataType;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class ExportData implements Serializable {

    private static final long serialVersionUID = 4480983330446197685L;

    private String id;
    private String title;
    private String description;
    private Date requestTime;

    private DataType dataType;

    private ContactsData contactsData;
    private CourtDetailsData courtDetailsData;
    private ReviewData reviewData;
    private ContractData contractData;
    private ResearchData researchData;
    private LetterData letterData;

    private String question;
    private FileData[] files;

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public ContactsData getContactsData() {
        return contactsData;
    }

    public void setContactsData(ContactsData contactsData) {
        this.contactsData = contactsData;
    }

    public CourtDetailsData getCourtDetailsData() {
        return courtDetailsData;
    }

    public void setCourtDetailsData(CourtDetailsData courtDetailsData) {
        this.courtDetailsData = courtDetailsData;
    }

    public ReviewData getReviewData() {
        return reviewData;
    }

    public void setReviewData(ReviewData reviewData) {
        this.reviewData = reviewData;
    }

    public ContractData getContractData() {
        return contractData;
    }

    public void setContractData(ContractData contractData) {
        this.contractData = contractData;
    }

    public ResearchData getResearchData() {
        return researchData;
    }

    public void setResearchData(ResearchData researchData) {
        this.researchData = researchData;
    }

    public LetterData getLetterData() {
        return letterData;
    }

    public void setLetterData(LetterData letterData) {
        this.letterData = letterData;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public FileData[] getFiles() {
        return files;
    }

    public void setFiles(FileData[] files) {
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExportData that = (ExportData) o;

        if (contactsData != null ? !contactsData.equals(that.contactsData) : that.contactsData != null) return false;
        if (contractData != null ? !contractData.equals(that.contractData) : that.contractData != null) return false;
        if (courtDetailsData != null ? !courtDetailsData.equals(that.courtDetailsData) : that.courtDetailsData != null)
            return false;
        if (dataType != that.dataType) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!Arrays.equals(files, that.files)) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (letterData != null ? !letterData.equals(that.letterData) : that.letterData != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (requestTime != null ? !requestTime.equals(that.requestTime) : that.requestTime != null) return false;
        if (researchData != null ? !researchData.equals(that.researchData) : that.researchData != null) return false;
        if (reviewData != null ? !reviewData.equals(that.reviewData) : that.reviewData != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (requestTime != null ? requestTime.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (contactsData != null ? contactsData.hashCode() : 0);
        result = 31 * result + (courtDetailsData != null ? courtDetailsData.hashCode() : 0);
        result = 31 * result + (reviewData != null ? reviewData.hashCode() : 0);
        result = 31 * result + (contractData != null ? contractData.hashCode() : 0);
        result = 31 * result + (researchData != null ? researchData.hashCode() : 0);
        result = 31 * result + (letterData != null ? letterData.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (files != null ? Arrays.hashCode(files) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExportData{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", requestTime=" + requestTime +
                ", dataType=" + dataType +
                ", contactsData=" + contactsData +
                ", courtDetailsData=" + courtDetailsData +
                ", reviewData=" + reviewData +
                ", contractData=" + contractData +
                ", researchData=" + researchData +
                ", letterData=" + letterData +
                ", question='" + question + '\'' +
                ", files=" + Arrays.toString(files) +
                '}';
    }
}
