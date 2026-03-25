package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xXY {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return z ? str : str2;
    }

    public static /* synthetic */ java.lang.String hideOrShowAsset$default(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "*****";
        }
        return copydefault(str, z, str2);
    }
}
