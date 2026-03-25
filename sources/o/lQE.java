package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQE {
    public final C30235lQw AEQbTJ;
    public final lQC EZpvd;
    public final C30236lQx KWHzl;
    public final C30238lQz OLrzqt;
    public final C30237lQy copydefault;
    public final lQB djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lQE copy$default(lQE lqe, C30236lQx c30236lQx, lQB lqb, lQC lqc, C30235lQw c30235lQw, C30237lQy c30237lQy, C30238lQz c30238lQz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c30236lQx = lqe.KWHzl;
        }
        if ((i & 2) != 0) {
            lqb = lqe.djBIcL;
        }
        lQB lqb2 = lqb;
        if ((i & 4) != 0) {
            lqc = lqe.EZpvd;
        }
        lQC lqc2 = lqc;
        if ((i & 8) != 0) {
            c30235lQw = lqe.AEQbTJ;
        }
        C30235lQw c30235lQw2 = c30235lQw;
        if ((i & 16) != 0) {
            c30237lQy = lqe.copydefault;
        }
        C30237lQy c30237lQy2 = c30237lQy;
        if ((i & 32) != 0) {
            c30238lQz = lqe.OLrzqt;
        }
        return lqe.copydefault(c30236lQx, lqb2, lqc2, c30235lQw2, c30237lQy2, c30238lQz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30236lQx AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQB AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30235lQw EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30238lQz KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30237lQy OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQC copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQE copydefault(@NotNull C30236lQx c30236lQx, @NotNull lQB lqb, @NotNull lQC lqc, @NotNull C30235lQw c30235lQw, @NotNull C30237lQy c30237lQy, @NotNull C30238lQz c30238lQz) {
        Intrinsics.checkNotNullParameter(c30236lQx, "");
        Intrinsics.checkNotNullParameter(lqb, "");
        Intrinsics.checkNotNullParameter(lqc, "");
        Intrinsics.checkNotNullParameter(c30235lQw, "");
        Intrinsics.checkNotNullParameter(c30237lQy, "");
        Intrinsics.checkNotNullParameter(c30238lQz, "");
        return new lQE(c30236lQx, lqb, lqc, c30235lQw, c30237lQy, c30238lQz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lQE)) {
            return false;
        }
        lQE lqe = (lQE) obj;
        return Intrinsics.EZpvd(this.KWHzl, lqe.KWHzl) && Intrinsics.EZpvd(this.djBIcL, lqe.djBIcL) && Intrinsics.EZpvd(this.EZpvd, lqe.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, lqe.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, lqe.copydefault) && Intrinsics.EZpvd(this.OLrzqt, lqe.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.KWHzl.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailUiModel(banner=" + this.KWHzl + ", summary=" + this.djBIcL + ", pnl=" + this.EZpvd + ", actions=" + this.AEQbTJ + ", orders=" + this.copydefault + ", frequency=" + this.OLrzqt + ")";
    }

    public lQE(@NotNull C30236lQx c30236lQx, @NotNull lQB lqb, @NotNull lQC lqc, @NotNull C30235lQw c30235lQw, @NotNull C30237lQy c30237lQy, @NotNull C30238lQz c30238lQz) {
        Intrinsics.checkNotNullParameter(c30236lQx, "");
        Intrinsics.checkNotNullParameter(lqb, "");
        Intrinsics.checkNotNullParameter(lqc, "");
        Intrinsics.checkNotNullParameter(c30235lQw, "");
        Intrinsics.checkNotNullParameter(c30237lQy, "");
        Intrinsics.checkNotNullParameter(c30238lQz, "");
        this.KWHzl = c30236lQx;
        this.djBIcL = lqb;
        this.EZpvd = lqc;
        this.AEQbTJ = c30235lQw;
        this.copydefault = c30237lQy;
        this.OLrzqt = c30238lQz;
    }
}
