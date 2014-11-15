package com.feihuwang.pc.vo;

import java.io.Serializable;
import java.util.List;

import com.feihuwang.pc.bo.ContentInfoObject;

public class ChannelContentVO implements Serializable {
	private static final long serialVersionUID = 5658396926405320398L;
	private Integer channel_Id;
	private String channelName;
	private Integer parent_id;
	private Integer has_content;
	private Integer priority;
	private Integer isDisplay;
	private List<ContentVO> contents;
	
	public ChannelContentVO() {
	}

	public void putChannelContent(ContentInfoObject contentInfoObject) {
		if (contentInfoObject != null && contentInfoObject.getChannel() != null) {
			channel_Id = contentInfoObject.getChannel().getChannelId();
			channelName = contentInfoObject.getChannelName();
			parent_id = contentInfoObject.getChannel().getParentId();
			has_content = contentInfoObject.getChannel().getHas_content();
			priority = contentInfoObject.getChannel().getPriority();
			isDisplay = contentInfoObject.getChannel().getIsDisplay();
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

	public List<ContentVO> getContents() {
		return contents;
	}

	public void setContents(List<ContentVO> contents) {
		this.contents = contents;
	}
}
