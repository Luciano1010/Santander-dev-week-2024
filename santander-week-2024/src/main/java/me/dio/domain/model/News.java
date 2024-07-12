package me.dio.domain.model;

public class News {
    private Long id;
    private String icon;
    private String descriptionNews;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescriptionNews() {
        return descriptionNews;
    }
    public void setDescriptionNews(String descriptionNews) {
        this.descriptionNews = descriptionNews;
    }
}
