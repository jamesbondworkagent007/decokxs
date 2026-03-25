package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46455tUz {
    public final java.lang.String AEQbTJ;
    public final java.lang.Boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46455tUz() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46455tUz copy$default(C46455tUz c46455tUz, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = c46455tUz.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c46455tUz.OLrzqt;
        }
        if ((i & 4) != 0) {
            bool2 = c46455tUz.copydefault;
        }
        if ((i & 8) != 0) {
            str2 = c46455tUz.AEQbTJ;
        }
        return c46455tUz.KWHzl(bool, str, bool2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46455tUz KWHzl(java.lang.Boolean bool, @NotNull java.lang.String str, java.lang.Boolean bool2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C46455tUz(bool, str, bool2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46455tUz)) {
            return false;
        }
        C46455tUz c46455tUz = (C46455tUz) obj;
        return Intrinsics.EZpvd(this.KWHzl, c46455tUz.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46455tUz.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c46455tUz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46455tUz.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.Boolean bool2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinPairItem(showAll=" + this.KWHzl + ", allText=" + this.OLrzqt + ", showAllCoinPairs=" + this.copydefault + ", allCoinPairText=" + this.AEQbTJ + ")";
    }

    public C46455tUz(java.lang.Boolean bool, @NotNull java.lang.String str, java.lang.Boolean bool2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = bool;
        this.OLrzqt = str;
        this.copydefault = bool2;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000c: INVOKE (wrap:int:0x000a: SGET  A[WRAPPED] o.trL.Fragment.DAIeex int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:735)) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0014: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x001c: INVOKE (wrap:int:0x001a: SGET  A[WRAPPED] o.xof.Application.getLaunchPendingIntent int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:737)) : (r4v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:733) call: o.tUz.<init>(java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C46455tUz(java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? java.lang.Boolean.TRUE : bool, (i & 2) != 0 ? C33070mpX.AYXKKw(C47501trL.Fragment.DAIeex) : str, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 8) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.getLaunchPendingIntent) : str2);
    }
}
