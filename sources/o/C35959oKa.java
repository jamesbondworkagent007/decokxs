package o;

import com.google.mlkit.common.MlKit;

/* JADX INFO: renamed from: o.oKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35959oKa {
    public static boolean EZpvd;
    public static final C35959oKa copydefault = new C35959oKa();
    public static final int AEQbTJ = 8;

    private C35959oKa() {
    }

    public final void OLrzqt() {
        pUU.KWHzl("MlKitInitManager", "initializeIfNeeded, isInit: " + EZpvd);
        if (EZpvd) {
            return;
        }
        try {
            MlKit.initialize(C32979mnm.EZpvd.OLrzqt());
            EZpvd = true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("MlKitInitManager", "init error", e);
        }
    }
}
