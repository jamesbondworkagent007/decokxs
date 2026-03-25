package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.iDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23621iDd {
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23621iDd copy$default(C23621iDd c23621iDd, long j, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c23621iDd.copydefault;
        }
        if ((i & 2) != 0) {
            z = c23621iDd.OLrzqt;
        }
        if ((i & 4) != 0) {
            z2 = c23621iDd.KWHzl;
        }
        return c23621iDd.copydefault(j, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23621iDd copydefault(long j, boolean z, boolean z2) {
        return new C23621iDd(j, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23621iDd)) {
            return false;
        }
        C23621iDd c23621iDd = (C23621iDd) obj;
        return this.copydefault == c23621iDd.copydefault && this.OLrzqt == c23621iDd.OLrzqt && this.KWHzl == c23621iDd.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InitialInfoKey(investmentId=" + this.copydefault + ", isSingle=" + this.OLrzqt + ", openZap=" + this.KWHzl + ")";
    }

    public C23621iDd(long j, boolean z, boolean z2) {
        this.copydefault = j;
        this.OLrzqt = z;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (r3v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(long, boolean, boolean):void (m)] (LINE:3) call: o.iDd.<init>(long, boolean, boolean):void type: THIS */
    public /* synthetic */ C23621iDd(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, (i & 4) != 0 ? false : z2);
    }
}
