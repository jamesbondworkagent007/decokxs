package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40375qTn {
    public static final C40375qTn AEQbTJ = new C40375qTn();

    private C40375qTn() {
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("OKMarket_Search", str + " " + str2);
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.EZpvd("OKMarket_Search", str + " " + str2);
    }

    public static /* synthetic */ void w$default(C40375qTn c40375qTn, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        c40375qTn.KWHzl(str, str2, th);
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.OLrzqt("OKMarket_Search", str + " " + str2, th);
    }

    public static /* synthetic */ void e$default(C40375qTn c40375qTn, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        c40375qTn.copydefault(str, str2, th);
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.AEQbTJ("OKMarket_Search", str + " " + str2, th);
    }
}
