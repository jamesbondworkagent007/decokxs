package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tgt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46955tgt {
    public java.lang.Long AEQbTJ;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46955tgt() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46955tgt copy$default(C46955tgt c46955tgt, java.lang.Long l, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c46955tgt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c46955tgt.OLrzqt;
        }
        return c46955tgt.AEQbTJ(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46955tgt AEQbTJ(java.lang.Long l, java.lang.String str) {
        return new C46955tgt(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46955tgt)) {
            return false;
        }
        C46955tgt c46955tgt = (C46955tgt) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c46955tgt.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46955tgt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.AEQbTJ;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PushIMRefresh(pushTime=" + this.AEQbTJ + ", type=" + this.OLrzqt + ")";
    }

    public C46955tgt(java.lang.Long l, java.lang.String str) {
        this.AEQbTJ = l;
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String):void (m)] (LINE:24) call: o.tgt.<init>(java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C46955tgt(java.lang.Long l, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? null : str);
    }
}
