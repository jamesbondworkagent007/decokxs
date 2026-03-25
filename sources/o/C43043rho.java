package o;

import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43043rho {
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C43043rho.class, "disableAutoUpdate", "getDisableAutoUpdate()Z", 0))};
    public static final int OLrzqt = 8;
    public Function2<? super android.content.Context, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> AEQbTJ;
    public final java.util.Map<java.lang.String, InterfaceC43022rhT> djBIcL = new LinkedHashMap();
    public java.lang.String copydefault = "";
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw = new LinkedHashMap();
    public final C7828arG KWHzl = new C7828arG("miniapp_sp", "disableMiniappAutoUpdate", false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super android.content.Context, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, kotlin.Unit>, kotlin.jvm.functions.Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, kotlin.Unit> */
    public final Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function2<? super android.content.Context, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2) {
        this.AEQbTJ = function2;
    }

    public final boolean EZpvd() {
        return this.KWHzl.getValue(this, EZpvd[0]).booleanValue();
    }

    public final void OLrzqt(boolean z) {
        this.KWHzl.KWHzl(this, EZpvd[0], java.lang.Boolean.valueOf(z));
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.copydefault = str;
            this.djBIcL.put(str, new C43013rhK(str));
            return;
        }
        this.copydefault = "";
        this.djBIcL.remove(str);
        if (OLrzqt(str)) {
            java.lang.String str2 = this.AYXKKw.get(str);
            java.util.Map<java.lang.String, InterfaceC43022rhT> map = this.djBIcL;
            Intrinsics.copydefault((java.lang.Object) str2);
            map.put(str, new C43018rhP(str, str2));
        }
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.copydefault);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.containsKey(str);
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!C34703nhO.AhwBna(context)) {
            KWHzl();
            return;
        }
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        if (c7791aqWAEQbTJ != null) {
            c7791aqWAEQbTJ.EZpvd(this.AYXKKw.get("oklua"));
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry : this.AYXKKw.entrySet()) {
            this.djBIcL.put(entry.getKey(), new C43018rhP(entry.getKey(), entry.getValue()));
        }
    }

    public final void KWHzl() {
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        if (c7791aqWAEQbTJ != null) {
            c7791aqWAEQbTJ.EZpvd(null);
        }
        this.AYXKKw.clear();
        SPUtils.remove("miniapp_test_packets", "miniapp_sp");
    }

    public final java.util.Collection<java.lang.String> copydefault() {
        return this.AYXKKw.values();
    }

    public final void KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AYXKKw.putAll(map);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.AYXKKw.get(str), (java.lang.Object) str2)) {
            this.AYXKKw.remove(str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "oklua")) {
                C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
                if (c7791aqWAEQbTJ != null) {
                    c7791aqWAEQbTJ.EZpvd(null);
                }
                C43292rmY.OLrzqt.copydefault(C7326ahi.gEmmrt());
            } else {
                this.djBIcL.remove(str);
            }
        } else {
            this.AYXKKw.put(str, str2);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "oklua")) {
                C7791aqW c7791aqWAEQbTJ2 = C7788aqT.AEQbTJ();
                if (c7791aqWAEQbTJ2 != null) {
                    c7791aqWAEQbTJ2.EZpvd(str2);
                }
                C43292rmY.OLrzqt.copydefault(C7326ahi.gEmmrt());
            } else {
                this.djBIcL.put(str, new C43018rhP(str, str2));
            }
        }
        SPUtils.put("miniapp_test_packets", this.AYXKKw, "miniapp_sp");
    }

    public final boolean djBIcL() {
        return !this.AYXKKw.isEmpty();
    }

    public final InterfaceC43022rhT AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd(str) || OLrzqt(str)) {
            return this.djBIcL.get(str);
        }
        return null;
    }

    public final void AEQbTJ() {
        KWHzl();
        this.copydefault = "";
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("miniapp_update_whitelist", false, "miniapp_sp");
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("miniapp_update_whitelist", java.lang.Boolean.valueOf(z), "miniapp_sp");
    }
}
