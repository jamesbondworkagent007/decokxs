package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Asu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3809Asu {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public double EZpvd;
    public double KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3809Asu copy$default(C3809Asu c3809Asu, java.lang.String str, double d, java.lang.String str2, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3809Asu.AEQbTJ;
        }
        if ((i & 2) != 0) {
            d = c3809Asu.EZpvd;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            str2 = c3809Asu.copydefault;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            d2 = c3809Asu.KWHzl;
        }
        return c3809Asu.OLrzqt(str, d3, str3, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3809Asu OLrzqt(@NotNull java.lang.String str, double d, @NotNull java.lang.String str2, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C3809Asu(str, d, str2, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3809Asu)) {
            return false;
        }
        C3809Asu c3809Asu = (C3809Asu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3809Asu.AEQbTJ) && java.lang.Double.compare(this.EZpvd, c3809Asu.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3809Asu.copydefault) && java.lang.Double.compare(this.KWHzl, c3809Asu.KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Double.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuickConvertOrderItem(baseCurrency=" + this.AEQbTJ + ", baseAmount=" + this.EZpvd + ", quoteCurrency=" + this.copydefault + ", quoteAmount=" + this.KWHzl + ")";
    }

    public C3809Asu(@NotNull java.lang.String str, double d, @NotNull java.lang.String str2, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = d;
        this.copydefault = str2;
        this.KWHzl = d2;
    }
}
