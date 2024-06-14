package com.example.webbuilder.service;

import com.example.webbuilder.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    public Page getPage(){
        Page defaultPage = Page.createDefaultPage("ESG report page 1", "/page1", "logblack simple style 1");
        addHeaderSection(defaultPage);
        addBannerSection(defaultPage);
        addSideSection(defaultPage);
        addBodySection(defaultPage);
        addFooterSection(defaultPage);
        return defaultPage;
    }

    private void addHeaderSection(Page page){
        // element
        Element logblackLogo = Element.createSimpleImageElement("logblack logo", "logblack-logo.png", 1);
        Element nav1 = Element.createNavigationElement("nav1", "GRI 2 일반", List.of(), 1);
        Element nav2 = Element.createNavigationElement("nav2", "GRI 200 경제", List.of(), 2);
        Element nav3 = Element.createNavigationElement("nav3", "GRI 300 환경", List.of(), 3);
        Element nav4 = Element.createNavigationElement("nav4", "GRI 400 사회", List.of(), 4);
        // content
        Content logo = Content.createContent("logo1", ContentType.MAIN_LOGO, 1, 1);
        logo.addElement(logblackLogo);

        Content gnb = Content.createContent("gnb1", ContentType.GNB, 4, 2);
        gnb.addElement(nav1);
        gnb.addElement(nav2);
        gnb.addElement(nav3);
        gnb.addElement(nav4);
        // section
        Section section = Section.createSection(SectionType.HEADER);
        section.addContent(logo);
        section.addContent(gnb);
        // page
        page.addSection(section);
    }

    private void addBannerSection(Page page) {
        Element firstBanner = Element.createImageBlockElement("첫번째 배너", "banner1.png", "2023 지속가능성보고서 데모버전", List.of("테스트용으로 제작한 지속가능성보고서입니다."), 1);
        Element secondBanner = Element.createSimpleImageElement("두번째 배너", "banner2.png", 2);
        Element thirdBanner = Element.createSimpleImageElement("세번째 배너", "banner3.png", 3);

        Content banner = Content.createContent("banner", ContentType.SLIDE_BANNER, 3, 1);
        banner.addElement(firstBanner);
        banner.addElement(secondBanner);
        banner.addElement(thirdBanner);

        Section section = Section.createSection(SectionType.BANNER);
        section.addContent(banner);

        page.addSection(section);
    }

    private void addSideSection(Page page){
        // element
        Element nav1 = Element.createNavigationElementWithImage("nav1", "GRI 2 일반", List.of(), "/point.png", 1);
        Element nav2 = Element.createNavigationElementWithImage("nav2", "GRI 200 경제", List.of("201 경제실적", "202 시장점유율"), "/circle.png", 2);
        Element nav3 = Element.createNavigationElementWithImage("nav3", "GRI 300 환경", List.of("301 원재료", "302 에너지"), "/rectangle.png", 3);
        Element nav4 = Element.createNavigationElementWithImage("nav4", "GRI 400 사회", List.of("401 고용", "402 노사관계"), "/triangle.png", 4);
        // content
        Content lnb = Content.createContent("lnb1", ContentType.LNB, 4, 1);
        lnb.addElement(nav1);
        lnb.addElement(nav2);
        lnb.addElement(nav3);
        lnb.addElement(nav4);
        // section
        Section section = Section.createSection(SectionType.SIDE);
        section.addContent(lnb);
        // page
        page.addSection(section);
    }

    private void addBodySection(Page page){
        // element
        Element greetingH1 = Element.createH1Element("인사말", "안녕하십니까 로그블랙입니다.", 1);
        Element space1 = Element.createLongTextElement("띄어쓰기", "", 2);
        Element greetingH2 = Element.createH2Element("붙임말", "ESG SaaS 선도하는 기업", 3);
        Element greetingContent = Element.createLongTextElement("인사말 내용", "지속가능경영, 함께 하겠습니다.", 4);

        Element financialAbstractH1 = Element.createH1Element("경제실적", "경제 실적 요약", 1);
        Element financialAbstractContent = Element.createLongTextElement("경제실적 내용", "우선 우리 기업은 지난 1년간...", 2);
        // content
        Content topic1 = Content.createContent("topic1", ContentType.TOPIC, 999, 2);
        topic1.addElement(greetingH1);
        topic1.addElement(space1);
        topic1.addElement(greetingH2);
        topic1.addElement(greetingContent);

        Content topic2 = Content.createContent("topic2", ContentType.TOPIC, 999, 3);
        topic2.addElement(financialAbstractH1);
        topic2.addElement(financialAbstractContent);
        // section
        Section section = Section.createSection(SectionType.BODY);

        section.addContent(topic1);
        section.addContent(topic2);
        // page
        page.addSection(section);
    }

    private void addFooterSection(Page page){
        // Element
        Element nav1 = Element.createNavigationElement("nav1", "GRI 2 일반", List.of(), 1);
        Element nav2 = Element.createNavigationElement("nav2", "GRI 200 경제", List.of("201 경제실적", "202 시장점유율"), 2);
        Element nav3 = Element.createNavigationElement("nav3", "GRI 300 환경", List.of("301 원재료", "302 에너지"), 3);
        Element nav4 = Element.createNavigationElement("nav4", "GRI 400 사회", List.of("401 고용", "402 노사관계"), 4);
        // content
        Content fnb = Content.createContent("fnb1", ContentType.FNB, 4, 1);
        fnb.addElement(nav1);
        fnb.addElement(nav2);
        fnb.addElement(nav3);
        fnb.addElement(nav4);
        // section
        Section section = Section.createSection(SectionType.FOOTER);
        section.addContent(fnb);
        // page
        page.addSection(section);
    }
}
