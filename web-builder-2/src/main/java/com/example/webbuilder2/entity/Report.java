package com.example.webbuilder2.entity;

import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Report {

    private long id;
    private String name;
    private int year;
    private String subUrl;
    private long faviconId;

    public static Report createReport(String name, int year, String subUrl){
        Report report = new Report();
        report.setId(IdGenerator.generateId());
        report.setName(name);
        report.setYear(year);
        report.setSubUrl(subUrl);
        return report;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    public void setFaviconId(long faviconId) {
        this.faviconId = faviconId;
    }
}
