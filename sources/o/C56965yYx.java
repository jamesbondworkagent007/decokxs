package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yYx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56965yYx {
    public static final java.lang.String EZpvd(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (!AEQbTJ(c56935yXu)) {
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return strAEQbTJ;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strAEQbTJ2 = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ2, "");
        sb.append('`' + strAEQbTJ2);
        sb.append('`');
        return sb.toString();
    }

    public static final boolean AEQbTJ(C56935yXu c56935yXu) {
        java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        if (!C56964yYw.KWHzl.contains(strAEQbTJ)) {
            int i = 0;
            while (true) {
                if (i < strAEQbTJ.length()) {
                    char cCharAt = strAEQbTJ.charAt(i);
                    if (!java.lang.Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strAEQbTJ.length() != 0 && java.lang.Character.isJavaIdentifierStart(strAEQbTJ.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final java.lang.String AEQbTJ(@NotNull C56930yXp c56930yXp) {
        Intrinsics.checkNotNullParameter(c56930yXp, "");
        return KWHzl(c56930yXp.gEmmrt());
    }

    public static final java.lang.String KWHzl(@NotNull java.util.List<C56935yXu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (C56935yXu c56935yXu : list) {
            if (sb.length() > 0) {
                sb.append(JwtUtilsKt.JWT_DELIMITER);
            }
            sb.append(EZpvd(c56935yXu));
        }
        return sb.toString();
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (C59449zhJ.startsWith$default(str, str2, false, 2, null) && C59449zhJ.startsWith$default(str3, str4, false, 2, null)) {
            java.lang.String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String strSubstring2 = str3.substring(str4.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            java.lang.String str6 = str5 + strSubstring;
            if (Intrinsics.EZpvd((java.lang.Object) strSubstring, (java.lang.Object) strSubstring2)) {
                return str6;
            }
            if (EZpvd(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C59449zhJ.replace$default(str2, "?", "", false, 4, (java.lang.Object) null))) {
            if (C59449zhJ.endsWith$default(str2, "?", false, 2, null)) {
                if (!Intrinsics.EZpvd((java.lang.Object) (str + '?'), (java.lang.Object) str2)) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ('(' + str + ")?"), (java.lang.Object) str2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
