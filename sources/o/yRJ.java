package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRJ {
    public static final C56935yXu OLrzqt(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        C56935yXu c56935yXuPropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(c56935yXu, "get", false, null, 12, null);
        return c56935yXuPropertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(c56935yXu, "is", false, null, 8, null) : c56935yXuPropertyNameFromAccessorMethodName$default;
    }

    public static final C56935yXu copydefault(@NotNull C56935yXu c56935yXu, boolean z) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return propertyNameFromAccessorMethodName$default(c56935yXu, "set", false, z ? "is" : null, 4, null);
    }

    public static final java.util.List<C56935yXu> AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return yDY.valueOf(copydefault(c56935yXu, false), copydefault(c56935yXu, true));
    }

    public static /* synthetic */ C56935yXu propertyNameFromAccessorMethodName$default(C56935yXu c56935yXu, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return KWHzl(c56935yXu, str, z, str2);
    }

    public static final C56935yXu KWHzl(C56935yXu c56935yXu, java.lang.String str, boolean z, java.lang.String str2) {
        if (c56935yXu.OLrzqt()) {
            return null;
        }
        java.lang.String strCopydefault = c56935yXu.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        if (!C59449zhJ.startsWith$default(strCopydefault, str, false, 2, null) || strCopydefault.length() == str.length()) {
            return null;
        }
        char cCharAt = strCopydefault.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return C56935yXu.AEQbTJ(str2 + StringsKt__StringsKt.KWHzl(strCopydefault, (java.lang.CharSequence) str));
        }
        if (!z) {
            return c56935yXu;
        }
        java.lang.String strCopydefault2 = C59428zgp.copydefault(StringsKt__StringsKt.KWHzl(strCopydefault, (java.lang.CharSequence) str), true);
        if (C56935yXu.EZpvd(strCopydefault2)) {
            return C56935yXu.AEQbTJ(strCopydefault2);
        }
        return null;
    }

    public static final java.util.List<C56935yXu> KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        if (C56777yRy.AEQbTJ(strAEQbTJ)) {
            return yDY.OLrzqt(OLrzqt(c56935yXu));
        }
        if (C56777yRy.EZpvd(strAEQbTJ)) {
            return AEQbTJ(c56935yXu);
        }
        return C56756yRd.EZpvd.KWHzl(c56935yXu);
    }
}
