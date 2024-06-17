package com.example.webbuilder2.entity;



import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class Page {

    private long id;
    private String name;
    private String subUrl;
    private String pageStyle;
    private long reportId;


    public static Page createDefaultPage(String name, String subUrl, String pageStyle, long reportId){
        Page page = new Page();
        page.setName(name);
        page.setId(IdGenerator.generateId());
        page.setPageStyle(pageStyle);
        page.setSubUrl(subUrl);
        page.setReportId(reportId);
        return page;
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    private void setPageStyle(String pageStyle) {
        this.pageStyle = pageStyle;
    }

    private void setReportId(long reportId) {
        this.reportId = reportId;
    }
}
