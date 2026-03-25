package com.engagelab.privates.common;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.component.TransferCheck;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.business.message.platform.JDataUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.utils.MsgToJson;
import com.engagelab.privates.push.utils.NotificationChannelUtil;
import com.engagelab.privates.push.utils.NotificationUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends b0 {
    public static ConcurrentHashMap<String, Integer> b = new ConcurrentHashMap<>();
    public static volatile d0 c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.b0
    public void a(Context context, Bundle bundle) {
        String str;
        NotificationMessage badge;
        try {
            String string = bundle.getString("message");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            String messageId = NotificationUtil.getMessageId(jSONObject);
            if (TextUtils.isEmpty(messageId)) {
                MTCommonLog.d("MTNotificationBusiness", "notificationMessage's messageId is null, can't show this notification");
                return;
            }
            String strOptString = jSONObject.optString("override_msg_id");
            int notificationId = TextUtils.isEmpty(strOptString) ? NotificationUtil.getNotificationId(messageId) : NotificationUtil.getNotificationId(strOptString);
            int iOptInt = jSONObject.optInt("n_builder_id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("m_content");
            if (jSONObjectOptJSONObject == null) {
                MTCommonLog.d("MTNotificationBusiness", "onMessage failed, can't parse content");
                return;
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("n_title");
            String strOptString3 = jSONObjectOptJSONObject.optString("n_content");
            Bundle bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObjectOptJSONObject.optJSONObject("n_extras"));
            String strOptString4 = jSONObjectOptJSONObject.optString("n_small_icon");
            String strOptString5 = jSONObjectOptJSONObject.optString("n_large_icon");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("n_alert_type", -1);
            int priority = NotificationUtil.getPriority(jSONObjectOptJSONObject);
            str = "MTNotificationBusiness";
            try {
                int notificationImportance = NotificationUtil.getNotificationImportance(jSONObjectOptJSONObject);
                String strOptString6 = jSONObjectOptJSONObject.optString("n_category");
                int iOptInt3 = jSONObjectOptJSONObject.optInt("n_style");
                String strOptString7 = jSONObjectOptJSONObject.optString("n_big_text");
                String strOptString8 = jSONObjectOptJSONObject.optString("n_big_pic_path");
                String[] strArrConvertJsonToArray = NotificationUtil.convertJsonToArray(jSONObjectOptJSONObject.optString("n_inbox"));
                badge = new NotificationMessage().setMessageId(messageId).setOverrideMessageId(strOptString).setPlatform((byte) 0).setNotificationId(notificationId).setSmallIcon(strOptString4).setLargeIcon(strOptString5).setTitle(strOptString2).setContent(strOptString3).setBuilderId(iOptInt).setExtras(bundleConvertJsonToBundle).setStyle(iOptInt3).setBigText(strOptString7).setInbox(strArrConvertJsonToArray).setBigPicture(strOptString8).setDefaults(iOptInt2).setPriority(priority).setImportance(notificationImportance).setCategory(strOptString6).setSound(jSONObjectOptJSONObject.optString("n_sound")).setChannelId(jSONObjectOptJSONObject.optString("n_channel_id")).setIntentUri(jSONObjectOptJSONObject.optString("intent_uri")).setIntentSsl(jSONObjectOptJSONObject.optString("intent_ssl")).setBadge(jSONObjectOptJSONObject.optInt("n_badge_add_num"));
            } catch (Throwable th) {
                th = th;
            }
            try {
                a(context, badge, bundle.getBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, true));
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("message", badge);
                MTCommonPrivatesApi.sendMessageToMainProcess(context, 3002, bundle2);
            } catch (Throwable th2) {
                th = th2;
                MTCommonLog.d(str, "onMessage failed " + th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            str = "MTNotificationBusiness";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Context context, Bundle bundle) {
        try {
            String string = bundle.getString(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            MTCommonLog.d("MTNotificationBusiness", "revokeMessage:" + MTCommonLog.toLogString(jSONObject));
            String strOptString = jSONObject.optString("ids");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            String[] strArrSplit = strOptString.split(",");
            if (strArrSplit.length == 1) {
                String str = strArrSplit[0];
                a(context, str, str);
            } else if (strArrSplit.length == 2) {
                a(context, strArrSplit[0], strArrSplit[1]);
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "revokeMessage failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(Context context, Bundle bundle) {
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage == null) {
                return;
            }
            JDataUtils.addJDataPlatformMessageID(notificationMessage.getPlatformMessageId(), JDataUtils.getJDataFromBundle(bundle));
            a(context, notificationMessage, bundle.getBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, true));
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "showNotification failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static d0 b() {
        if (c == null) {
            synchronized (d0.class) {
                c = new d0();
            }
        }
        return c;
    }

    public void b(Context context, Bundle bundle) {
        if (bundle != null) {
            a(context, bundle.getInt(MTPushConstants.Notification.KEY_NOTIFY_ID));
            return;
        }
        if (b.isEmpty()) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        for (Map.Entry<String, Integer> entry : b.entrySet()) {
            notificationManager.cancel(entry.getValue().intValue());
            MTCommonLog.d("MTNotificationBusiness", "clear notification which messageId:" + entry.getKey() + ", notificationId:" + entry.getValue());
        }
        b.clear();
        MTCommonLog.d("MTNotificationBusiness", "current messageMap size " + b.size());
    }

    public final void b(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.setFlags(872415232);
            context.startActivity(launchIntentForPackage);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "launchMainActivity failed " + th.getMessage());
        }
    }

    public void b(Context context, int i, Bundle bundle) {
        String str;
        int i2;
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", notificationMessage.getMessageId());
            if (notificationMessage.getPlatform() != 0) {
                jSONObject.put(HianalyticsBaseData.SDK_TYPE, (int) notificationMessage.getPlatform());
                jSONObject.put("tmsg_id", notificationMessage.getPlatformMessageId());
                str = "third_msg_status";
                i2 = MTPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE;
            } else {
                str = "msg_status";
                i2 = MTPushConstants.MainWhat.REPORT_MESSAGE_STATE;
            }
            switch (i) {
                case MTPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED /* 3995 */:
                    MTCommonLog.d("MTNotificationBusiness", "onNotificationOpened " + notificationMessage.toString());
                    jSONObject.put("result", MTPushConstants.Message.CODE_MESSAGE_OPENED);
                    break;
                case MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED /* 3996 */:
                    MTCommonLog.d("MTNotificationBusiness", "onNotificationDeleted " + notificationMessage.toString());
                    jSONObject.put("result", MTPushConstants.Message.CODE_MESSAGE_DELETED);
                    break;
                case MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED /* 3997 */:
                    MTCommonLog.d("MTNotificationBusiness", "onNotificationClicked " + notificationMessage.toString());
                    jSONObject.put("result", 1000);
                    break;
                case MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
                    MTCommonLog.d("MTNotificationBusiness", "onNotificationArrived " + notificationMessage.toString());
                    jSONObject.put("result", 1018);
                    break;
            }
            String jData = JDataUtils.getJData(bundle, notificationMessage);
            if (!TextUtils.isEmpty(jData)) {
                jSONObject.put("_j_data_", jData);
            }
            MTReporter content = new MTReporter().setType(str).setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString(MTPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, i2, bundle3);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "processRemoteMessage failed " + th.getMessage());
        }
    }

    public final void a(Context context, NotificationMessage notificationMessage, boolean z) {
        Notification.Builder builder;
        int i = Build.VERSION.SDK_INT;
        MTCommonLog.d("MTNotificationBusiness", "showNotification " + notificationMessage.toString());
        byte platform = notificationMessage.getPlatform();
        String messageId = notificationMessage.getMessageId();
        String overrideMessageId = notificationMessage.getOverrideMessageId();
        if (!z || a(context, platform, messageId, overrideMessageId)) {
            if (!z.a().c(context)) {
                MTCommonLog.w("MTNotificationBusiness", "is not notificationShowTime, notificationShowTime:" + l0.g(context));
                return;
            }
            if (TextUtils.isEmpty(notificationMessage.getContent())) {
                MTCommonLog.w("MTNotificationBusiness", "notificationMessage's content is null, can't show this notification " + notificationMessage.toString());
                return;
            }
            boolean zD = z.a().d(context);
            if (i >= 26) {
                d0$$ExternalSyntheticApiModelOutline1.m();
                builder = d0$$ExternalSyntheticApiModelOutline0.m(context, NotificationChannelUtil.getChannel(context, zD, notificationMessage));
            } else {
                builder = new Notification.Builder(context);
            }
            builder.setAutoCancel(true);
            builder.setWhen(System.currentTimeMillis());
            String title = NotificationUtil.getTitle(context, notificationMessage);
            builder.setContentTitle(title);
            notificationMessage.setTitle(title);
            String content = NotificationUtil.getContent(context, notificationMessage);
            builder.setContentText(NotificationUtil.getContent(context, notificationMessage));
            notificationMessage.setContent(content);
            int defaults = NotificationUtil.getDefaults(context, zD, notificationMessage);
            builder.setDefaults(defaults);
            notificationMessage.setDefaults(defaults);
            builder.setContentIntent(NotificationUtil.getPendingIntent(context, String.valueOf(3003), notificationMessage));
            builder.setDeleteIntent(NotificationUtil.getPendingIntent(context, String.valueOf(3004), notificationMessage));
            int smallIcon = NotificationUtil.getSmallIcon(context);
            if (smallIcon > 0) {
                builder.setSmallIcon(smallIcon);
            }
            Bitmap largeIcon = NotificationUtil.getLargeIcon(context, notificationMessage.getLargeIcon());
            if (largeIcon != null) {
                builder.setLargeIcon(largeIcon);
            }
            Uri soundUri = NotificationUtil.getSoundUri(context, zD, notificationMessage);
            if (soundUri != null) {
                builder.setSound(soundUri);
            }
            RemoteViews notificationLayout = NotificationUtil.getNotificationLayout(context, notificationMessage);
            if (notificationLayout != null) {
                builder.setContent(notificationLayout);
            }
            builder.setPriority(NotificationUtil.getPriority(context, zD, notificationMessage));
            builder.setStyle(NotificationUtil.getStyle(context, notificationMessage));
            builder.setVisibility(NotificationUtil.getVisibility(context, zD, notificationMessage));
            if (!TextUtils.isEmpty(notificationMessage.getCategory())) {
                builder.setCategory(notificationMessage.getCategory());
            }
            Icon smallIcon2 = NotificationUtil.getSmallIcon(context, notificationMessage);
            if (smallIcon2 != null) {
                builder.setSmallIcon(smallIcon2);
            }
            builder.setShowWhen(true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            int iB = z.a().b(context);
            if (b.size() >= iB) {
                Object[] array = b.keySet().toArray();
                Arrays.sort(array);
                for (Object obj : array) {
                    Integer num = b.get(obj);
                    MTCommonLog.d("MTNotificationBusiness", "currentNotificationCount is " + b.size() + ", limit notificationCount [" + iB + "], need remove messageId[" + obj + "]:notificationId[" + num + "]");
                    notificationManager.cancel(num.intValue());
                    b.remove(obj);
                    if (b.size() < iB) {
                        break;
                    }
                }
            }
            b.put(notificationMessage.getMessageId(), Integer.valueOf(notificationMessage.getNotificationId()));
            MTCommonLog.d("MTNotificationBusiness", "after add, current messageMap size " + b.size());
            Notification notificationBuild = builder.build();
            NotificationUtil.setNotificationBadge(context, notificationBuild, notificationMessage.getBadge());
            notificationManager.notify(notificationMessage.getNotificationId(), notificationBuild);
            MTCommonLog.d("MTNotificationBusiness", "showNotification notificationId:" + notificationMessage.getNotificationId());
        }
    }

    public final void b(Context context, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        MTCommonLog.d("MTNotificationBusiness", "addRevokeMessageId " + str);
        l0.b(context, set);
    }

    public final void b(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", str);
            jSONObject.put("result", MTPushConstants.Message.CODE_MESSAGE_REVOKE);
            MTReporter content = new MTReporter().setType("msg_status").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MTPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.REPORT_MESSAGE_STATE, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "reportRevokeMessage failed " + th.getMessage());
        }
    }

    public final void a(Context context) {
        try {
            if (MTGlobal.getLifecycleState()) {
                MTCommonLog.d("MTNotificationBusiness", "pushSdkVersionName:" + MTPushPrivatesApi.SDK_VERSION_NAME + ", isForeground, no need launch");
                return;
            }
            MTCommonLog.d("MTNotificationBusiness", "pushSdkVersionName:" + MTPushPrivatesApi.SDK_VERSION_NAME + ", isBackground, need launch");
            String currentActivityName = MTGlobal.getCurrentActivityName();
            if (!TextUtils.isEmpty(currentActivityName)) {
                a(context, currentActivityName);
            } else {
                b(context);
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "launch failed " + th.getMessage());
        }
    }

    public final void a(Context context, NotificationMessage notificationMessage) {
        try {
            String intentUri = notificationMessage.getIntentUri();
            if (TextUtils.isEmpty(intentUri)) {
                MTCommonLog.d("MTNotificationBusiness", "pushSdkVersionName:" + MTPushPrivatesApi.SDK_VERSION_NAME + ", there is no intentUri, no need transfer");
                a(context);
                return;
            }
            MTCommonLog.d("MTNotificationBusiness", "pushSdkVersionName:" + MTPushPrivatesApi.SDK_VERSION_NAME + ", there is intentUri, need transfer");
            Intent intentA = a(intentUri);
            intentA.addFlags(335544320);
            Bundle bundle = new Bundle();
            bundle.putString(MTPushConstants.Message.KEY_MESSAGE_JSON, MsgToJson.notificationMessageToJson(notificationMessage));
            intentA.putExtras(bundle);
            if (TextUtils.isEmpty(intentA.getPackage())) {
                intentA.setPackage(context.getPackageName());
            }
            context.startActivity(intentA);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "transfer failed " + th.getMessage());
        }
    }

    public final Intent a(String str) throws URISyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Intent uri = Intent.parseUri(str, 4);
        Intent intent = new Intent(uri);
        uri.addCategory("android.intent.category.BROWSABLE");
        uri.setComponent(null);
        uri.setSelector(null);
        return intent;
    }

    public final void a(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), str);
            intent.setFlags(872415232);
            context.startActivity(intent);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "launchCurrentActivity failed " + th.getMessage());
        }
    }

    public void a(Context context, int i, Bundle bundle) {
        MTCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
                return;
            }
            switch (i) {
                case 3002:
                    commonReceiver.onNotificationArrived(context, notificationMessage);
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, bundle);
                    break;
                case 3003:
                    MTCommonLog.w("MTNotificationBusiness", "on_notification_clicked");
                    String intentUri = notificationMessage.getIntentUri();
                    if (TransferCheck.isAllowTransfer(context, intentUri, notificationMessage.getIntentSsl())) {
                        MTCommonLog.d("MTNotificationBusiness", "allow transfer to " + intentUri);
                        if (MTPushPrivatesApi.SDK_VERSION_NAME.startsWith("3")) {
                            if (notificationMessage.getPlatform() == 0) {
                                a(context);
                            }
                            if (notificationMessage.getPlatform() == 8) {
                                a(context, notificationMessage);
                            }
                        } else {
                            a(context, notificationMessage);
                        }
                    } else {
                        MTCommonLog.d("MTNotificationBusiness", "prevent transfer to " + intentUri);
                    }
                    commonReceiver.onNotificationClicked(context, notificationMessage);
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED, bundle);
                    break;
                case 3004:
                    commonReceiver.onNotificationDeleted(context, notificationMessage);
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED, bundle);
                    break;
                case 3005:
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED, bundle);
                    break;
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "processMainMessage failed " + th.getMessage());
        }
    }

    public final void a(Context context, String str, String str2) {
        MTCommonLog.d("MTNotificationBusiness", "revokeNotification reportMessageId:" + str + ",revokeMessageId:" + str2);
        b(context, str2, l0.j(context));
        int notificationId = NotificationUtil.getNotificationId(str2);
        Set<String> setA = l0.a(context, (byte) 0);
        if (setA != null && setA.contains(str)) {
            if (!a(context, notificationId, true)) {
                MTCommonLog.d("MTNotificationBusiness", "the message [" + str2 + "] is not showing");
                return;
            }
            a(context, notificationId);
            b(context, str);
            return;
        }
        MTCommonLog.d("MTNotificationBusiness", "there are no messageId [" + str + "] in cache messageIdSet");
        Set<String> setA2 = l0.a(context, (byte) 8);
        if (setA2 != null && setA2.contains(str)) {
            if (!a(context, notificationId, true)) {
                MTCommonLog.d("MTNotificationBusiness", "the message [" + str2 + "] is not showing");
                return;
            }
            a(context, notificationId);
            a(context, str, (byte) 8, "");
            return;
        }
        MTCommonLog.d("MTNotificationBusiness", "there are no messageId [" + str + "] in cache googleMessageIdSet");
        StringBuilder sb = new StringBuilder();
        sb.append("revoke third message ");
        sb.append(str);
        MTCommonLog.d("MTNotificationBusiness", sb.toString());
        Bundle bundle = new Bundle();
        bundle.putInt(MTPushConstants.Message.KEY_NOTIFICATION_ID, notificationId);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.CLEAR_PLATFORM_NOTIFICATION, bundle);
    }

    public final void a(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        MTCommonLog.d("MTNotificationBusiness", "cancel notificationId:" + i);
        notificationManager.cancel(i);
        a(i);
    }

    public void a(int i) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = b;
        if (concurrentHashMap == null) {
            MTCommonLog.d("MTNotificationBusiness", "there are no aurora notification");
            return;
        }
        if (!concurrentHashMap.containsValue(Integer.valueOf(i))) {
            MTCommonLog.d("MTNotificationBusiness", "there are no aurora notification " + i);
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().getValue().intValue() == i) {
                it.remove();
                break;
            }
        }
        MTCommonLog.d("MTNotificationBusiness", "after remove, current messageMap size " + b.size());
    }

    public final boolean a(Context context, int i, boolean z) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).getActiveNotifications()) {
            MTCommonLog.d("MTNotificationBusiness", "statusBarNotification:" + statusBarNotification.getId());
            if (statusBarNotification.getId() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Context context, byte b2, String str, String str2) {
        Set<String> setA = l0.a(context, b2);
        if (setA != null && !setA.isEmpty() && !TextUtils.isEmpty(str) && setA.contains(str)) {
            MTCommonLog.d("MTNotificationBusiness", "the message [" + str + "] had been show");
            return false;
        }
        Set<String> setI = l0.i(context);
        if (setI != null && !setI.isEmpty() && !TextUtils.isEmpty(str) && str2.contains(str)) {
            MTCommonLog.d("MTNotificationBusiness", "the message [" + str + "] had been override");
            return false;
        }
        Set<String> setJ = l0.j(context);
        if (setJ != null && !setJ.isEmpty() && !TextUtils.isEmpty(str) && setJ.contains(str)) {
            MTCommonLog.d("MTNotificationBusiness", "the message [" + str + "] had been revoke");
            b(context, str);
            return false;
        }
        if (setA != null && !setA.isEmpty() && !TextUtils.isEmpty(str2) && setA.contains(str2)) {
            MTCommonLog.d("MTNotificationBusiness", "the overrideMessage [" + str2 + "] had been show");
            if (!a(context, NotificationUtil.getNotificationId(str2), true)) {
                return false;
            }
            MTCommonLog.d("MTNotificationBusiness", "the overrideMessage [" + str2 + "] is showing, need override");
            a(context, b2, str, setA);
            a(context, str2, setI);
            return true;
        }
        a(context, b2, str, setA);
        a(context, str2, setI);
        return true;
    }

    public final void a(Context context, byte b2, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        MTCommonLog.d("MTNotificationBusiness", "addMessageId " + str);
        l0.a(context, b2, set);
    }

    public final void a(Context context, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        MTCommonLog.d("MTNotificationBusiness", "addOverrideMessageId " + str);
        l0.a(context, set);
    }

    public final void a(Context context, String str, byte b2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", str);
            jSONObject.put(HianalyticsBaseData.SDK_TYPE, (int) b2);
            jSONObject.put("tmsg_id", str2);
            jSONObject.put("result", MTPushConstants.Message.CODE_REVOKE_PLATFORM_MESSAGE);
            MTReporter content = new MTReporter().setType("third_msg_status").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MTPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTNotificationBusiness", "reportRevokeMessage failed " + th.getMessage());
        }
    }
}
