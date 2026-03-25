package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ulj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49289ulj {
    public static final C49289ulj copydefault = new C49289ulj();
    public static final int OLrzqt = 8;

    public final boolean copydefault() {
        return true;
    }

    private C49289ulj() {
    }

    public final boolean OLrzqt() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "growth_share_rust_enable", null, 2, null);
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
        pUU.KWHzl("OKShare", "isRustEnable:" + zEZpvd + " value:" + value$default);
        return zEZpvd;
    }
}
