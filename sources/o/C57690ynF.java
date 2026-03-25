package o;

import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat$$ExternalSyntheticApiModelOutline0;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57690ynF {
    public static final Pattern AEQbTJ = Pattern.compile("^([A-Fa-f0-9]{8})$");

    public static int AEQbTJ(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    public static java.lang.String EZpvd(C57745yoH c57745yoH) {
        if (Build.VERSION.SDK_INT < 26) {
            return CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
        }
        android.content.Context contextCopydefault = c57745yoH.copydefault();
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        android.app.NotificationManager notificationManagerKWHzl = C57836ypt.KWHzl(contextCopydefault);
        if (c57745yoH.values()) {
            return KWHzl(notificationManagerKWHzl);
        }
        if (jSONObjectOLrzqt.has("oth_chnl")) {
            java.lang.String strOptString = jSONObjectOLrzqt.optString("oth_chnl");
            if (notificationManagerKWHzl.getNotificationChannel(strOptString) != null) {
                return strOptString;
            }
        }
        if (!jSONObjectOLrzqt.has("chnl")) {
            return AEQbTJ(notificationManagerKWHzl);
        }
        try {
            return copydefault(contextCopydefault, notificationManagerKWHzl, jSONObjectOLrzqt);
        } catch (JSONException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e);
            return CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String copydefault(android.content.Context context, android.app.NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        long[] jArrEZpvd;
        java.lang.Object objOpt = jSONObject.opt("chnl");
        if (objOpt instanceof java.lang.String) {
            jSONObject2 = new JSONObject((java.lang.String) objOpt);
        } else {
            jSONObject2 = (JSONObject) objOpt;
        }
        java.lang.String str = CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
        java.lang.String strOptString = jSONObject2.optString("id", CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL);
        if (!strOptString.equals(NotificationChannelCompat.DEFAULT_CHANNEL_ID)) {
            str = strOptString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("langs");
            java.lang.String strOLrzqt = C57872yqc.AEQbTJ().OLrzqt();
            jSONObjectOptJSONObject = jSONObject3.has(strOLrzqt) ? jSONObject3.optJSONObject(strOLrzqt) : jSONObject2;
        }
        android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(str, jSONObjectOptJSONObject.optString("nm", "Miscellaneous"), AEQbTJ(jSONObject.optInt("pri", 6)));
        notificationChannelM.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
            java.lang.String strOptString2 = jSONObject2.optString("grp_id");
            notificationManager.createNotificationChannelGroup(C57701ynQ.dK_(strOptString2, jSONObjectOptJSONObject.optString("grp_nm")));
            notificationChannelM.setGroup(strOptString2);
        }
        if (jSONObject.has("ledc")) {
            java.lang.String strOptString3 = jSONObject.optString("ledc");
            if (!AEQbTJ.matcher(strOptString3).matches()) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                strOptString3 = "FFFFFFFF";
            }
            try {
                notificationChannelM.setLightColor(new java.math.BigInteger(strOptString3, 16).intValue());
            } catch (java.lang.Throwable th) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        notificationChannelM.enableLights(jSONObject.optInt("led", 1) == 1);
        if (jSONObject.has("vib_pt") && (jArrEZpvd = OSUtils.EZpvd(jSONObject)) != null) {
            notificationChannelM.setVibrationPattern(jArrEZpvd);
        }
        notificationChannelM.enableVibration(jSONObject.optInt("vib", 1) == 1);
        if (jSONObject.has(RemoteMessageConst.Notification.SOUND)) {
            java.lang.String strOptString4 = jSONObject.optString(RemoteMessageConst.Notification.SOUND, null);
            android.net.Uri uriKWHzl = OSUtils.KWHzl(context, strOptString4);
            if (uriKWHzl != null) {
                notificationChannelM.setSound(uriKWHzl, null);
            } else if (AbstractJsonLexerKt.NULL.equals(strOptString4) || "nil".equals(strOptString4)) {
                notificationChannelM.setSound(null, null);
            }
        }
        notificationChannelM.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannelM.setShowBadge(jSONObject.optInt("bdg", 1) == 1);
        notificationChannelM.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.VERBOSE, "Creating notification channel with channel:\n" + notificationChannelM.toString());
        try {
            notificationManager.createNotificationChannel(notificationChannelM);
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static java.lang.String AEQbTJ(android.app.NotificationManager notificationManager) {
        android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, "Miscellaneous", 3);
        notificationChannelM.enableLights(true);
        notificationChannelM.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelM);
        return CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL;
    }

    public static java.lang.String KWHzl(android.app.NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }

    public static void KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable JSONArray jSONArray) {
        java.util.List<android.app.NotificationChannel> listCopydefault;
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        android.app.NotificationManager notificationManagerKWHzl = C57836ypt.KWHzl(context);
        java.util.HashSet hashSet = new java.util.HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                hashSet.add(copydefault(context, notificationManagerKWHzl, jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty() || (listCopydefault = copydefault(notificationManagerKWHzl)) == null) {
            return;
        }
        java.util.Iterator<android.app.NotificationChannel> it = listCopydefault.iterator();
        while (it.hasNext()) {
            java.lang.String id = NotificationChannelGroupCompat$$ExternalSyntheticApiModelOutline0.m(it.next()).getId();
            if (id.startsWith("OS_") && !hashSet.contains(id)) {
                notificationManagerKWHzl.deleteNotificationChannel(id);
            }
        }
    }

    public static java.util.List<android.app.NotificationChannel> copydefault(android.app.NotificationManager notificationManager) {
        try {
            return notificationManager.getNotificationChannels();
        } catch (java.lang.NullPointerException e) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Error when trying to delete notification channel: " + e.getMessage());
            return null;
        } catch (java.lang.RuntimeException e2) {
            if (e2.getCause() instanceof android.os.DeadSystemException) {
                return null;
            }
            throw e2;
        }
    }
}
