package com.feihuwang.pc.bo;

import java.io.Serializable;
import java.util.List;

import com.feihuwang.pc.model.Channel;
import com.feihuwang.pc.model.ContentExt;

public class ContentInfoObject implements Serializable {
	private static final long serialVersionUID = -3296576958831546657L;
	private List<ContentExt> contents;
	private Channel channel;
	private String channelName;
	public List<ContentExt> getContents() {
		return contents;
	}
	public void setContents(List<ContentExt> contents) {
		this.contents = contents;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}