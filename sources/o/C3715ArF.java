package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ArF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3715ArF {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3715ArF copy$default(C3715ArF c3715ArF, int i, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c3715ArF.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str = c3715ArF.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = c3715ArF.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            z = c3715ArF.copydefault;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = c3715ArF.OLrzqt;
        }
        return c3715ArF.KWHzl(i, str4, str5, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3715ArF KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C3715ArF(i, str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3715ArF)) {
            return false;
        }
        C3715ArF c3715ArF = (C3715ArF) obj;
        return this.EZpvd == c3715ArF.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3715ArF.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3715ArF.AEQbTJ) && this.copydefault == c3715ArF.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3715ArF.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellSubOrderDetail(status=" + this.EZpvd + ", tradeType=" + this.KWHzl + ", displayTitle=" + this.AEQbTJ + ", clickable=" + this.copydefault + ", orderNo=" + this.OLrzqt + ")";
    }

    public C3715ArF(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = i;
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = z;
        this.OLrzqt = str3;
    }
}
