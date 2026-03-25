package com.engagelab.privates.common;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.DeviceUtil;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.api.NotificationLayout;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.utils.NotificationUtil;
import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z {
    public static volatile z b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f350a = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b(Context context) {
        return l0.f(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c(Context context) {
        try {
            String strG = l0.g(context);
            if (TextUtils.isEmpty(strG)) {
                return true;
            }
            MTCommonLog.d("MTPushBusiness", "isNotificationShowTime showTime:" + strG);
            String[] strArrSplit = strG.split("_");
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            char[] charArray = str.toCharArray();
            String[] strArrSplit2 = str2.split("\\^");
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(7);
            int i2 = calendar.get(11);
            MTCommonLog.d("MTPushBusiness", "isNotificationShowTime currentHour:" + i2 + ",currentDay:" + i);
            int length = charArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = Integer.parseInt(String.valueOf(charArray[i3]));
                MTCommonLog.d("MTPushBusiness", "settingDay:" + i4);
                if (i != i4 + 1) {
                    break;
                }
                int i5 = Integer.parseInt(strArrSplit2[0]);
                int i6 = Integer.parseInt(strArrSplit2[1]);
                if (i2 >= i5 && i2 <= i6) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "isNotificationShowTime failed " + th.getMessage());
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d(Context context) {
        String strH;
        try {
            strH = l0.h(context);
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "isNotificationSilenceTime failed " + th.getMessage());
        }
        if (TextUtils.isEmpty(strH)) {
            return false;
        }
        MTCommonLog.d("MTPushBusiness", "isNotificationSilenceTime cacheSilenceTime:" + strH);
        JSONObject jSONObject = new JSONObject(strH);
        int iOptInt = jSONObject.optInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR);
        int iOptInt2 = jSONObject.optInt(MTPushConstants.NotificationTime.KEY_BEGIN_MINUTE);
        int iOptInt3 = jSONObject.optInt(MTPushConstants.NotificationTime.KEY_END_HOUR);
        int iOptInt4 = jSONObject.optInt(MTPushConstants.NotificationTime.KEY_END_MINUTE);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        MTCommonLog.d("MTPushBusiness", "isNotificationSilenceTime currentTime:" + i + ":" + i2 + ", silenceTime:" + iOptInt + ":" + iOptInt2 + "-" + iOptInt3 + ":" + iOptInt4);
        if (iOptInt < iOptInt3) {
            if (i > iOptInt && i < iOptInt3) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 1");
                return true;
            }
            if (i == iOptInt && i2 >= iOptInt2) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 2");
                return true;
            }
            if (i != iOptInt3 || i2 > iOptInt4) {
                MTCommonLog.d("MTPushBusiness", "not notificationSilenceTime 1");
                return false;
            }
            MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 3");
            return true;
        }
        if (iOptInt == iOptInt3) {
            if (iOptInt2 < iOptInt4) {
                if (i != iOptInt || i2 < iOptInt2 || i2 > iOptInt4) {
                    MTCommonLog.d("MTPushBusiness", "not notificationSilenceTime 3");
                    return false;
                }
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 7");
                return true;
            }
            if (i != iOptInt) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 4");
                return true;
            }
            if (i2 >= iOptInt2) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 5");
                return true;
            }
            if (i2 <= iOptInt4) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 6");
                return true;
            }
            MTCommonLog.d("MTPushBusiness", "not notificationSilenceTime 2");
            return false;
        }
        if (iOptInt > iOptInt3) {
            if (i > iOptInt && i <= 23) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 8");
                return true;
            }
            if (i >= 0 && i < iOptInt3) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 9");
                return true;
            }
            if (i == iOptInt && i2 >= iOptInt2) {
                MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 10");
                return true;
            }
            if (i != iOptInt3 || i2 > iOptInt4) {
                MTCommonLog.d("MTPushBusiness", "not notificationSilenceTime 4");
                return false;
            }
            MTCommonLog.d("MTPushBusiness", "is notificationSilenceTime 11");
            return true;
        }
        MTCommonLog.d("MTPushBusiness", "not notificationSilenceTime 5");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(Context context, Bundle bundle) {
        try {
            bundle.setClassLoader(NotificationLayout.class.getClassLoader());
            int i = bundle.getInt("id");
            NotificationLayout notificationLayout = (NotificationLayout) bundle.getParcelable(MTPushConstants.NotificationLayout.KEY_NOTIFICATION_LAYOUT);
            MTCommonLog.d("MTPushBusiness", "setNotificationLayout id:" + i + notificationLayout.toString());
            int layoutId = notificationLayout.getLayoutId();
            int iconViewId = notificationLayout.getIconViewId();
            int iconResourceId = notificationLayout.getIconResourceId();
            int titleViewId = notificationLayout.getTitleViewId();
            int contentViewId = notificationLayout.getContentViewId();
            int timeViewId = notificationLayout.getTimeViewId();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_LAYOUT_ID, layoutId);
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_ICON_VIEW_ID, iconViewId);
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_ICON_RESOURCE_ID, iconResourceId);
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_TITLE_VIEW_ID, titleViewId);
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_CONTENT_VIEW_ID, contentViewId);
            jSONObject.put(MTPushConstants.NotificationLayout.KEY_TIME_VIEW_ID, timeViewId);
            l0.a(context, i, jSONObject.toString());
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "setNotificationLayout failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(Context context, Bundle bundle) {
        try {
            MTCommonLog.d("MTPushBusiness", "setNotificationShowTime:" + MTCommonLog.toLogString(bundle));
            int[] intArray = bundle.getIntArray(MTPushConstants.NotificationTime.KEY_DAYS);
            if (intArray.length == 0) {
                MTCommonLog.d("MTPushBusiness", "setNotificationShowTime weekDays.length is 0, can't show notification everyTime");
                l0.c(context, "");
                return;
            }
            int i = bundle.getInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR);
            int i2 = bundle.getInt(MTPushConstants.NotificationTime.KEY_END_HOUR);
            MTCommonLog.d("MTPushBusiness", "setNotificationShowTime startHour:" + i + ",endHour:" + i2 + ",weekDays:" + Arrays.toString(intArray));
            StringBuilder sb = new StringBuilder();
            for (int i3 : intArray) {
                sb.append(Integer.valueOf(i3));
            }
            sb.append("_");
            sb.append(i);
            sb.append("^");
            sb.append(i2);
            if (Pattern.compile("([0-6]{0,7})_((([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3]))|(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])-)+(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])))").matcher(sb).matches()) {
                l0.c(context, sb.toString());
                return;
            }
            MTCommonLog.e("MTPushBusiness", "setNotificationShowTime invalid time format - " + ((Object) sb));
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "setNotificationPushTime failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(Context context, Bundle bundle) {
        try {
            int i = bundle.getInt(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR);
            int i2 = bundle.getInt(MTPushConstants.NotificationTime.KEY_BEGIN_MINUTE);
            int i3 = bundle.getInt(MTPushConstants.NotificationTime.KEY_END_HOUR);
            int i4 = bundle.getInt(MTPushConstants.NotificationTime.KEY_END_MINUTE);
            MTCommonLog.d("MTPushBusiness", "setNotificationSilenceTime:" + i + ":" + i2 + "-" + i3 + ":" + i4);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.NotificationTime.KEY_BEGIN_HOUR, i);
            jSONObject.put(MTPushConstants.NotificationTime.KEY_BEGIN_MINUTE, i2);
            jSONObject.put(MTPushConstants.NotificationTime.KEY_END_HOUR, i3);
            jSONObject.put(MTPushConstants.NotificationTime.KEY_END_MINUTE, i4);
            l0.d(context, jSONObject.toString());
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "setNotificationSilenceTime failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(Context context) {
        MTCommonLog.d("MTPushBusiness", "resetNotificationShowTime");
        l0.c(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(Context context) {
        MTCommonLog.d("MTPushBusiness", "resetNotificationSilenceTime");
        l0.d(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static z a() {
        if (b == null) {
            synchronized (z.class) {
                b = new z();
            }
        }
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void b(Context context, Bundle bundle) {
        int i = bundle.getInt("id");
        MTCommonLog.d("MTPushBusiness", "resetNotificationLayout builderId:" + i);
        l0.a(context, i, "");
    }

    public void b(Context context, int i) {
        boolean notificationState = NotificationUtil.getNotificationState(context);
        int i2 = this.f350a;
        if (i2 == -1) {
            MTCommonLog.d("MTPushBusiness", "notification state is " + notificationState);
            this.f350a = notificationState ? 1 : 0;
            a(context, i, notificationState);
            return;
        }
        if (i2 == notificationState) {
            MTCommonLog.d("MTPushBusiness", "no need update notification state lastNotificationState:" + this.f350a + ",currentNotificationState:" + (notificationState ? 1 : 0));
            return;
        }
        MTCommonLog.d("MTPushBusiness", "notification state is " + notificationState);
        this.f350a = notificationState ? 1 : 0;
        a(context, i, notificationState);
    }

    public int a(Context context) {
        return l0.e(context);
    }

    public NotificationLayout a(Context context, int i) {
        try {
            String strA = l0.a(context, i);
            if (TextUtils.isEmpty(strA)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.length() == 0) {
                return null;
            }
            int iOptInt = jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_LAYOUT_ID);
            int iOptInt2 = jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_ICON_VIEW_ID);
            int iOptInt3 = jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_ICON_RESOURCE_ID);
            int iOptInt4 = jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_TITLE_VIEW_ID);
            NotificationLayout timeViewId = new NotificationLayout().setLayoutId(iOptInt).setIconViewId(iOptInt2).setIconResourceId(iOptInt3).setTitleViewId(iOptInt4).setContentViewId(jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_CONTENT_VIEW_ID)).setTimeViewId(jSONObject.optInt(MTPushConstants.NotificationLayout.KEY_TIME_VIEW_ID));
            MTCommonLog.d("MTPushBusiness", "getNotificationLayout builderId:" + i + timeViewId.toString());
            return timeViewId;
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "getNotificationLayout builderId:" + i + " failed " + th.getMessage());
            return null;
        }
    }

    public void g(Context context) {
        MTCommonLog.d("MTPushBusiness", "resetNotificationCount");
        l0.c(context, 5);
    }

    public void e(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itime", System.currentTimeMillis() / 1000);
            jSONObject.put("lang", DeviceUtil.getLanguage(context));
            jSONObject.put("contry", MTGlobal.getCountryCode(context));
            jSONObject.put("carrier", DeviceUtil.getCarrier(context));
            jSONObject.put("os_version", DeviceUtil.getSystemVersionRelease());
            jSONObject.put("os_version_code", DeviceUtil.getSystemVersionSdkInt());
            jSONObject.put("model", DeviceUtil.getModel());
            jSONObject.put("device_name", DeviceUtil.getSystemDevice());
            jSONObject.put("product", DeviceUtil.getProduct());
            jSONObject.put("manufacturer", DeviceUtil.getManufacturer());
            jSONObject.put("time_zone", DeviceUtil.getTimeZone());
            jSONObject.put("time_zone_id", DeviceUtil.getTimeZoneId());
            jSONObject.put("app_version", MTGlobal.getAppVersionName(context));
            jSONObject.put("android_id", DeviceUtil.getAndroidId(context));
            MTReporter content = new MTReporter().setType("oversea_info").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle);
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "reportSoverseaInfo failed " + th.getMessage());
        }
    }

    public void f(Context context) {
        l0.b(context, 0);
        String str = Build.MANUFACTURER;
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str.toLowerCase();
        lowerCase2.hashCode();
        if (lowerCase2.equals(MTPushConstants.Manufacturer.HUAWEI)) {
            NotificationUtil.setHuaweiBadgeNumber(context, 0);
            return;
        }
        if (!lowerCase2.equals(MTPushConstants.Manufacturer.HONOR)) {
            MTCommonLog.d("MTPushBusiness", "setNotificationBadge not support " + lowerCase);
            return;
        }
        NotificationUtil.setHonorBadge(context, 0);
    }

    public void c(Context context, Bundle bundle) {
        int i = bundle.getInt(MTPushConstants.NotificationBadge.KEY_BADGE);
        if (i < 0) {
            MTCommonLog.e("MTPushBusiness", "setNotificationBadge error: number count must >= 0");
            return;
        }
        l0.b(context, i);
        String str = Build.MANUFACTURER;
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str.toLowerCase();
        lowerCase2.hashCode();
        if (lowerCase2.equals(MTPushConstants.Manufacturer.HUAWEI)) {
            NotificationUtil.setHuaweiBadgeNumber(context, i);
            return;
        }
        if (!lowerCase2.equals(MTPushConstants.Manufacturer.HONOR)) {
            MTCommonLog.d("MTPushBusiness", "setNotificationBadge not support " + lowerCase);
            return;
        }
        NotificationUtil.setHonorBadge(context, i);
    }

    public void a(Context context, Bundle bundle) {
        try {
            MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
            if (commonReceiver == null) {
                return;
            }
            commonReceiver.onNotificationStatus(context, bundle.getBoolean(MTPushConstants.NotificationState.KEY_STATE));
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "processMainNotificationState failed " + th.getMessage());
        }
    }

    public final void a(Context context, int i, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MTPushConstants.NotificationState.KEY_STATE, z);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, 3006, bundle);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.NotificationState.KEY_STATE, z);
            jSONObject.put("trigger_scene", i);
            MTReporter content = new MTReporter().setType("android_notification_state").setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle2);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.REPORT_NOTIFICATION_STATE, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTPushBusiness", "onNotificationState failed " + th.getMessage());
        }
    }

    public void d(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt(MTPushConstants.NotificationCount.KEY_COUNT);
        if (i <= 0) {
            MTCommonLog.e("MTPushBusiness", "setNotificationCount error: count must > 0");
            return;
        }
        MTCommonLog.e("MTPushBusiness", "setNotificationCount " + i);
        l0.c(context, i);
    }
}
