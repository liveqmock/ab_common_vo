package com.feihuwang.pc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jc_content_ext")
public class ContentExt implements EntityItem {
	private static final long serialVersionUID = -1518908604288294847L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "content_id")
	private Integer contentId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "short_title")
	private String shortTitle;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "origin")
	private String origin;
	
	@Column(name = "origin_url")
	private String originUrl;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "release_date")
	private Date releaseDate;
	
	@Column(name = "media_path")
	private String mediaPath;
	
	@Column(name = "media_type")
	private String mediaType;
	
	@Column(name = "title_color")
	private String titleColor;
	
	@Column(name = "is_bold")
	private String isBold;
	
	@Column(name = "title_img")
	private String titleImg;
	
	@Column(name = "content_img")
	private String contentImg;
	
	@Column(name = "type_img")
	private String typeImg;
	
	@Column(name = "link")
	private String link;

	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOriginUrl() {
		return originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMediaPath() {
		return mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getTitleColor() {
		return titleColor;
	}

	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}

	public String getIsBold() {
		return isBold;
	}

	public void setIsBold(String isBold) {
		this.isBold = isBold;
	}

	public String getTitleImg() {
		return titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public String getContentImg() {
		return contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	public String getTypeImg() {
		return typeImg;
	}

	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public Serializable getMyId() {
		return contentId;
	}
}
