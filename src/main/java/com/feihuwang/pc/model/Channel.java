package com.feihuwang.pc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jc_channel")
public class Channel implements EntityItem {
	private static final long serialVersionUID = 2979320550969478562L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "channel_id")
	private Integer channelId;
	
	@Column(name = "parent_id")
	private Integer parentId;
	
	@Column(name = "has_content")
	private Integer has_content;
	
	@Column(name = "priority")
	private Integer priority;
	
	@Column(name = "is_display")
	private Integer isDisplay;

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getHas_content() {
		return has_content;
	}

	public void setHas_content(Integer has_content) {
		this.has_content = has_content;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	@Override
	public Serializable getMyId() {
		return channelId;
	}
}
