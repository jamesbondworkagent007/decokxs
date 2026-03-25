package o;

import android.os.Handler;
import com.okinc.lib.utils.commmon.ReflectUtils;

/* JADX INFO: loaded from: classes9.dex */
public class pJW {
    public static InterfaceC32978mnl EZpvd = null;
    public static boolean OLrzqt = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OLrzqt(InterfaceC32978mnl interfaceC32978mnl) {
        EZpvd = interfaceC32978mnl;
    }

    public static void KWHzl(android.app.Application application) {
        try {
            if (OLrzqt) {
                return;
            }
            EZpvd();
            OLrzqt = true;
            pUU.copydefault("Monitor.Lifecycle", "hook ActivityThread.mH success");
        } catch (java.lang.Exception unused) {
            pUU.copydefault("Monitor.Lifecycle", "hook fail");
        }
    }

    public static void copydefault() {
        InterfaceC32978mnl interfaceC32978mnl = EZpvd;
        if (interfaceC32978mnl != null) {
            interfaceC32978mnl.AEQbTJ();
        }
    }

    public static void EZpvd() {
        android.os.Handler handler = (android.os.Handler) ReflectUtils.copydefault(ReflectUtils.OLrzqt("android.app.ActivityThread").valueOf("currentActivityThread").AEQbTJ()).AEQbTJ("mH").AEQbTJ();
        ReflectUtils.copydefault(handler).AEQbTJ("mCallback", new pJY((Handler.Callback) ReflectUtils.copydefault(handler).AEQbTJ("mCallback").AEQbTJ(), handler));
    }
}
