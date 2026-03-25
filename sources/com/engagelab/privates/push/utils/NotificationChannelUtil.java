package com.engagelab.privates.push.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.NotificationMessage;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationChannelUtil {
    private static final String CHANNEL_DEFAULT = "ENGAGELAB_PRIVATES_CHANNEL_normal";
    private static final String CHANNEL_HIGH = "ENGAGELAB_PRIVATES_CHANNEL_high";
    private static final String CHANNEL_LOW = "ENGAGELAB_PRIVATES_CHANNEL_low";
    private static final String CHANNEL_SILENCE = "ENGAGELAB_PRIVATES_CHANNEL_silence";
    private static final String TAG = "NotificationChannelUtil";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getChannelId(Context context, boolean z, NotificationMessage notificationMessage) {
        if (z) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_silence_" + notificationMessage.getPriority();
        }
        if (!TextUtils.isEmpty(notificationMessage.getChannelId())) {
            return notificationMessage.getChannelId();
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_low_" + notificationMessage.getPriority();
        }
        if (priority == 1 || priority == 2) {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return "N_ENGAGELAB_PRIVATES_CHANNEL_high_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults();
            }
            return "N_ENGAGELAB_PRIVATES_CHANNEL_high_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
        }
        if (TextUtils.isEmpty(notificationMessage.getSound())) {
            return "N_ENGAGELAB_PRIVATES_CHANNEL_normal_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults();
        }
        return "N_ENGAGELAB_PRIVATES_CHANNEL_normal_" + notificationMessage.getPriority() + "_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int getChannelImportance(Context context, boolean z, NotificationMessage notificationMessage) {
        return z ? notificationMessage.getPriority() != -2 ? 2 : 1 : getImportance(notificationMessage.getPriority());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getChannelName(Context context, boolean z, NotificationMessage notificationMessage) {
        if (z) {
            int identifier = context.getResources().getIdentifier(CHANNEL_SILENCE, "string", context.getPackageName());
            return identifier > 0 ? context.getString(identifier) : "SILENCE";
        }
        int priority = notificationMessage.getPriority();
        int identifier2 = context.getResources().getIdentifier((priority == -2 || priority == -1) ? CHANNEL_LOW : (priority == 1 || priority == 2) ? CHANNEL_HIGH : CHANNEL_DEFAULT, "string", context.getPackageName());
        return identifier2 > 0 ? context.getString(identifier2) : "NORMAL";
    }

    private static int getImportance(int i) {
        if (i == -2) {
            return 1;
        }
        if (i == -1) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 3 : 5;
        }
        return 4;
    }

    public static String getChannel(Context context, boolean z, NotificationMessage notificationMessage) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String channelId = getChannelId(context, z, notificationMessage);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(channelId);
        int channelImportance = getChannelImportance(context, z, notificationMessage);
        if (notificationChannel != null) {
            if (-1 != notificationMessage.getImportance()) {
                notificationChannel.setImportance(channelImportance);
                MTCommonLog.d(TAG, "has channelId:" + channelId + " and set channelImportance:" + channelImportance);
            }
            MTCommonLog.d(TAG, "has channelId:" + channelId);
            return channelId;
        }
        String channelName = getChannelName(context, z, notificationMessage);
        NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(channelId, channelName, channelImportance);
        Uri soundUri = NotificationUtil.getSoundUri(context, z, notificationMessage);
        int defaults = NotificationUtil.getDefaults(context, z, notificationMessage);
        notificationChannelM.setLockscreenVisibility(NotificationUtil.getVisibility(context, z, notificationMessage));
        try {
            if (soundUri != null) {
                notificationChannelM.setSound(soundUri, null);
            } else if ((defaults & 1) == 0) {
                notificationChannelM.setSound(null, null);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "setSound fail:" + th);
        }
        notificationChannelM.enableLights((defaults & 4) != 0);
        notificationChannelM.enableVibration((defaults & 2) != 0);
        notificationManager.createNotificationChannel(notificationChannelM);
        MTCommonLog.d(TAG, "build channel channelId:" + channelId + ", channelName:" + channelName + ", channelImportance:" + channelImportance);
        return channelId;
    }
}
