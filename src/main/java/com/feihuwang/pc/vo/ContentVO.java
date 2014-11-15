package com.feihuwang.pc.vo;

import java.io.Serializable;

import org.apache.commons.lang.time.DateFormatUtils;

import com.feihuwang.pc.model.ContentExt;

public class ContentVO implements Serializable {
	private static final long serialVersionUID = 8218442989154610598L;
	private Integer contentId;
	private String title;
	private String shortTitle;
	private String author;
	private String origin;
	private String originUrl;
	private String description;
	private String releaseDate;
	private String mediaPath;
	private String mediaType;
	private String titleColor;
	private String isBold;
	private String titleImg;
	private String contentImg;
	private String typeImg;
	private String link;
	
	public ContentVO() {
	}

	public void putContent(ContentExt contentExt) {
		if (contentExt != null) {
			contentId = contentExt.getContentId();
			title = contentExt.getTitle();
			shortTitle = contentExt.getShortTitle();
			author = contentExt.getAuthor();
			origin = contentExt.getOrigin();
			originUrl = contentExt.getOriginUrl();
			description = contentExt.getDescription();
			releaseDate = DateFormatUtils.ISO_DATE_FORMAT.format(contentExt.getReleaseDate());
			mediaPath = contentExt.getMediaPath();
			mediaType = contentExt.getMediaType();
			titleColor = contentExt.getTitleColor();
			isBold = contentExt.getIsBold();
			titleImg = contentExt.getTitleImg();
			contentImg = contentExt.getContentImg();
			typeImg = contentExt.getTypeImg();
			link = contentExt.getLink();
					
		}
	}

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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
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
}
