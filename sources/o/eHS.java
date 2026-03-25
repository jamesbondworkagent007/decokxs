package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C13754dXa;

/* JADX INFO: loaded from: classes5.dex */
public final class eHS {
    public final boolean EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eHS() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eHS copy$default(eHS ehs, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = ehs.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            z = ehs.EZpvd;
        }
        return ehs.KWHzl(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eHS KWHzl(@androidx.annotation.StringRes int i, boolean z) {
        return new eHS(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eHS)) {
            return false;
        }
        eHS ehs = (eHS) obj;
        return this.OLrzqt == ehs.OLrzqt && this.EZpvd == ehs.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckDeviceStatusState(headerTitle=" + this.OLrzqt + ", isLoading=" + this.EZpvd + ")";
    }

    public eHS(@androidx.annotation.StringRes int i, boolean z) {
        this.OLrzqt = i;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dXa.FragmentManager.isCompatVectorFromResourcesEnabled int) : (r1v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:19) call: o.eHS.<init>(int, boolean):void type: THIS */
    public /* synthetic */ eHS(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13754dXa.FragmentManager.isCompatVectorFromResourcesEnabled : i, (i2 & 2) != 0 ? true : z);
    }
}
