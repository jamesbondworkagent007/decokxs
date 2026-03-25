package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.oqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37243oqE {
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37243oqE copy$default(C37243oqE c37243oqE, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c37243oqE.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = c37243oqE.KWHzl;
        }
        if ((i4 & 4) != 0) {
            i3 = c37243oqE.EZpvd;
        }
        return c37243oqE.OLrzqt(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37243oqE OLrzqt(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, int i3) {
        return new C37243oqE(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37243oqE)) {
            return false;
        }
        C37243oqE c37243oqE = (C37243oqE) obj;
        return this.OLrzqt == c37243oqE.OLrzqt && this.KWHzl == c37243oqE.KWHzl && this.EZpvd == c37243oqE.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ContactListEmptyState(titleRes=" + this.OLrzqt + ", descriptionRes=" + this.KWHzl + ", buttonTextRes=" + this.EZpvd + ")";
    }

    public C37243oqE(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, int i3) {
        this.OLrzqt = i;
        this.KWHzl = i2;
        this.EZpvd = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int, int):void (m)] (LINE:5) call: o.oqE.<init>(int, int, int):void type: THIS */
    public /* synthetic */ C37243oqE(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
