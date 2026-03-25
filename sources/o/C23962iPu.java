package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23962iPu {
    public final boolean EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23962iPu copy$default(C23962iPu c23962iPu, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23962iPu.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c23962iPu.KWHzl;
        }
        return c23962iPu.EZpvd(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23962iPu EZpvd(boolean z, java.lang.String str) {
        return new C23962iPu(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23962iPu)) {
            return false;
        }
        C23962iPu c23962iPu = (C23962iPu) obj;
        return this.EZpvd == c23962iPu.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23962iPu.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.String str = this.KWHzl;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3InputBottomButtonUIBean(isEnable=" + this.EZpvd + ", buttonText=" + this.KWHzl + ")";
    }

    public C23962iPu(boolean z, java.lang.String str) {
        this.EZpvd = z;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(boolean, java.lang.String):void (m)] (LINE:75) call: o.iPu.<init>(boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C23962iPu(boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
