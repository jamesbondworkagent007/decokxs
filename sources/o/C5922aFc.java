package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5922aFc {
    public static final C5922aFc KWHzl = new C5922aFc();

    private C5922aFc() {
    }

    public static /* synthetic */ void log$default(C5922aFc c5922aFc, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c5922aFc.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            pUU.KWHzl("Passkey Flow", str + str2 + " " + str3);
        } catch (java.lang.Throwable unused) {
        }
    }
}
