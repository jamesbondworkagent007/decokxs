package o;

import com.okinc.localization.report.SupportType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38291pTi {
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38291pTi copy$default(C38291pTi c38291pTi, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c38291pTi.gEmmrt;
        }
        if ((i & 2) != 0) {
            str2 = c38291pTi.djBIcL;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            z = c38291pTi.copydefault;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str3 = c38291pTi.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c38291pTi.EZpvd;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = c38291pTi.KWHzl;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            z2 = c38291pTi.AEQbTJ;
        }
        return c38291pTi.copydefault(str, str6, z3, str7, str8, str9, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38291pTi copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C38291pTi(str, str2, z, str3, str4, str5, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    public C38291pTi(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.gEmmrt = str;
        this.djBIcL = str2;
        this.copydefault = z;
        this.OLrzqt = str3;
        this.EZpvd = str4;
        this.KWHzl = str5;
        this.AEQbTJ = z2;
    }

    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final java.lang.String EZpvd() {
        return (this.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) SupportType.KEY.getType())) ? "1" : "0";
    }

    public java.lang.String toString() {
        return "type:" + this.gEmmrt + ",value:" + this.djBIcL + ",isUpload:" + this.copydefault + ",appVersion:" + this.OLrzqt + ",keyContent:" + this.EZpvd + ",isStartupKey:" + this.AEQbTJ;
    }
}
