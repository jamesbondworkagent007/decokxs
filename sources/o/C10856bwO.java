package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10856bwO {
    public static final void copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.copydefault("*WalletLog*", "{ code:" + i + ", tag: " + str + ", message: " + str2 + " }");
    }

    public static final void copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.AEQbTJ("*WalletLog*", "{ code:" + i + ", tag: " + str + ", message: " + str2 + " }", th);
    }

    public static /* synthetic */ void printWalletLog$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        EZpvd(str, th);
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String message = th.getMessage();
        copydefault(str, -1, message != null ? message : "", th);
    }
}
