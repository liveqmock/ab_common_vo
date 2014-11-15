package com.feihuwang.pc.vo;

import java.io.Serializable;

import com.feihuwang.pc.bo.ChannelInfoObject;

public class ChannelVO implements Serializable {
	private static final long serialVersionUID = -2674109431796406790L;
	private Integer channel_Id;
	private String channelName;
	private Integer parent_id;
	private Integer has_content;
	private Integer priority;
	private Integer isDisplay;
	
	public ChannelVO() {
	}

	public void putChannel(ChannelInfoObject channelInfoObject) {
		if (channelInfoObject != null && channelInfoObject.getChannel() != null) {
			channel_Id = channelInfoObject.getChannel().getChannelId();
			channelName = channelInfoObject.getChannelName();
			parent_id = channelInfoObject.getChannel().getParentId();
			has_content = channelInfoObject.getChannel().getHas_content();
			priority = channelInfoObject.getChannel().getPriority();
			isDisplay = channelInfoObject.getChannel().getIsDisplay();
		}
	}

	public Integer getChannel_Id() {
		return channel_Id;
	}

	public void setChannel_Id(Integer channel_Id) {
		this.channel_Id = channel_Id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
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
}
