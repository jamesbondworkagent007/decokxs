package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fLJ {
    public boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final long KWHzl;
    public final int OLrzqt;
    public boolean copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ fLJ copy$default(fLJ flj, java.lang.String str, int i, long j, java.lang.String str2, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = flj.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = flj.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = flj.KWHzl;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            str2 = flj.gEmmrt;
        }
        java.lang.String str3 = str2;
        if ((i2 & 16) != 0) {
            z = flj.AEQbTJ;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = flj.copydefault;
        }
        return flj.copydefault(str, i3, j2, str3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final fLJ copydefault(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new fLJ(str, i, j, str2, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fLJ)) {
            return false;
        }
        fLJ flj = (fLJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) flj.EZpvd) && this.OLrzqt == flj.OLrzqt && this.KWHzl == flj.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) flj.gEmmrt) && this.AEQbTJ == flj.AEQbTJ && this.copydefault == flj.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EscapeSetAddressData(chainGroupName=" + this.EZpvd + ", chainType=" + this.OLrzqt + ", chainIndex=" + this.KWHzl + ", newAddress=" + this.gEmmrt + ", isAddressValid=" + this.AEQbTJ + ", hasEnteredAddress=" + this.copydefault + ")";
    }

    public fLJ(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = i;
        this.KWHzl = j;
        this.gEmmrt = str2;
        this.AEQbTJ = z;
        this.copydefault = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 int)
  (r12v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, int, long, java.lang.String, boolean, boolean):void (m)] (LINE:9) call: o.fLJ.<init>(java.lang.String, int, long, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ fLJ(java.lang.String str, int i, long j, java.lang.String str2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }
}
