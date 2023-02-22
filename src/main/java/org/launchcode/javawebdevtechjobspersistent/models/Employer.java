package org.launchcode.javawebdevtechjobspersistent.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 25)
    private String location;

    public Employer() {}

    @OneToMany
    private List<Job> jobs= new ArrayList<>();
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }






}
