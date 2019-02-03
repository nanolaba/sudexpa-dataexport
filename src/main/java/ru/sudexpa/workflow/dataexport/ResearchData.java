package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;

public class ResearchData implements Serializable {

    private static final long serialVersionUID = 6182721475891567983L;

    private String expertiseType;
    private String fabula;
    private String materials;
    private String questions;

    public String getExpertiseType() {
        return expertiseType;
    }

    public void setExpertiseType(String expertiseType) {
        this.expertiseType = expertiseType;
    }

    public String getFabula() {
        return fabula;
    }

    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResearchData that = (ResearchData) o;

        if (expertiseType != null ? !expertiseType.equals(that.expertiseType) : that.expertiseType != null)
            return false;
        if (fabula != null ? !fabula.equals(that.fabula) : that.fabula != null) return false;
        if (materials != null ? !materials.equals(that.materials) : that.materials != null) return false;
        if (questions != null ? !questions.equals(that.questions) : that.questions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = expertiseType != null ? expertiseType.hashCode() : 0;
        result = 31 * result + (fabula != null ? fabula.hashCode() : 0);
        result = 31 * result + (materials != null ? materials.hashCode() : 0);
        result = 31 * result + (questions != null ? questions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResearchData{" +
                "expertiseType='" + expertiseType + '\'' +
                ", fabula='" + fabula + '\'' +
                ", materials='" + materials + '\'' +
                ", questions='" + questions + '\'' +
                '}';
    }
}
