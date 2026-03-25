package com.bytedance.applog.util;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.r4;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareUtils {
    public static final String GLOBAL_CACHE_GET_ANDROID_ID = "Secure.getString_android_id";

    public static final class a implements r4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f124a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Context context) {
            this.f124a = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String a() {
            LoggerImpl.global().debug(Collections.singletonList("HardwareUtils"), "[DeviceMeta] Try to get android id by secure.getString", new Object[0]);
            return Settings.Secure.getString(this.f124a.getContentResolver(), "android_id");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getOperatorName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getScreenOrientation(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getWidth() <= defaultDisplay.getHeight() ? 1 : 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSecureAndroidId(Context context) {
        try {
            return r4.a(context).a(GLOBAL_CACHE_GET_ANDROID_ID, new a(context));
        } catch (Throwable th) {
            LoggerImpl.global().error(Collections.singletonList("HardwareUtils"), "Get androidId failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getSimCountryIso(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso();
        }
        return null;
    }
}
