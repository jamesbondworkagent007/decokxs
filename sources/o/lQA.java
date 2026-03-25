package o;

import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lQA {
    public final OKCRTrend AEQbTJ;
    public final int KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public lQA() {
        this(null, false, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ lQA copy$default(lQA lqa, OKCRTrend oKCRTrend, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            oKCRTrend = lqa.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            z = lqa.copydefault;
        }
        if ((i2 & 4) != 0) {
            i = lqa.KWHzl;
        }
        return lqa.EZpvd(oKCRTrend, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCRTrend AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQA EZpvd(@NotNull OKCRTrend oKCRTrend, boolean z, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(oKCRTrend, "");
        return new lQA(oKCRTrend, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
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
        if (!(obj instanceof lQA)) {
            return false;
        }
        lQA lqa = (lQA) obj;
        return this.AEQbTJ == lqa.AEQbTJ && this.copydefault == lqa.copydefault && this.KWHzl == lqa.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPnlBlockTitleColor(trend=" + this.AEQbTJ + ", useTrend=" + this.copydefault + ", fallbackColor=" + this.KWHzl + ")";
    }

    public lQA(@NotNull OKCRTrend oKCRTrend, boolean z, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(oKCRTrend, "");
        this.AEQbTJ = oKCRTrend;
        this.copydefault = z;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.cruilib.view.listitem.share.OKCRTrend:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.cruilib.view.listitem.share.OKCRTrend:0x0004: SGET  A[WRAPPED] (LINE:22) com.okinc.cruilib.view.listitem.share.OKCRTrend.FLAT com.okinc.cruilib.view.listitem.share.OKCRTrend) : (r1v0 com.okinc.cruilib.view.listitem.share.OKCRTrend))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, int):void (m)] (LINE:21) call: o.lQA.<init>(com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, int):void type: THIS */
    public /* synthetic */ lQA(OKCRTrend oKCRTrend, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OKCRTrend.FLAT : oKCRTrend, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i);
    }
}
