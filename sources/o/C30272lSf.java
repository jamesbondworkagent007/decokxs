package o;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30272lSf implements InterfaceC3910Auq {
    public final C30325lUe KWHzl;

    @yCM
    public C30272lSf(@NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.KWHzl = c30325lUe;
    }

    @Override // o.InterfaceC3910Auq
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = "daily".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase2)) {
            return this.KWHzl.EZpvd(C31351lsQ.Activity.atDTRm);
        }
        java.lang.String upperCase3 = "weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase3)) {
            return this.KWHzl.EZpvd(C31351lsQ.Activity.gBtXYZ);
        }
        java.lang.String upperCase4 = "bi-weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase4)) {
            return this.KWHzl.EZpvd(C31351lsQ.Activity.Rtjmuc);
        }
        java.lang.String upperCase5 = "monthly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase5)) {
            return this.KWHzl.EZpvd(C31351lsQ.Activity.dPnHjp);
        }
        if (str.length() <= 0) {
            return str;
        }
        char upperCase6 = java.lang.Character.toUpperCase(str.charAt(0));
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return upperCase6 + strSubstring;
    }

    @Override // o.InterfaceC3910Auq
    public java.lang.String copydefault(long j) {
        return pTA.formatStandardDate$default(new Date(j), null, 1, null);
    }
}
