package o;

import com.onesignal.OneSignal;
import o.InterfaceC57841ypy;

/* JADX INFO: renamed from: o.ypw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57839ypw implements InterfaceC57841ypy {
    public static InterfaceC57841ypy.Activity KWHzl = null;
    public static boolean copydefault = false;

    @Override // o.InterfaceC57841ypy
    public void EZpvd(final android.content.Context context, java.lang.String str, final InterfaceC57841ypy.Activity activity) {
        KWHzl = activity;
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                com.amazon.device.messaging.ADM adm = new com.amazon.device.messaging.ADM(context);
                java.lang.String registrationId = adm.getRegistrationId();
                if (registrationId == null) {
                    adm.startRegister();
                } else {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "ADM Already registered with ID:" + registrationId);
                    activity.copydefault(registrationId, 1);
                }
                try {
                    java.lang.Thread.sleep(30000L);
                } catch (java.lang.InterruptedException unused) {
                }
                if (C57839ypw.copydefault) {
                    return;
                }
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                C57839ypw.KWHzl(null);
            }
        }).start();
    }

    public static void KWHzl(java.lang.String str) {
        InterfaceC57841ypy.Activity activity = KWHzl;
        if (activity == null) {
            return;
        }
        copydefault = true;
        activity.copydefault(str, 1);
    }
}
