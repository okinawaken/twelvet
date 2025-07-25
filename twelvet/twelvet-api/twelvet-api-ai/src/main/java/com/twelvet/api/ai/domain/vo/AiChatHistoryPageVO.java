package com.twelvet.api.ai.domain.vo;

import cn.idev.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.twelvet.api.ai.constant.RAGEnums;
import com.twelvet.framework.core.application.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * AI聊天记录分页对象
 *
 * @author TwelveT
 * @WebSite twelvet.cn
 * @date 2025-07-09
 */
@Schema(description = "AI聊天记录分页对象")
public class AiChatHistoryPageVO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@Schema(description = "ID")
	private Long chatHistoryId;

	/**
	 * 消息唯一id
	 */
	@Schema(description = "消息唯一id")
	@ExcelProperty(value = "消息唯一id")
	private String msgId;

	/**
	 * 内容
	 */
	@Schema(description = "内容")
	@ExcelProperty(value = "内容")
	private String content;

	/**
	 * 归属的消息用户ID
	 */
	@Schema(description = "归属的消息用户ID")
	@ExcelProperty(value = "归属的消息用户ID")
	private String userId;

	/**
	 * 知识库ID
	 */
	@Schema(description = "知识库ID")
	@ExcelProperty(value = "知识库ID")
	private Long knowledgeId;

	/**
	 * 消息发送人ID
	 */
	@Schema(description = "消息发送人ID")
	@ExcelProperty(value = "消息发送人ID")
	private String sendUserId;

	/**
	 * 消息发送人名称
	 */
	@Schema(description = "消息发送人名称")
	@ExcelProperty(value = "消息发送人名称")
	private String sendUserName;

	/**
	 * 发送消息用户类型
	 */
	@Schema(description = "发送消息用户类型")
	@ExcelProperty(value = "发送消息用户类型")
	private RAGEnums.UserTypeEnums createByType;

	/**
	 * 创建时间
	 */
	@Schema(description = "创建时间")
	@ExcelProperty("创建时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;

	public Long getChatHistoryId() {
		return chatHistoryId;
	}

	public void setChatHistoryId(Long chatHistoryId) {
		this.chatHistoryId = chatHistoryId;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getSendUserId() {
		return sendUserId;
	}

	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}

	public String getSendUserName() {
		return sendUserName;
	}

	public void setSendUserName(String sendUserName) {
		this.sendUserName = sendUserName;
	}

	public RAGEnums.UserTypeEnums getCreateByType() {
		return createByType;
	}

	public void setCreateByType(RAGEnums.UserTypeEnums createByType) {
		this.createByType = createByType;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "AiChatHistoryPageVO{" + "chatHistoryId=" + chatHistoryId + ", msgId='" + msgId + '\'' + ", content='"
				+ content + '\'' + ", userId='" + userId + '\'' + ", knowledgeId=" + knowledgeId + ", sendUserId='"
				+ sendUserId + '\'' + ", sendUserName='" + sendUserName + '\'' + ", createByType=" + createByType
				+ ", createTime=" + createTime + '}';
	}

}
