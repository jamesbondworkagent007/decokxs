package o;

import com.okinc.lib.monitor.window.WindowObserver;

/* JADX INFO: renamed from: o.pKc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38043pKc {
    public static java.lang.String EZpvd = "GlobalWindowManager";
    public static C38043pKc OLrzqt;
    public final WindowObserver AEQbTJ = new WindowObserver();
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WindowObserver copydefault() {
        return this.AEQbTJ;
    }

    public static C38043pKc AEQbTJ() {
        C38043pKc c38043pKc;
        synchronized (C38043pKc.class) {
            if (OLrzqt == null) {
                OLrzqt = new C38043pKc();
            }
            c38043pKc = OLrzqt;
        }
        return c38043pKc;
    }

    private C38043pKc() {
    }

    public void EZpvd(android.content.Context context) {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        OLrzqt(context);
    }

    public final void OLrzqt(android.content.Context context) {
        try {
            java.lang.Object systemService = context.getSystemService("window");
            java.lang.reflect.Field declaredField = systemService.getClass().getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(systemService);
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mViews");
            declaredField2.setAccessible(true);
            if (declaredField2.get(obj) instanceof java.util.List) {
                this.AEQbTJ.addAll((java.util.List) declaredField2.get(obj));
                declaredField2.set(obj, this.AEQbTJ);
            }
            pUU.copydefault(EZpvd, "reflectProxyWindowManager successful");
        } catch (java.lang.Exception unused) {
            pUU.copydefault(EZpvd, "reflectProxyWindowManager failed ");
        }
    }
}
