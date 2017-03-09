package about;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

    private String title;

    private String website;

    private Date start;

    private Date end;

    private String responsibilities;

    private List<String> code;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public List<String> getCode() {
        if (code == null) {
            return new ArrayList<>();
        }
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }
}