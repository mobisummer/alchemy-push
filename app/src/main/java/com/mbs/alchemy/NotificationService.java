package com.mbs.alchemy;

import android.content.Context;
import com.mbs.alchemy.push.AlchemyNotificationOpenResult;
import com.mbs.alchemy.push.AlchemyNotificationReceivedResult;
import com.mbs.alchemy.push.AlchemyNotificationService;

public class NotificationService extends AlchemyNotificationService {

  @Override
  public boolean onPushReceive(Context context, AlchemyNotificationReceivedResult result) {
    return false;
  }

  @Override
  public boolean onPushOpen(Context context, AlchemyNotificationOpenResult result) {
    return false;
  }

}
