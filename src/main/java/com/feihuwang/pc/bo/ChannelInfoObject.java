package com.feihuwang.pc.bo;

import java.io.Serializable;

import com.feihuwang.pc.model.Channel;

public class ChannelInfoObject implements Serializable {
	private static final long serialVersionUID = -2544289989638877546L;
	private Channel channel;
    private String channelName;
    
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