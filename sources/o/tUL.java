package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tUL {
    public final java.lang.Object AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Object KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public tUL() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ tUL copy$default(tUL tul, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = tul.KWHzl;
        }
        if ((i & 2) != 0) {
            obj2 = tul.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str = tul.EZpvd;
        }
        if ((i & 8) != 0) {
            str2 = tul.copydefault;
        }
        return tul.EZpvd(obj, obj2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final tUL EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        return new tUL(obj, obj2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tUL)) {
            return false;
        }
        tUL tul = (tUL) obj;
        return Intrinsics.EZpvd(this.KWHzl, tul.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, tul.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) tul.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) tul.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Object obj = this.KWHzl;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.AEQbTJ;
        int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterGroup(data=" + this.KWHzl + ", placeKey=" + this.AEQbTJ + ", parentUniqueKey=" + this.EZpvd + ", uniqueKey=" + this.copydefault + ")";
    }

    public tUL(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2) {
        this.KWHzl = obj;
        this.AEQbTJ = obj2;
        this.EZpvd = str;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Object, java.lang.Object, java.lang.String, java.lang.String):void (m)] (LINE:740) call: o.tUL.<init>(java.lang.Object, java.lang.Object, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ tUL(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
