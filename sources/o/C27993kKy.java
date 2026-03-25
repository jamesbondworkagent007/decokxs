package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27993kKy {
    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = C27989kKu.Companion.fetchVPNInfo().get(str);
        return str2 == null ? str : str2;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pre_market") ? "premarket" : str;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = C27989kKu.Companion.OLrzqt();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str2 = mapOLrzqt.get(lowerCase);
        return str2 == null ? "custom_group" : str2;
    }
}
