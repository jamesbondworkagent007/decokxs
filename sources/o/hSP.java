package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hSP {
    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, str, true, null, false, null, null, 26, null);
        if ("0".contentEquals(tokenCode$default)) {
            return "0";
        }
        return pTF.KWHzl.AEQbTJ(str2 + tokenCode$default);
    }
}
