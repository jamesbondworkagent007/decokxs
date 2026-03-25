package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQF {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final lQA OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lQF copy$default(lQF lqf, java.lang.String str, lQA lqa, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = lqf.EZpvd;
        }
        if ((i2 & 2) != 0) {
            lqa = lqf.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            str2 = lqf.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            i = lqf.KWHzl;
        }
        return lqf.KWHzl(str, lqa, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQF KWHzl(@NotNull java.lang.String str, @NotNull lQA lqa, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lqa, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new lQF(str, lqa, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQA OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lQF)) {
            return false;
        }
        lQF lqf = (lQF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) lqf.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, lqf.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) lqf.AEQbTJ) && this.KWHzl == lqf.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPnlBlockUiModel(title=" + this.EZpvd + ", titleColor=" + this.OLrzqt + ", subtitle=" + this.AEQbTJ + ", iconId=" + this.KWHzl + ")";
    }

    public lQF(@NotNull java.lang.String str, @NotNull lQA lqa, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lqa, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = lqa;
        this.AEQbTJ = str2;
        this.KWHzl = i;
    }
}
