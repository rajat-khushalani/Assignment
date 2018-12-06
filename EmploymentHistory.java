package model;

import java.util.Date;
import java.util.Objects;

public class EmploymentHistory {
    String Organization;
    float workDuration;
    String projectWorked;

    public EmploymentHistory(String Organization, float workDuration, String projectWorked) {
        this.Organization = Organization;
        this.workDuration = workDuration;
        this.projectWorked = projectWorked;
    }

    public String getOrganization() {
        return Organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmploymentHistory that = (EmploymentHistory) o;
        return Float.compare(that.workDuration, workDuration) == 0 &&
                Objects.equals(Organization, that.Organization) &&
                Objects.equals(projectWorked, that.projectWorked);
    }

    @Override
    public String toString() {
        return "EmploymentHistory{" +
                "Organization='" + Organization + '\'' +
                ", workDuration=" + workDuration +
                ", projectWorked='" + projectWorked + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(Organization, workDuration, projectWorked);
    }

    public float getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(float workDuration) {
        this.workDuration = workDuration;
    }

    public String getProjectWorked() {
        return projectWorked;
    }

    public void setProjectWorked(String projectWorked) {
        this.projectWorked = projectWorked;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }
}
