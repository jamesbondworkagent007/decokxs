package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23273hvC {
    public static final C23273hvC AEQbTJ = new C23273hvC();

    private C23273hvC() {
    }

    public static /* synthetic */ java.lang.String mergeText$default(C23273hvC c23273hvC, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c23273hvC.EZpvd(str, str2, str3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2.length() == 0) {
            return str;
        }
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            return pTF.KWHzl.AEQbTJ(str2 + str3 + str);
        }
        return str + str3 + str2;
    }
}
