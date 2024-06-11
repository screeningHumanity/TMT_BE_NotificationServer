package com.notificationserver.application.port.in.usecase;

import com.notificationserver.application.port.in.dto.LoadNotificationLogInDto;
import com.notificationserver.application.port.in.dto.SaveNotificationInDto;
import com.notificationserver.application.port.in.dto.SaveNotificationLogInDto;
import java.util.List;

public interface NotificationUseCase {
	void sendAlarm(String uuid, SaveNotificationLogInDto saveNotificationLogInDto);

	void saveFcmTokenByUuid(SaveNotificationInDto saveNotificationInDto);

	void readAlarm(List<Long> notificationLogIds, String uuid);

	List<LoadNotificationLogInDto> getAlarm(String uuid);
}