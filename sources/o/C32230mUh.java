package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32230mUh {
    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ("0".contentEquals(mRD.formatTokenCode$default(mRD.OLrzqt, str, true, null, false, null, null, 26, null))) {
            return "0";
        }
        return str2 + xHJ.convertDexAmount$default(z, str, null, true, 4, null);
    }
}
