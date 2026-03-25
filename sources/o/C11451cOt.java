package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11451cOt {
    public int AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C11451cOt() {
        this(null, 0, null, 0L, 0, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11451cOt copy$default(C11451cOt c11451cOt, java.lang.String str, int i, java.lang.String str2, long j, int i2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c11451cOt.AhwBna;
        }
        if ((i3 & 2) != 0) {
            i = c11451cOt.AEQbTJ;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = c11451cOt.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i3 & 8) != 0) {
            j = c11451cOt.KWHzl;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            i2 = c11451cOt.copydefault;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            str3 = c11451cOt.EZpvd;
        }
        return c11451cOt.KWHzl(str, i4, str4, j2, i5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11451cOt KWHzl(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, long j, int i2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C11451cOt(str, i, str2, j, i2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11451cOt)) {
            return false;
        }
        C11451cOt c11451cOt = (C11451cOt) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c11451cOt.AhwBna) && this.AEQbTJ == c11451cOt.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11451cOt.OLrzqt) && this.KWHzl == c11451cOt.KWHzl && this.copydefault == c11451cOt.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11451cOt.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AhwBna.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageItemEntity(walletId=" + this.AhwBna + ", id=" + this.AEQbTJ + ", rowId=" + this.OLrzqt + ", timestamp=" + this.KWHzl + ", read=" + this.copydefault + ", msg=" + this.EZpvd + ")";
    }

    public C11451cOt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, long j, int i2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AhwBna = str;
        this.AEQbTJ = i;
        this.OLrzqt = str2;
        this.KWHzl = j;
        this.copydefault = i2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:long:0x001e: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r12v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, long, int, java.lang.String):void (m)] (LINE:18) call: o.cOt.<init>(java.lang.String, int, java.lang.String, long, int, java.lang.String):void type: THIS */
    public /* synthetic */ C11451cOt(java.lang.String str, int i, java.lang.String str2, long j, int i2, java.lang.String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0L : j, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? "" : str3);
    }
}
