package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eFL {
    public final java.lang.Integer KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eFL copy$default(eFL efl, int i, java.lang.String str, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = efl.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = efl.copydefault;
        }
        if ((i2 & 4) != 0) {
            num = efl.KWHzl;
        }
        return efl.OLrzqt(i, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFL OLrzqt(int i, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new eFL(i, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eFL)) {
            return false;
        }
        eFL efl = (eFL) obj;
        return this.OLrzqt == efl.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) efl.copydefault) && Intrinsics.EZpvd(this.KWHzl, efl.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.Integer num = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HardWareSelectConnectType(connectIconRes=" + this.OLrzqt + ", connectDes=" + this.copydefault + ", connectType=" + this.KWHzl + ")";
    }

    public eFL(int i, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = i;
        this.copydefault = str;
        this.KWHzl = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(int, java.lang.String, java.lang.Integer):void (m)] (LINE:10) call: o.eFL.<init>(int, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ eFL(int i, java.lang.String str, java.lang.Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : num);
    }
}
