package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.beh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C9921beh {
    public final int AEQbTJ;
    public int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C9921beh() {
        this(null, 0, 0, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9921beh copy$default(C9921beh c9921beh, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c9921beh.copydefault;
        }
        if ((i3 & 2) != 0) {
            i = c9921beh.AEQbTJ;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = c9921beh.EZpvd;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = c9921beh.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = c9921beh.KWHzl;
        }
        java.lang.String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = c9921beh.valueOf;
        }
        return c9921beh.OLrzqt(str, i4, i5, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9921beh OLrzqt(@NotNull java.lang.String str, int i, int i2, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C9921beh(str, i, i2, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9921beh)) {
            return false;
        }
        C9921beh c9921beh = (C9921beh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c9921beh.copydefault) && this.AEQbTJ == c9921beh.AEQbTJ && this.EZpvd == c9921beh.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c9921beh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9921beh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c9921beh.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionSubResponse(txId=" + this.copydefault + ", txStatus=" + this.AEQbTJ + ", txType=" + this.EZpvd + ", orderId=" + this.OLrzqt + ", txHash=" + this.KWHzl + ", uOpHash=" + this.valueOf + ")";
    }

    public C9921beh(@NotNull java.lang.String str, int i, int i2, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.AEQbTJ = i;
        this.EZpvd = i2;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.valueOf = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: o.beh.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C9921beh(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
    }
}
