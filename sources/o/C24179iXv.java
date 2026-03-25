package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iXv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24179iXv {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final DisplayText OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24179iXv() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24179iXv copy$default(C24179iXv c24179iXv, DisplayText displayText, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            displayText = c24179iXv.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c24179iXv.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = c24179iXv.AEQbTJ;
        }
        return c24179iXv.KWHzl(displayText, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24179iXv KWHzl(DisplayText displayText, boolean z, boolean z2) {
        return new C24179iXv(displayText, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24179iXv)) {
            return false;
        }
        C24179iXv c24179iXv = (C24179iXv) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c24179iXv.OLrzqt) && this.EZpvd == c24179iXv.EZpvd && this.AEQbTJ == c24179iXv.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DisplayText displayText = this.OLrzqt;
        return ((((displayText == null ? 0 : displayText.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InputError(error=" + this.OLrzqt + ", isBalanceInsufficient=" + this.EZpvd + ", isFeeInsufficient=" + this.AEQbTJ + ")";
    }

    public C24179iXv(DisplayText displayText, boolean z, boolean z2) {
        this.OLrzqt = displayText;
        this.EZpvd = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.DisplayText:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.DisplayText) : (r2v0 com.okinc.business.invest_biz.data.bean.DisplayText))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.business.invest_biz.data.bean.DisplayText, boolean, boolean):void (m)] (LINE:101) call: o.iXv.<init>(com.okinc.business.invest_biz.data.bean.DisplayText, boolean, boolean):void type: THIS */
    public /* synthetic */ C24179iXv(DisplayText displayText, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : displayText, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
