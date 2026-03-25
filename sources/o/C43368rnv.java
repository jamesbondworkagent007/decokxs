package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43368rnv {
    public static final C43368rnv copydefault = new C43368rnv();

    private C43368rnv() {
    }

    public final java.lang.String copydefault(boolean z) {
        if (!SPUtils.getBoolean("doh_debug_sp_key", false)) {
            return null;
        }
        java.lang.String string = SPUtils.getString(copydefault("doh_debug_http_", z), null);
        C43365rns.OLrzqt.AEQbTJ(string);
        return string;
    }

    public final java.util.List<java.lang.String> copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strCopydefault = copydefault(true);
        if (strCopydefault != null) {
            arrayList.add(strCopydefault);
        }
        java.lang.String strCopydefault2 = copydefault(false);
        if (strCopydefault2 != null) {
            arrayList.add(strCopydefault2);
        }
        return arrayList;
    }

    public final java.util.ArrayList<java.lang.String> copydefault(@NotNull java.lang.String str) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        if (!SPUtils.getBoolean("doh_debug_sp_key", false) || (string = SPUtils.getString(EZpvd(str), null)) == null) {
            return null;
        }
        return yDY.copydefault(string);
    }

    public final java.lang.String KWHzl(boolean z) {
        if (SPUtils.getBoolean("doh_debug_sp_key", false)) {
            return SPUtils.getString(copydefault("doh_debug_v5_", z), null);
        }
        return null;
    }

    public final java.lang.String EZpvd(boolean z) {
        if (SPUtils.getBoolean("doh_debug_sp_key", false)) {
            return SPUtils.getString(copydefault("doh_debug_dexpri_", z), null);
        }
        return null;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return str + "global";
        }
        return str + "current_site";
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "doh_debug_ip_" + str;
    }
}
