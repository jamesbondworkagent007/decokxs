package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Atb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3843Atb {
    public static final int $stable = 8;
    public C3814Asz AEQbTJ;
    public C3818AtC AhwBna;
    public C3817AtB EZpvd;
    public C3816AtA KWHzl;
    public C3764AsB OLrzqt;
    public C3813Asy copydefault;
    public java.lang.String djBIcL;
    public C3826AtK valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3813Asy AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3826AtK AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3764AsB EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3817AtB KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3843Atb KWHzl(@NotNull java.lang.String str, @NotNull C3813Asy c3813Asy, @NotNull C3826AtK c3826AtK, @NotNull C3818AtC c3818AtC, @NotNull C3814Asz c3814Asz, @NotNull C3816AtA c3816AtA, @NotNull C3764AsB c3764AsB, @NotNull C3817AtB c3817AtB) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c3813Asy, "");
        Intrinsics.checkNotNullParameter(c3826AtK, "");
        Intrinsics.checkNotNullParameter(c3818AtC, "");
        Intrinsics.checkNotNullParameter(c3814Asz, "");
        Intrinsics.checkNotNullParameter(c3816AtA, "");
        Intrinsics.checkNotNullParameter(c3764AsB, "");
        Intrinsics.checkNotNullParameter(c3817AtB, "");
        return new C3843Atb(str, c3813Asy, c3826AtK, c3818AtC, c3814Asz, c3816AtA, c3764AsB, c3817AtB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3814Asz OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3816AtA copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3843Atb)) {
            return false;
        }
        C3843Atb c3843Atb = (C3843Atb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c3843Atb.djBIcL) && Intrinsics.EZpvd(this.copydefault, c3843Atb.copydefault) && Intrinsics.EZpvd(this.valueOf, c3843Atb.valueOf) && Intrinsics.EZpvd(this.AhwBna, c3843Atb.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, c3843Atb.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c3843Atb.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3843Atb.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c3843Atb.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3818AtC gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.djBIcL.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailItem(status=" + this.djBIcL + ", banner=" + this.copydefault + ", summary=" + this.valueOf + ", pnl=" + this.AhwBna + ", actions=" + this.AEQbTJ + ", orders=" + this.KWHzl + ", frequency=" + this.OLrzqt + ", paymentMethod=" + this.EZpvd + ")";
    }

    public C3843Atb(@NotNull java.lang.String str, @NotNull C3813Asy c3813Asy, @NotNull C3826AtK c3826AtK, @NotNull C3818AtC c3818AtC, @NotNull C3814Asz c3814Asz, @NotNull C3816AtA c3816AtA, @NotNull C3764AsB c3764AsB, @NotNull C3817AtB c3817AtB) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c3813Asy, "");
        Intrinsics.checkNotNullParameter(c3826AtK, "");
        Intrinsics.checkNotNullParameter(c3818AtC, "");
        Intrinsics.checkNotNullParameter(c3814Asz, "");
        Intrinsics.checkNotNullParameter(c3816AtA, "");
        Intrinsics.checkNotNullParameter(c3764AsB, "");
        Intrinsics.checkNotNullParameter(c3817AtB, "");
        this.djBIcL = str;
        this.copydefault = c3813Asy;
        this.valueOf = c3826AtK;
        this.AhwBna = c3818AtC;
        this.AEQbTJ = c3814Asz;
        this.KWHzl = c3816AtA;
        this.OLrzqt = c3764AsB;
        this.EZpvd = c3817AtB;
    }
}
