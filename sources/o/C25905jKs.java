package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25905jKs {
    public final java.util.List<C25901jKo> AEQbTJ;
    public final C25902jKp EZpvd;
    public final C25904jKr KWHzl;
    public final C25902jKp OLrzqt;
    public final C25904jKr copydefault;
    public final C25902jKp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.jKs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25905jKs copy$default(C25905jKs c25905jKs, C25902jKp c25902jKp, java.util.List list, C25904jKr c25904jKr, C25904jKr c25904jKr2, C25902jKp c25902jKp2, C25902jKp c25902jKp3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c25902jKp = c25905jKs.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c25905jKs.AEQbTJ;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            c25904jKr = c25905jKs.KWHzl;
        }
        C25904jKr c25904jKr3 = c25904jKr;
        if ((i & 8) != 0) {
            c25904jKr2 = c25905jKs.copydefault;
        }
        C25904jKr c25904jKr4 = c25904jKr2;
        if ((i & 16) != 0) {
            c25902jKp2 = c25905jKs.valueOf;
        }
        C25902jKp c25902jKp4 = c25902jKp2;
        if ((i & 32) != 0) {
            c25902jKp3 = c25905jKs.EZpvd;
        }
        return c25905jKs.EZpvd(c25902jKp, list2, c25904jKr3, c25904jKr4, c25902jKp4, c25902jKp3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25902jKp AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25904jKr EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25905jKs EZpvd(@NotNull C25902jKp c25902jKp, @NotNull java.util.List<C25901jKo> list, @NotNull C25904jKr c25904jKr, @NotNull C25904jKr c25904jKr2, @NotNull C25902jKp c25902jKp2, @NotNull C25902jKp c25902jKp3) {
        Intrinsics.checkNotNullParameter(c25902jKp, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c25904jKr, "");
        Intrinsics.checkNotNullParameter(c25904jKr2, "");
        Intrinsics.checkNotNullParameter(c25902jKp2, "");
        Intrinsics.checkNotNullParameter(c25902jKp3, "");
        return new C25905jKs(c25902jKp, list, c25904jKr, c25904jKr2, c25902jKp2, c25902jKp3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25902jKp KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C25901jKo> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25904jKr copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25905jKs)) {
            return false;
        }
        C25905jKs c25905jKs = (C25905jKs) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c25905jKs.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c25905jKs.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c25905jKs.KWHzl) && Intrinsics.EZpvd(this.copydefault, c25905jKs.copydefault) && Intrinsics.EZpvd(this.valueOf, c25905jKs.valueOf) && Intrinsics.EZpvd(this.EZpvd, c25905jKs.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25902jKp gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FundingUserOverViewVo(allFees=" + this.OLrzqt + ", dailyFundingFees=" + this.AEQbTJ + ", lossFundingFee=" + this.KWHzl + ", winFundingFee=" + this.copydefault + ", winFundingTotalFee=" + this.valueOf + ", lossFundingTotalFee=" + this.EZpvd + ")";
    }

    public C25905jKs(@NotNull C25902jKp c25902jKp, @NotNull java.util.List<C25901jKo> list, @NotNull C25904jKr c25904jKr, @NotNull C25904jKr c25904jKr2, @NotNull C25902jKp c25902jKp2, @NotNull C25902jKp c25902jKp3) {
        Intrinsics.checkNotNullParameter(c25902jKp, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c25904jKr, "");
        Intrinsics.checkNotNullParameter(c25904jKr2, "");
        Intrinsics.checkNotNullParameter(c25902jKp2, "");
        Intrinsics.checkNotNullParameter(c25902jKp3, "");
        this.OLrzqt = c25902jKp;
        this.AEQbTJ = list;
        this.KWHzl = c25904jKr;
        this.copydefault = c25904jKr2;
        this.valueOf = c25902jKp2;
        this.EZpvd = c25902jKp3;
    }
}
