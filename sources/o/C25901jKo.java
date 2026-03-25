package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25901jKo {
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final double OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25901jKo EZpvd(double d, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25901jKo(d, str, str2, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25901jKo)) {
            return false;
        }
        C25901jKo c25901jKo = (C25901jKo) obj;
        return java.lang.Double.compare(this.OLrzqt, c25901jKo.OLrzqt) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25901jKo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25901jKo.EZpvd) && this.AEQbTJ == c25901jKo.AEQbTJ && this.KWHzl == c25901jKo.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Double.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DailyFundingFeeDataVo(price=" + this.OLrzqt + ", priceString=" + this.copydefault + ", dateString=" + this.EZpvd + ", time=" + this.AEQbTJ + ", timeType=" + this.KWHzl + ")";
    }

    public C25901jKo(double d, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = d;
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = j;
        this.KWHzl = i;
    }
}
