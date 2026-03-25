package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10303bls {
    public final java.lang.String AEQbTJ;
    public final int AhwBna;
    public final int EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10303bls() {
        this(null, null, 0, 0L, 0, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10303bls copy$default(C10303bls c10303bls, java.lang.String str, java.lang.String str2, int i, long j, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c10303bls.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            str2 = c10303bls.AEQbTJ;
        }
        java.lang.String str3 = str2;
        if ((i3 & 4) != 0) {
            i = c10303bls.AhwBna;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            j = c10303bls.KWHzl;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            i2 = c10303bls.EZpvd;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = c10303bls.copydefault;
        }
        return c10303bls.OLrzqt(str, str3, i4, j2, i5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10303bls OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, long j, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C10303bls(str, str2, i, j, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10303bls)) {
            return false;
        }
        C10303bls c10303bls = (C10303bls) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10303bls.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c10303bls.AEQbTJ) && this.AhwBna == c10303bls.AhwBna && this.KWHzl == c10303bls.KWHzl && this.EZpvd == c10303bls.EZpvd && this.copydefault == c10303bls.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UtxoItemDisplay(key=" + this.OLrzqt + ", txnHash=" + this.AEQbTJ + ", vout=" + this.AhwBna + ", coinAmount=" + this.KWHzl + ", txnStatus=" + this.EZpvd + ", isSelected=" + this.copydefault + ")";
    }

    public C10303bls(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, long j, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.AhwBna = i;
        this.KWHzl = j;
        this.EZpvd = i2;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:long:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:int:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r11v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, long, int, boolean):void (m)] (LINE:7) call: o.bls.<init>(java.lang.String, java.lang.String, int, long, int, boolean):void type: THIS */
    public /* synthetic */ C10303bls(java.lang.String str, java.lang.String str2, int i, long j, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? false : z);
    }
}
