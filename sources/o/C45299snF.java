package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.snF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45299snF {
    public final int EZpvd;
    public final boolean KWHzl;
    public final java.lang.Boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45299snF copy$default(C45299snF c45299snF, int i, boolean z, java.lang.Boolean bool, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c45299snF.EZpvd;
        }
        if ((i2 & 2) != 0) {
            z = c45299snF.KWHzl;
        }
        if ((i2 & 4) != 0) {
            bool = c45299snF.OLrzqt;
        }
        return c45299snF.copydefault(i, z, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45299snF copydefault(int i, boolean z, java.lang.Boolean bool) {
        return new C45299snF(i, z, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45299snF)) {
            return false;
        }
        C45299snF c45299snF = (C45299snF) obj;
        return this.EZpvd == c45299snF.EZpvd && this.KWHzl == c45299snF.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c45299snF.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Boolean bool = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CurrencyModel(currencyId=" + this.EZpvd + ", isUntradable=" + this.KWHzl + ", isOnChain=" + this.OLrzqt + ")";
    }

    public C45299snF(int i, boolean z, java.lang.Boolean bool) {
        this.EZpvd = i;
        this.KWHzl = z;
        this.OLrzqt = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(int, boolean, java.lang.Boolean):void (m)] (LINE:3) call: o.snF.<init>(int, boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C45299snF(int i, boolean z, java.lang.Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? null : bool);
    }
}
