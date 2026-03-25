package com.okinc.lib.dionysus.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.autofill.HintConstants;
import com.google.firebase.messaging.Constants;
import com.okinc.lib.dionysus.crash.bean.Device;
import java.util.Locale;
import java.util.TimeZone;
import o.C38002pIp;
import o.C38052pKl;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceInfoHelper {
    public static String AEQbTJ = null;
    public static final String EZpvd = "DeviceInfoHelper";
    public static Device copydefault;

    private DeviceInfoHelper() {
    }

    public static Device KWHzl(Context context) throws DeviceInfoException {
        synchronized (DeviceInfoHelper.class) {
            Device device = copydefault;
            if (device != null && !device.isEmpty()) {
                return copydefault;
            }
            Device device2 = new Device();
            copydefault = device2;
            try {
                device2.setAppNamespace(context.getPackageName());
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    copydefault.setCarrierCountry(networkCountryIso);
                }
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    copydefault.setCarrierName(networkOperatorName);
                }
                String str = AEQbTJ;
                if (str != null) {
                    copydefault.setCarrierCountry(str);
                }
                copydefault.setLocale(Locale.getDefault().toString());
                copydefault.setModel(Build.MODEL);
                copydefault.setOemName(Build.MANUFACTURER);
                copydefault.setOsApiLevel(Integer.valueOf(Build.VERSION.SDK_INT));
                copydefault.setOsName("Android");
                copydefault.setOsVersion(Build.VERSION.RELEASE);
                copydefault.setOsBuild(Build.ID);
                copydefault.setScreenSize(EZpvd(context));
                copydefault.setTimeZoneOffset(Integer.valueOf((TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60) / 1000));
                PackageInfo packageInfoCopydefault = C38052pKl.copydefault(context.getPackageName(), 0);
                if (packageInfoCopydefault != null) {
                    copydefault.setAppVersion(packageInfoCopydefault.versionName);
                    copydefault.setAppBuild(String.valueOf(KWHzl(packageInfoCopydefault)));
                }
            } catch (Exception e) {
                C38002pIp.Companion.iwGUEr().copydefault(EZpvd, "Cannot retrieve carrier info" + e.getMessage(), e);
            }
            return copydefault;
        }
    }

    public static int KWHzl(PackageInfo packageInfo) {
        return packageInfo.versionCode;
    }

    public static String EZpvd(Context context) {
        int i;
        int i2;
        Point point = new Point();
        Display display = ((DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplay(0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        int rotation = display.getRotation();
        if (rotation == 1 || rotation == 3) {
            int i3 = point.x;
            int i4 = point.y;
            i = i3;
            i2 = i4;
        } else {
            i2 = point.x;
            i = point.y;
        }
        return i2 + "x" + i;
    }

    public static class DeviceInfoException extends Exception {
        public DeviceInfoException(String str) {
            super(str);
        }
    }
}
