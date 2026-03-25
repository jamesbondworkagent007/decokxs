package com.engagelab.privates.push.utils;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.engagelab.privates.common.component.MTCommonActivity;
import com.engagelab.privates.common.l0;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.z;
import com.engagelab.privates.push.api.NotificationLayout;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.Adler32;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationUtil {
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String NOTIFICATION_ICON = "mtpush_notification_icon";
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String TAG = "NotificationUtil";

    /* JADX INFO: loaded from: classes17.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, String> f353a = new HashMap();
        public static final Map<String, Integer> b = new HashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            a();
            b();
        }

        public static int a(int i) {
            if (i == 0 || i == 1) {
                return -2;
            }
            if (i != 2) {
                return (i == 4 || i == 5) ? 1 : 0;
            }
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static void b() {
            Map<String, Integer> map = b;
            map.put(NotificationCompat.CATEGORY_PROMO, 1);
            map.put(NotificationCompat.CATEGORY_RECOMMENDATION, 1);
            map.put(NotificationCompat.CATEGORY_SOCIAL, 1);
            map.put(NotificationCompat.CATEGORY_CALL, 3);
            map.put("email", 3);
            map.put("msg", 3);
            map.put(NotificationCompat.CATEGORY_NAVIGATION, 3);
            map.put(NotificationCompat.CATEGORY_REMINDER, 3);
            map.put("service", 3);
            map.put(NotificationCompat.CATEGORY_ALARM, 3);
            map.put(NotificationCompat.CATEGORY_STOPWATCH, 3);
            map.put("progress", 3);
            map.put(NotificationCompat.CATEGORY_LOCATION_SHARING, 3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static int c(JSONObject jSONObject) {
            int iA;
            int iOptInt = jSONObject.optInt("n_priority", 0);
            int iB = b(jSONObject);
            return (-1 != iB && iOptInt > (iA = a(iB))) ? iA : iOptInt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public static void a() {
            Map<String, String> map = f353a;
            map.put("google", "fc");
            map.put(MTPushConstants.Manufacturer.HUAWEI, "hw");
            map.put(MTPushConstants.Manufacturer.HONOR, "hn");
            map.put(MTPushConstants.Manufacturer.MEIZU, "mz");
            map.put(MTPushConstants.Manufacturer.VIVO, "vi");
            map.put(MTPushConstants.Manufacturer.OPPO, "op");
            map.put(MTPushConstants.Manufacturer.REALME, "op");
            map.put(MTPushConstants.Manufacturer.ONEPLUS, "op");
            map.put(MTPushConstants.Manufacturer.XIAOMI, "xm");
            map.put(MTPushConstants.Manufacturer.BLACKSHARK, "xm");
        }

        public static int a(JSONObject jSONObject, int i) {
            Integer num;
            String strOptString = jSONObject.optString("n_category");
            return (TextUtils.isEmpty(strOptString) || (num = b.get(strOptString)) == null) ? i : num.intValue();
        }

        public static int b(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("n_importance");
            if (jSONObjectOptJSONObject != null) {
                String str = Build.MANUFACTURER;
                if (str == null) {
                    return a(jSONObject, -1);
                }
                String str2 = f353a.get(str.toLowerCase());
                if (str2 != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt(str2, -1);
                    MTCommonLog.d(NotificationUtil.TAG, "im_v:" + iOptInt);
                    return iOptInt;
                }
            }
            return a(jSONObject, -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] convertJsonToArray(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String[] strArr = new String[jSONObject.length()];
            int i = 0;
            while (itKeys.hasNext()) {
                strArr[i] = jSONObject.optString(itKeys.next());
                i++;
            }
            return strArr;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "convertJsonToArray failed " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle convertJsonToBundle(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return null;
            }
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
            return bundle;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "convertJsonToBundle failed " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bundle convertMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getContent(Context context, NotificationMessage notificationMessage) {
        return TextUtils.isEmpty(notificationMessage.getContent()) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : notificationMessage.getContent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getDefaults(Context context, boolean z, NotificationMessage notificationMessage) {
        if (z) {
            return (notificationMessage.getDefaults() & 1) == 0 ? notificationMessage.getDefaults() : notificationMessage.getDefaults() - 1;
        }
        switch (notificationMessage.getDefaults()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return notificationMessage.getDefaults();
            default:
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap getLargeIcon(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getPictureBitmap(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getLaunchActivityClassName(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                return launchIntentForPackage.getComponent().getClassName();
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(context.getPackageName());
            intent.addCategory("android.intent.category.LAUNCHER");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                resolveInfoResolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0);
            }
            return resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.name : "";
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getLaunchActivityClassName failed " + th.getMessage());
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMessageId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("ad_id");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObject.optString("msg_id");
        }
        return TextUtils.isEmpty(strOptString) ? jSONObject.optString("_jmsgid_") : strOptString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getNotificationId(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            MTCommonLog.d(TAG, "the messageId [" + str + "] will convert to adler32");
            try {
                Adler32 adler32 = new Adler32();
                adler32.update(str.getBytes());
                int value = (int) adler32.getValue();
                return value < 0 ? Math.abs(value) : value;
            } catch (Throwable th) {
                MTCommonLog.w(TAG, "getNotificationId failed " + th.getMessage());
                return 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getNotificationImportance(JSONObject jSONObject) throws Throwable {
        return a.b(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteViews getNotificationLayout(Context context, NotificationMessage notificationMessage) {
        try {
            NotificationLayout notificationLayoutA = z.a().a(context, notificationMessage.getBuilderId());
            if (notificationLayoutA == null) {
                MTCommonLog.d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout is null");
                return null;
            }
            MTCommonLog.d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout:" + notificationLayoutA.toString());
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), notificationLayoutA.getLayoutId());
            if (notificationLayoutA.getIconViewId() > 0) {
                remoteViews.setImageViewResource(notificationLayoutA.getIconViewId(), getSmallIcon(context));
                Icon smallIcon = getSmallIcon(context, notificationMessage);
                if (smallIcon != null) {
                    remoteViews.setImageViewIcon(notificationLayoutA.getIconViewId(), smallIcon);
                }
            }
            if (notificationLayoutA.getTitleViewId() > 0) {
                remoteViews.setTextViewText(notificationLayoutA.getTitleViewId(), getTitle(context, notificationMessage));
            }
            if (notificationLayoutA.getContentViewId() > 0) {
                remoteViews.setTextViewText(notificationLayoutA.getContentViewId(), getContent(context, notificationMessage));
            }
            if (notificationLayoutA.getTimeViewId() > 0) {
                remoteViews.setLong(notificationLayoutA.getTimeViewId(), "setTime", System.currentTimeMillis());
            }
            return remoteViews;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getNotificationLayout failed " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap getPictureBitmap(Context context, String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
            }
            byte[] bArr = new HttpUtils().get(context, str);
            if (bArr != null) {
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            MTCommonLog.d(TAG, "getPicture bytes is null");
            return null;
        } catch (Throwable th) {
            try {
                MTCommonLog.w(TAG, "get pictureBitmap failed " + th.getMessage());
                return null;
            } finally {
                Runtime.getRuntime().gc();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getSmallIcon(Context context) {
        int identifier = context.getResources().getIdentifier(NOTIFICATION_ICON, "drawable", context.getPackageName());
        if (identifier > 0) {
            return identifier;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "get getSmallIcon failed " + th.getMessage());
            MTCommonLog.e(TAG, "please put icon [mtpush_notification_icon] in res/drawable");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Uri getSoundUri(Context context, boolean z, NotificationMessage notificationMessage) {
        if (z) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return null;
            }
            if (context.getResources().getIdentifier(notificationMessage.getSound(), "raw", context.getPackageName()) == 0) {
                MTCommonLog.d(TAG, "there are no sound resource");
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + notificationMessage.getSound());
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getSoundUri failed " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getTitle(Context context, NotificationMessage notificationMessage) {
        return TextUtils.isEmpty(notificationMessage.getTitle()) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : notificationMessage.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean setHonorBadge(Context context, int i) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
            if (TextUtils.isEmpty(contentResolver.getType(uri))) {
                uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                if (TextUtils.isEmpty(contentResolver.getType(uri))) {
                    MTCommonLog.e(TAG, " setHonorBadge fail, uri is null");
                    return false;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", getLaunchActivityClassName(context));
            bundle.putInt("badgenumber", i);
            contentResolver.call(uri, "change_badge", (String) null, bundle);
            return true;
        } catch (Throwable th) {
            MTCommonLog.e(TAG, " setHonorBadge wrong error:" + th);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setNotificationBadge(Context context, Notification notification, int i) {
        byte b;
        if (i == 0) {
            return;
        }
        int iA = z.a().a(context);
        int i2 = iA + i;
        l0.b(context, i2);
        MTCommonLog.d(TAG, "setNotificationBadge cacheNotificationBadge[" + iA + "]+currentNotificationBadge[" + i + "]");
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.hashCode();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1206476313) {
            if (iHashCode != -759499589) {
                b = (iHashCode == 99462250 && lowerCase.equals(MTPushConstants.Manufacturer.HONOR)) ? (byte) 2 : (byte) -1;
            } else if (lowerCase.equals(MTPushConstants.Manufacturer.XIAOMI)) {
                b = 1;
            }
        } else if (lowerCase.equals(MTPushConstants.Manufacturer.HUAWEI)) {
            b = 0;
        }
        if (b == 0) {
            setHuaweiBadgeNumber(context, i2);
        } else if (b == 1) {
            setXiaomiBadgeNumber(context, notification, i);
        } else {
            if (b != 2) {
                return;
            }
            setHonorBadge(context, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setXiaomiBadgeNumber(Context context, Notification notification, int i) {
        if (notification == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "setXiaomiBadgeNumber failed " + th.getMessage());
        }
    }

    public static boolean getNotificationState(Context context) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager == null) {
                return false;
            }
            return notificationManager.areNotificationsEnabled();
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getNotificationState failed " + th.getMessage());
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod(CHECK_OP_NO_THROW, cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
            } catch (Throwable th2) {
                MTCommonLog.w(TAG, "getNotificationState failed " + th2.getMessage());
                return false;
            }
        }
    }

    public static boolean goToAppNotificationSettings(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            return true;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "goToAppNotificationSettings failed " + th.getMessage());
            return false;
        }
    }

    public static Notification.BigPictureStyle getBigPictureStyle(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            Bitmap pictureBitmap = getPictureBitmap(context, str);
            if (pictureBitmap == null) {
                return null;
            }
            return bigPictureStyle.bigPicture(pictureBitmap);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "get bigPictureStyle failed " + th.getMessage());
            return null;
        }
    }

    public static Notification.BigTextStyle getBigTextStyle(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Notification.BigTextStyle().bigText(str);
    }

    public static Notification.InboxStyle getInboxStyle(Context context, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            if (strArr.length == 0) {
                return null;
            }
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
            for (String str : strArr) {
                inboxStyle.addLine(str);
            }
            inboxStyle.setSummaryText(" + " + strArr.length + " new messages");
            return inboxStyle;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getInboxStyle failed " + th.getMessage());
            return null;
        }
    }

    public static PendingIntent getPendingIntent(Context context, String str, NotificationMessage notificationMessage) {
        Intent intent = new Intent();
        intent.setClass(context, MTCommonActivity.class);
        intent.setAction(str);
        intent.addFlags(276824064);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", notificationMessage);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(context, notificationMessage.getNotificationId(), intent, 67108864);
    }

    public static Notification.Style getStyle(Context context, NotificationMessage notificationMessage) {
        int style = notificationMessage.getStyle();
        if (style == 1) {
            return getBigTextStyle(context, notificationMessage.getBigText());
        }
        if (style == 2) {
            return getInboxStyle(context, notificationMessage.getInbox());
        }
        if (style != 3) {
            return null;
        }
        return getBigPictureStyle(context, notificationMessage.getBigPicture());
    }

    public static void setHuaweiBadgeNumber(Context context, int i) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            String launchActivityClassName = getLaunchActivityClassName(context);
            if (TextUtils.isEmpty(launchActivityClassName)) {
                return;
            }
            MTCommonLog.d(TAG, "setHuaweiBadgeNumber " + i);
            bundle.putString("class", launchActivityClassName);
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "setHuaweiBadgeNumber failed " + th.getMessage());
        }
    }

    public static int getPriority(Context context, boolean z, NotificationMessage notificationMessage) {
        if (z) {
            return -1;
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1 || priority == 0 || priority == 1 || priority == 2) {
            return notificationMessage.getPriority();
        }
        return 0;
    }

    public static int getVisibility(Context context, boolean z, NotificationMessage notificationMessage) {
        int priority;
        if (z || (priority = notificationMessage.getPriority()) == -2 || priority == -1) {
            return -1;
        }
        return (priority == 1 || priority == 2) ? 1 : 0;
    }

    public static int getPriority(JSONObject jSONObject) throws Throwable {
        return a.c(jSONObject);
    }

    public static Icon getSmallIcon(Context context, NotificationMessage notificationMessage) {
        Bitmap pictureBitmap;
        try {
            if (TextUtils.isEmpty(notificationMessage.getSmallIcon()) || (pictureBitmap = getPictureBitmap(context, notificationMessage.getSmallIcon())) == null) {
                return null;
            }
            return Icon.createWithBitmap(pictureBitmap);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getSmallIcon failed " + th.getMessage());
            return null;
        }
    }
}
