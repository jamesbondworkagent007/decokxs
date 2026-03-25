package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWN {
    public java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public java.lang.Boolean OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pWN copy$default(pWN pwn, int i, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = pwn.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = pwn.KWHzl;
        }
        if ((i2 & 4) != 0) {
            bool = pwn.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            str2 = pwn.AEQbTJ;
        }
        return pwn.OLrzqt(i, str, bool, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pWN OLrzqt(int i, @NotNull java.lang.String str, java.lang.Boolean bool, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new pWN(i, str, bool, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pWN)) {
            return false;
        }
        pWN pwn = (pWN) obj;
        return this.copydefault == pwn.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pwn.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, pwn.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pwn.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.copydefault);
        int iHashCode2 = this.KWHzl.hashCode();
        java.lang.Boolean bool = this.OLrzqt;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketTab(title=" + this.copydefault + ", instType=" + this.KWHzl + ", isScroll=" + this.OLrzqt + ", e2eContentDescription=" + this.AEQbTJ + ")";
    }

    public pWN(int i, @NotNull java.lang.String str, java.lang.Boolean bool, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = i;
        this.KWHzl = str;
        this.OLrzqt = bool;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:3) call: o.pWN.<init>(int, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ pWN(int i, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i2 & 8) != 0 ? "" : str2);
    }
}
