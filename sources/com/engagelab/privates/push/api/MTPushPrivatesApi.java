package com.engagelab.privates.push.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.material3.CalendarModelKt;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.f0;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.utils.NotificationUtil;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MTPushPrivatesApi {
    public static final byte PLATFORM_DEFAULT = 0;
    public static final byte PLATFORM_GOOGLE = 8;
    public static final byte PLATFORM_HONOR = 7;
    public static final byte PLATFORM_HUAWEI = 2;
    public static final byte PLATFORM_MEIZU = 3;
    public static final byte PLATFORM_OPPO = 4;
    public static final byte PLATFORM_VIVO = 5;
    public static final byte PLATFORM_XIAOMI = 1;
    public static int SDK_VERSION_CODE = 439;
    public static String SDK_VERSION_NAME = "4.3.9";
    private static final String TAG = "MTPushPrivatesApi";

    /* JADX INFO: loaded from: classes14.dex */
    public static class Code {
        public static int CONNECT_NOT_ENABLE = 6012;
        public static int INVALID_ALIAS = 6003;
        public static int INVALID_JSON = 6010;
        public static int INVALID_MOBILE_NUMBER = 6023;
        public static int INVALID_TAGS = 6005;
        public static int INVOKE_TOO_SOON = 6011;
        public static int NULL_TAG_AND_ALIAS = 6001;
        public static final int SUCCESS = 0;
        public static int TIMEOUT = 6002;
        public static int TOO_LONG_ALIAS = 6004;
        public static int TOO_LONG_TAG = 6006;
        public static int TOO_LONG_TAGS = 6008;
        public static int TOO_MANY_TAGS = 6007;
        public static int UNKNOWN_ERROR = 6009;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.e(TAG, "addTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "addTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.e(TAG, "addTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.e(TAG, "addTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray("tag", strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_ADD, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void addTags(Context context, int i, Set<String> set) {
        if (set == null) {
            MTCommonLog.e(TAG, "addTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            MTCommonLog.e(TAG, "addTags tags can't be empty, please check it");
        } else {
            addTag(context, i, (String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void checkTagBindState(Context context, int i, String str) {
        queryTag(context.getApplicationContext(), i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void cleanTags(Context context, int i) {
        deleteAllTag(context.getApplicationContext(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearAlias(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "clearAlias context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_CLEAR, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void clearAllNotifications(Context context) {
        clearNotification(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearNotification(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "clearNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Notification.KEY_NOTIFY_ID, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void clearNotificationById(Context context, int i) {
        clearNotification(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configOldPushVersion(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "init context can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            SDK_VERSION_CODE = 396;
            SDK_VERSION_NAME = "3.9.6";
            MTCommonLog.d(TAG, "configOldPushVersion " + SDK_VERSION_NAME);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void deleteAlias(Context context, int i) {
        clearAlias(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void deleteAllTag(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "deleteAllTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "deleteAllTag sequence can't be 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_DELETE_ALL, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void deleteGeofence(Context context, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "deleteGeofence context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "deleteGeofence geofenceId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.DELETE_GEOFENCE, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void deleteTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.e(TAG, "deleteTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "deleteTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.e(TAG, "deleteTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.e(TAG, "deleteTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray("tag", strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_DELETE, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void deleteTags(Context context, int i, Set<String> set) {
        if (set == null) {
            MTCommonLog.e(TAG, "deleteTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            MTCommonLog.e(TAG, "deleteTags tags can't be empty, please check it");
        } else {
            deleteTag(context, i, (String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void getAlias(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "getAlias context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_GET, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void getAllTags(Context context, int i) {
        queryAllTag(context.getApplicationContext(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static String getRegistrationID(Context context) {
        return MTCorePrivatesApi.getRegistrationId(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void goToAppNotificationSettings(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "goToAppNotificationSettings context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationUtil.goToAppNotificationSettings(context.getApplicationContext());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(Context context) {
        MTCommonLog.d(TAG, "MTPushPrivatesApi.init 4.3.9");
        if (context == null) {
            MTCommonLog.e(TAG, "init context can't be null, please check it");
            return;
        }
        MTCommonLog.d(TAG, "init setAddress");
        if (!MTGlobal.isMainProcess(context.getApplicationContext()) && !MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCommonLog.e(TAG, "Please call the MTPushPrivatesApi.init function in the main process or the push process");
            return;
        }
        MTCommonPrivatesApi.init(context.getApplicationContext(), true);
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTCore());
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTPush());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void queryAllTag(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "queryAllTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "queryAllTag sequence can't be 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_QUERY_ALL, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void queryTag(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "queryTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "queryTag sequence can't be 0, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "queryTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString("tag", str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_QUERY, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reportNotificationArrived(Context context, String str, byte b, String str2) {
        if (context == null) {
            MTCommonLog.e(TAG, "reportNotificationArrived context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "reportNotificationArrived messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reportNotificationClicked(Context context, String str, byte b, String str2) {
        if (context == null) {
            MTCommonLog.e(TAG, "reportNotificationClicked context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "reportNotificationClicked messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reportNotificationDeleted(Context context, String str, byte b, String str2) {
        if (context == null) {
            MTCommonLog.e(TAG, "reportNotificationDeleted context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "reportNotificationDeleted messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reportNotificationOpened(Context context, String str, byte b, String str2) {
        if (context == null) {
            MTCommonLog.e(TAG, "reportNotificationOpened context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "reportNotificationOpened messageId can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void reportThirdToken(Context context, String str, byte b, String str2) {
        uploadPlatformToken(context.getApplicationContext(), b, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetNotificationBadge(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "resetNotificationBadge context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetNotificationCount(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "resetNotificationCount context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetNotificationLayout(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "resetNotificationLayout context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetNotificationShowTime(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "resetNotificationShowTime context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetNotificationSilenceTime(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "resetNotificationSilenceTime context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void resumePush(Context context) {
        turnOnPush(context.getApplicationContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setAlias(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "setAlias context can't be null, please check it");
            return;
        }
        if (str == null) {
            MTCommonLog.e(TAG, "setAlias alias can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString(MTPushConstants.Operation.KEY_ALIAS, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ALIAS_SET, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setBadgeNumber(Context context, int i) {
        setNotificationBadge(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setDefaultNotifactionNumber(Context context) {
        resetNotificationCount(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setGeofenceCount(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "setGeofenceCount context can't be null, please check it");
            return;
        }
        if (i <= 0 || i >= 100) {
            MTCommonLog.e(TAG, "setGeofenceCount count must between 0~100, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("count", i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_GEOFENCE_COUNT, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setGeofenceInterval(Context context, long j) {
        if (context == null) {
            MTCommonLog.e(TAG, "setGeofenceInterval context can't be null, please check it");
            return;
        }
        if (j < 180000 || j > CalendarModelKt.MillisecondsIn24Hours) {
            MTCommonLog.e(TAG, "setGeofenceInterval interval must between 3 * 60 * 1000 ~ 24 * 60 * 60 * 1000, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putLong("interval", j);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_GEOFENCE_INTERVAL, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setLatestNotificationNumber(Context context, int i) {
        setNotificationCount(context.getApplicationContext(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setMaxGeofenceNumber(Context context, int i) {
        setGeofenceCount(context.getApplicationContext(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setMobileNumber(Context context, int i, String str) {
        uploadMobileNumber(context, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNotificationBadge(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "setNotificationBadge context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationBadge.KEY_BADGE, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNotificationCount(Context context, int i) {
        if (context == null) {
            MTCommonLog.e(TAG, "setNotificationCount context can't be null, please check it");
            return;
        }
        if (i < 0) {
            MTCommonLog.e(TAG, "setNotificationCount count can't small than 0, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "setNotificationCount count can't equal with 0, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationCount.KEY_COUNT, i);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNotificationLayout(Context context, int i, NotificationLayout notificationLayout) {
        if (context == null) {
            MTCommonLog.e(TAG, "setNotificationLayout context can't be null, please check it");
            return;
        }
        if (notificationLayout == null) {
            MTCommonLog.e(TAG, "setNotificationLayout notificationLayout can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i);
            bundle.putParcelable(MTPushConstants.NotificationLayout.KEY_NOTIFICATION_LAYOUT, notificationLayout);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNotificationShowTime(Context context, int i, int i2, int... iArr) {
        if (context == null) {
            MTCommonLog.e(TAG, "setNotificationShowTime context can't be null, please check it");
            return;
        }
        if (i < 0 || i > 23) {
            MTCommonLog.e(TAG, "setNotificationShowTime beginHour must between 0~23, please check it");
            return;
        }
        if (i2 < 0 || i2 > 23) {
            MTCommonLog.e(TAG, "setNotificationShowTime endHour must between 0~23, please check it");
            return;
        }
        if (i > i2) {
            MTCommonLog.e(TAG, "setNotificationShowTime beginHour can't large than endHour, please check it");
            return;
        }
        if (i == i2) {
            MTCommonLog.e(TAG, "setNotificationShowTime beginHour can't equal with endHour, please check it");
            return;
        }
        if (iArr.length > 7) {
            MTCommonLog.e(TAG, "setNotificationShowTime weekDays.length must between 0~7, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR, i);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_HOUR, i2);
            bundle.putIntArray(MTPushConstants.NotificationTime.KEY_DAYS, iArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNotificationSilenceTime(Context context, int i, int i2, int i3, int i4) {
        if (context == null) {
            MTCommonLog.e(TAG, "setNotificationSilenceTime context can't be null, please check it");
            return;
        }
        if (i < 0 || i > 23) {
            MTCommonLog.e(TAG, "setNotificationSilenceTime beginHour must between 0~23, please check it");
            return;
        }
        if (i2 < 0 || i2 > 59) {
            MTCommonLog.e(TAG, "setNotificationSilenceTime beginMinute must between 0~59, please check it");
            return;
        }
        if (i3 < 0 || i3 > 23) {
            MTCommonLog.e(TAG, "setNotificationSilenceTime endHour must between 0~23, please check it");
            return;
        }
        if (i4 < 0 || i4 > 59) {
            MTCommonLog.e(TAG, "setNotificationSilenceTime endMinute must between 0~59, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR, i);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_BEGIN_MINUTE, i2);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_HOUR, i3);
            bundle.putInt(MTPushConstants.NotificationTime.KEY_END_MINUTE, i4);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setPushTime(Context context, Set<Integer> set, int i, int i2) {
        if (set == null) {
            resetNotificationShowTime(context);
            return;
        }
        if (set.isEmpty()) {
            setNotificationShowTime(context.getApplicationContext(), i, i2, new int[0]);
            return;
        }
        int size = set.size();
        int[] iArr = new int[size];
        Integer[] numArr = new Integer[set.size()];
        set.toArray(numArr);
        System.arraycopy(numArr, 0, iArr, 0, size);
        setNotificationShowTime(context.getApplicationContext(), i, i2, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setSilenceTime(Context context, int i, int i2, int i3, int i4) {
        setNotificationSilenceTime(context.getApplicationContext(), i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setTags(Context context, int i, Set<String> set) {
        if (set == null) {
            MTCommonLog.e(TAG, "setTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            MTCommonLog.e(TAG, "setTags tags can't be empty, please check it");
        } else {
            updateTag(context, i, (String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setThirdConfig(Bundle bundle) {
        f0.b().a(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showNotification(Context context, NotificationMessage notificationMessage) {
        if (context == null) {
            MTCommonLog.e(TAG, "showNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", notificationMessage);
            bundle.putBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, false);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.SHOW_NOTIFICATION, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void stopPush(Context context) {
        turnOffPush(context.getApplicationContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void turnOffGeofenceSwitch(Context context) {
        if (context == null) {
            MTCommonLog.e("MTCommonPrivatesApi", "turnOffGeofenceSwitch context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_OFF_GEOFENCESWITCH, null);
        } else {
            MTCommonLog.e("MTCommonPrivatesApi", "turnOffGeofenceSwitch should be called in main process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void turnOffPush(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "turnOffPush context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_OFF_PUSH, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void turnOnGeofenceSwitch(Context context) {
        if (context == null) {
            MTCommonLog.e("MTCommonPrivatesApi", "turnOnGeofenceSwitch context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_ON_GEOFENCESWITCH, null);
        } else {
            MTCommonLog.e("MTCommonPrivatesApi", "turnOnGeofenceSwitch should be called in main process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void turnOnPush(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "turnOnPush context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TURN_ON_PUSH, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void updateTag(Context context, int i, String... strArr) {
        if (context == null) {
            MTCommonLog.e(TAG, "updateTag context can't be null, please check it");
            return;
        }
        if (i == 0) {
            MTCommonLog.e(TAG, "updateTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            MTCommonLog.e(TAG, "updateTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            MTCommonLog.e(TAG, "updateTag tag can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putStringArray("tag", strArr);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.TAG_UPDATE, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void uploadMobileNumber(Context context, int i, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "uploadMobileNumber context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "uploadMobileNumber mobileNumber can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(MTPushConstants.Operation.KEY_SEQUENCE, i);
            bundle.putString(MTPushConstants.Operation.KEY_MOBILE_NUMBER, str);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_MOBILE_NUMBER, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void uploadPlatformToken(Context context, byte b, String str, String str2) {
        if (context == null) {
            MTCommonLog.e(TAG, "onPlatformToken context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            PlatformTokenMessage region = new PlatformTokenMessage().setPlatform(b).setToken(str).setRegion(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", region);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, bundle);
        }
    }

    public static void clearNotification(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "clearNotification context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION, null);
        }
    }

    @Deprecated
    public static void reportNotificationArrived(Context context, String str, byte b) {
        reportNotificationArrived(context, str, b, "");
    }

    @Deprecated
    public static void reportNotificationOpened(Context context, String str, byte b) {
        reportNotificationOpened(context, str, b, "");
    }
}
