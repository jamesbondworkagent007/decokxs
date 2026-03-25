package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQC {
    public final lQF EZpvd;
    public final lQF KWHzl;
    public final lQF OLrzqt;
    public final lQF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lQC copy$default(lQC lqc, lQF lqf, lQF lqf2, lQF lqf3, lQF lqf4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lqf = lqc.copydefault;
        }
        if ((i & 2) != 0) {
            lqf2 = lqc.EZpvd;
        }
        if ((i & 4) != 0) {
            lqf3 = lqc.OLrzqt;
        }
        if ((i & 8) != 0) {
            lqf4 = lqc.KWHzl;
        }
        return lqc.EZpvd(lqf, lqf2, lqf3, lqf4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQC EZpvd(@NotNull lQF lqf, @NotNull lQF lqf2, @NotNull lQF lqf3, @NotNull lQF lqf4) {
        Intrinsics.checkNotNullParameter(lqf, "");
        Intrinsics.checkNotNullParameter(lqf2, "");
        Intrinsics.checkNotNullParameter(lqf3, "");
        Intrinsics.checkNotNullParameter(lqf4, "");
        return new lQC(lqf, lqf2, lqf3, lqf4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQF EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQF KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQF OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQF copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lQC)) {
            return false;
        }
        lQC lqc = (lQC) obj;
        return Intrinsics.EZpvd(this.copydefault, lqc.copydefault) && Intrinsics.EZpvd(this.EZpvd, lqc.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, lqc.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, lqc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPnlUiModel(averagePrice=" + this.copydefault + ", currentPrice=" + this.EZpvd + ", totalPaymentAmount=" + this.OLrzqt + ", performance=" + this.KWHzl + ")";
    }

    public lQC(@NotNull lQF lqf, @NotNull lQF lqf2, @NotNull lQF lqf3, @NotNull lQF lqf4) {
        Intrinsics.checkNotNullParameter(lqf, "");
        Intrinsics.checkNotNullParameter(lqf2, "");
        Intrinsics.checkNotNullParameter(lqf3, "");
        Intrinsics.checkNotNullParameter(lqf4, "");
        this.copydefault = lqf;
        this.EZpvd = lqf2;
        this.OLrzqt = lqf3;
        this.KWHzl = lqf4;
    }
}
