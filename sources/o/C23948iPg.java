package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23948iPg {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23948iPg copy$default(C23948iPg c23948iPg, boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23948iPg.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c23948iPg.EZpvd;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            z2 = c23948iPg.OLrzqt;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = c23948iPg.KWHzl;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            z4 = c23948iPg.copydefault;
        }
        return c23948iPg.AEQbTJ(z, str2, z5, z6, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23948iPg AEQbTJ(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C23948iPg(z, str, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23948iPg)) {
            return false;
        }
        C23948iPg c23948iPg = (C23948iPg) obj;
        return this.AEQbTJ == c23948iPg.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23948iPg.EZpvd) && this.OLrzqt == c23948iPg.OLrzqt && this.KWHzl == c23948iPg.KWHzl && this.copydefault == c23948iPg.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestKeyBoardUIBean(isClearInput=" + this.AEQbTJ + ", inputContent=" + this.EZpvd + ", isReShow=" + this.OLrzqt + ", isForceHide=" + this.KWHzl + ", showPrecisionTips=" + this.copydefault + ")";
    }

    public C23948iPg(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = z;
        this.EZpvd = str;
        this.OLrzqt = z2;
        this.KWHzl = z3;
        this.copydefault = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r7v0 boolean)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:16) call: o.iPg.<init>(boolean, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C23948iPg(boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
    }
}
