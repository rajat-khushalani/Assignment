package model;

import java.util.Objects;

public class EducationalDetails {

    String qualificationType;
    String yearOfPassing;
    float percentageObtained;

    public String getQualificationType() {
        return qualificationType;
    }

    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public String getYearOfPassing() {
        return yearOfPassing;
    }

    @Override
    public String toString() {
        return "EducationalDetails{" +
                "qualificationType='" + qualificationType + '\'' +
                ", yearOfPassing='" + yearOfPassing + '\'' +
                ", percentageObtained=" + percentageObtained +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationalDetails that = (EducationalDetails) o;
        return Float.compare(that.percentageObtained, percentageObtained) == 0 &&
                Objects.equals(qualificationType, that.qualificationType) &&
                Objects.equals(yearOfPassing, that.yearOfPassing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualificationType, yearOfPassing, percentageObtained);
    }

    public void setYearOfPassing(String yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public float getPercentageObtained() {
        return percentageObtained;
    }

    public void setPercentageObtained(float percentageObtained) {
        this.percentageObtained = percentageObtained;
    }

    public EducationalDetails(String qualificationType, String yearOfPassing, float percentageObtained) {
        this.qualificationType = qualificationType;
        this.yearOfPassing = yearOfPassing;
        this.percentageObtained = percentageObtained;
    }
}
