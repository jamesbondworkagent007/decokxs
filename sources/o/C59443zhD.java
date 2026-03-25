package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59443zhD extends C59446zhG {
    public static java.lang.Float fIwbmz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C59487zhv.KWHzl.matches(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return null;
    }

    public static java.lang.Double AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C59487zhv.KWHzl.matches(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return null;
    }

    public static BigDecimal fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C59487zhv.KWHzl.matches(str)) {
                return new BigDecimal(str);
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return null;
    }
}
