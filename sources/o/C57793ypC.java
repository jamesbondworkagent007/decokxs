package o;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.HmsMessaging;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import o.InterfaceC57841ypy;

/* JADX INFO: renamed from: o.ypC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57793ypC implements InterfaceC57841ypy {
    public static InterfaceC57841ypy.Activity AEQbTJ;
    public static boolean EZpvd;

    public static void AEQbTJ(java.lang.String str) {
        InterfaceC57841ypy.Activity activity = AEQbTJ;
        if (activity == null) {
            return;
        }
        EZpvd = true;
        activity.copydefault(str, 1);
    }

    @Override // o.InterfaceC57841ypy
    public void EZpvd(@androidx.annotation.NonNull final android.content.Context context, java.lang.String str, @androidx.annotation.NonNull final InterfaceC57841ypy.Activity activity) {
        AEQbTJ = activity;
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypC.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C57793ypC.this.copydefault(context, activity);
                } catch (ApiException e) {
                    OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "HMS ApiException getting Huawei push token!", e);
                    activity.copydefault(null, e.getStatusCode() == 907135000 ? -26 : -27);
                }
            }
        }, "OS_HMS_GET_TOKEN").start();
    }

    public final void copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull InterfaceC57841ypy.Activity activity) throws ApiException {
        synchronized (this) {
            if (!OSUtils.copydefault()) {
                activity.copydefault(null, -28);
                return;
            }
            java.lang.String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
            if (!android.text.TextUtils.isEmpty(token)) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Device registered for HMS, push token = " + token);
                activity.copydefault(token, 1);
            } else {
                AEQbTJ(activity);
            }
        }
    }

    public static void copydefault() {
        try {
            java.lang.Thread.sleep(30000L);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final void AEQbTJ(@androidx.annotation.NonNull InterfaceC57841ypy.Activity activity) {
        copydefault();
        if (EZpvd) {
            return;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
        activity.copydefault(null, -25);
    }
}
