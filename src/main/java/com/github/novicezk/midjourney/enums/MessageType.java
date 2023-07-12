package com.github.novicezk.midjourney.enums;


public enum MessageType {
	/**
	 * 创建.
	 */
	CREATE,
	/**
	 * 修改.
	 */
	UPDATE,
	/**
	 * 删除.
	 */
	DELETE;

	public static MessageType of(String type) {
		MessageType messageType = null;
		 switch (type) {
			 case "MESSAGE_CREATE" :
				 messageType = CREATE;
				 break;
			 case "MESSAGE_UPDATE" :
				 messageType = UPDATE;
				 break;
			 case "MESSAGE_DELETE" :
				 messageType = DELETE;
				 break;
			 default :
				 messageType = null;
		};
		return messageType;
	}
}
