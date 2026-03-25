package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47142tkU {
    public static final C47142tkU OLrzqt = new C47142tkU();

    private C47142tkU() {
    }

    public static /* synthetic */ java.lang.String getProp$default(C47142tkU c47142tkU, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return c47142tkU.EZpvd(str, str2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            java.lang.Object objInvoke = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, str, str2);
            Intrinsics.copydefault(objInvoke, "");
            return (java.lang.String) objInvoke;
        } catch (java.lang.Exception unused) {
            return str2;
        }
    }
}
