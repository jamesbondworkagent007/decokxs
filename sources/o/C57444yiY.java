package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57444yiY {
    public final java.lang.String AEQbTJ;
    public final double EZpvd;
    public final double KWHzl;
    public final double OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57444yiY KWHzl(@NotNull java.lang.String str, double d, double d2, double d3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C57444yiY(str, d, d2, d3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57444yiY)) {
            return false;
        }
        C57444yiY c57444yiY = (C57444yiY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c57444yiY.AEQbTJ) && java.lang.Double.compare(this.EZpvd, c57444yiY.EZpvd) == 0 && java.lang.Double.compare(this.OLrzqt, c57444yiY.OLrzqt) == 0 && java.lang.Double.compare(this.KWHzl, c57444yiY.KWHzl) == 0 && this.copydefault == c57444yiY.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Double.hashCode(this.OLrzqt)) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TreeMapData(name=" + this.AEQbTJ + ", valueToCalculate=" + this.EZpvd + ", tokenAmount=" + this.OLrzqt + ", currencyAmount=" + this.KWHzl + ", precision=" + this.copydefault + ")";
    }

    public C57444yiY(@NotNull java.lang.String str, double d, double d2, double d3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = d;
        this.OLrzqt = d2;
        this.KWHzl = d3;
        this.copydefault = i;
    }
}
