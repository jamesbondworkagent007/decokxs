package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5235Jx {
    public static final C5235Jx AEQbTJ = new C5235Jx();
    public static final java.util.Map<java.lang.String, C5233Jv> EZpvd = new LinkedHashMap();

    private C5235Jx() {
    }

    public final C5233Jv EZpvd(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        C5244Kg c5244KgDjBIcL = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        java.lang.String strKWHzl = KWHzl(c5216Je.fetchVPNInfo());
        java.util.Map<java.lang.String, C5233Jv> map = EZpvd;
        C5233Jv c5233Jv = map.get(strKWHzl);
        if (c5233Jv != null) {
            return c5233Jv;
        }
        C5233Jv c5233Jv2 = new C5233Jv(c5216Je.copydefault(), strKWHzl, c5216Je.AuCTel().getLogger(jz));
        map.put(strKWHzl, c5233Jv2);
        return c5233Jv2;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String lowerCase;
        if (str != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null || lowerCase.length() == 0 || Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "$default_instance")) {
            return "com.amplitude.api";
        }
        return "com.amplitude.api_" + lowerCase;
    }
}
