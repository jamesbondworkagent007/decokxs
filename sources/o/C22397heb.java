package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22397heb {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22397heb() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22397heb copy$default(C22397heb c22397heb, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c22397heb.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c22397heb.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = c22397heb.KWHzl;
        }
        return c22397heb.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22397heb AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C22397heb(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22397heb)) {
            return false;
        }
        C22397heb c22397heb = (C22397heb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c22397heb.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c22397heb.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c22397heb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransferParamsData(orderId=" + this.copydefault + ", bridgeReceiveAddress=" + this.AEQbTJ + ", encryptReceiveAddress=" + this.KWHzl + ")";
    }

    public C22397heb(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2413) call: o.heb.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C22397heb(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
