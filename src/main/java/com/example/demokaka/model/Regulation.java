package com.example.demokaka.model;

public class Regulation {
    private Integer regulationId;

    private String regulationTitle;

    private String publishTime;

    private String publisher;

    private String byMeeting;

    private String mainBody;

    public Integer getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(Integer regulationId) {
        this.regulationId = regulationId;
    }

    public String getRegulationTitle() {
        return regulationTitle;
    }

    public void setRegulationTitle(String regulationTitle) {
        this.regulationTitle = regulationTitle == null ? null : regulationTitle.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getByMeeting() {
        return byMeeting;
    }

    public void setByMeeting(String byMeeting) {
        this.byMeeting = byMeeting == null ? null : byMeeting.trim();
    }

    public String getMainBody() {
        return mainBody;
    }

    public void setMainBody(String mainBody) {
        this.mainBody = mainBody == null ? null : mainBody.trim();
    }
}