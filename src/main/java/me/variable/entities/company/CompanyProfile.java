package me.variable.entities.company;

import com.googlecode.objectify.annotation.Entity;
import me.variable.categories.CompanyCulture;
import me.variable.categories.Office;

import java.util.List;

/**
 * Created by adi on 3/5/17.
 */
@Entity
public class CompanyProfile extends CompanyMetadata {

    private String industry;
    private String companyType;
    private CompanyCulture companyCulture;
    private List<Office> offices;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public CompanyCulture getCompanyCulture() {
        return companyCulture;
    }

    public void setCompanyCulture(CompanyCulture companyCulture) {
        this.companyCulture = companyCulture;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

}
