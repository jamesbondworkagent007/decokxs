package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41434qqj {
    public static final C41434qqj KWHzl = new C41434qqj();

    private C41434qqj() {
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("OKMarket_Quotation", str + " " + str2);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.EZpvd("OKMarket_Quotation", str + " " + str2);
    }

    public static /* synthetic */ void w$default(C41434qqj c41434qqj, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        c41434qqj.AEQbTJ(str, str2, th);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.OLrzqt("OKMarket_Quotation", str + " " + str2, th);
    }

    public static /* synthetic */ void e$default(C41434qqj c41434qqj, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c41434qqj.EZpvd(str, th);
    }

    public final void EZpvd(java.lang.String str, java.lang.Throwable th) {
        pUU.AEQbTJ("OKMarket_Quotation", java.lang.String.valueOf(str), th);
    }

    public static /* synthetic */ void e$default(C41434qqj c41434qqj, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        c41434qqj.copydefault(str, str2, th);
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.AEQbTJ("OKMarket_Quotation", str + " " + str2, th);
    }
}
