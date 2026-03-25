package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.iPi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23950iPi {
    public final boolean KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23950iPi copy$default(C23950iPi c23950iPi, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23950iPi.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c23950iPi.KWHzl;
        }
        return c23950iPi.OLrzqt(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23950iPi OLrzqt(boolean z, boolean z2) {
        return new C23950iPi(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23950iPi)) {
            return false;
        }
        C23950iPi c23950iPi = (C23950iPi) obj;
        return this.OLrzqt == c23950iPi.OLrzqt && this.KWHzl == c23950iPi.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestInputBottomButtonUIBean(isEnable=" + this.OLrzqt + ", isInsufficientSupply=" + this.KWHzl + ")";
    }

    public C23950iPi(boolean z, boolean z2) {
        this.OLrzqt = z;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:24) call: o.iPi.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ C23950iPi(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2);
    }
}
