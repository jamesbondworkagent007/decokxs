package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUT {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pUT copy$default(pUT put, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = put.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = put.KWHzl;
        }
        java.lang.String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = put.EZpvd;
        }
        java.lang.String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = put.AEQbTJ;
        }
        java.lang.String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = put.OLrzqt;
        }
        return put.AEQbTJ(i, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pUT AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new pUT(i, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pUT)) {
            return false;
        }
        pUT put = (pUT) obj;
        return this.copydefault == put.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) put.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) put.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) put.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) put.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LogItem(level=" + this.copydefault + ", tag=" + this.KWHzl + ", msg=" + this.EZpvd + ", threadInfo=" + this.AEQbTJ + ", stackTraceInfo=" + this.OLrzqt + ")";
    }

    public pUT(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = i;
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
    }
}
