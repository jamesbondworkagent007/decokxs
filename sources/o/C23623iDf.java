package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23623iDf {
    public final C23631iDn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final C23630iDm OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23623iDf() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23623iDf copy$default(C23623iDf c23623iDf, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, C23631iDn c23631iDn, C23630iDm c23630iDm, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23623iDf.AYXKKw;
        }
        if ((i & 2) != 0) {
            str2 = c23623iDf.djBIcL;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c23623iDf.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = c23623iDf.EZpvd;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            c23631iDn = c23623iDf.AEQbTJ;
        }
        C23631iDn c23631iDn2 = c23631iDn;
        if ((i & 32) != 0) {
            c23630iDm = c23623iDf.OLrzqt;
        }
        C23630iDm c23630iDm2 = c23630iDm;
        if ((i & 64) != 0) {
            z2 = c23623iDf.KWHzl;
        }
        return c23623iDf.EZpvd(str, str4, str5, z3, c23631iDn2, c23630iDm2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23631iDn AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23623iDf EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull C23631iDn c23631iDn, @NotNull C23630iDm c23630iDm, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c23631iDn, "");
        Intrinsics.checkNotNullParameter(c23630iDm, "");
        return new C23623iDf(str, str2, str3, z, c23631iDn, c23630iDm, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23623iDf)) {
            return false;
        }
        C23623iDf c23623iDf = (C23623iDf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c23623iDf.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c23623iDf.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23623iDf.copydefault) && this.EZpvd == c23623iDf.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c23623iDf.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c23623iDf.OLrzqt) && this.KWHzl == c23623iDf.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AYXKKw.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenInfo(tokenSymbol=" + this.AYXKKw + ", tokenName=" + this.djBIcL + ", tokenLogo=" + this.copydefault + ", isBaseToken=" + this.EZpvd + ", onChainMetadata=" + this.AEQbTJ + ", price=" + this.OLrzqt + ", hasDexDetails=" + this.KWHzl + ")";
    }

    public C23623iDf(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull C23631iDn c23631iDn, @NotNull C23630iDm c23630iDm, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c23631iDn, "");
        Intrinsics.checkNotNullParameter(c23630iDm, "");
        this.AYXKKw = str;
        this.djBIcL = str2;
        this.copydefault = str3;
        this.EZpvd = z;
        this.AEQbTJ = c23631iDn;
        this.OLrzqt = c23630iDm;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:o.iDn:0x0028: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iDn:0x0024: INVOKE (wrap:o.iDn$StateListAnimator:0x0022: SGET  A[WRAPPED] (LINE:8) o.iDn.Companion o.iDn$StateListAnimator) VIRTUAL call: o.iDn.StateListAnimator.OLrzqt():o.iDn A[MD:():o.iDn (m), WRAPPED] (LINE:8)) : (r10v0 o.iDn))
  (wrap:o.iDm:0x0033: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iDm:0x002f: INVOKE (wrap:o.iDm$TaskDescription:0x002d: SGET  A[WRAPPED] (LINE:9) o.iDm.Companion o.iDm$TaskDescription) VIRTUAL call: o.iDm.TaskDescription.KWHzl():o.iDm A[MD:():o.iDm (m), WRAPPED] (LINE:9)) : (r11v0 o.iDm))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, o.iDn, o.iDm, boolean):void (m)] (LINE:3) call: o.iDf.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, o.iDn, o.iDm, boolean):void type: THIS */
    public /* synthetic */ C23623iDf(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, C23631iDn c23631iDn, C23630iDm c23630iDm, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? C23631iDn.Companion.OLrzqt() : c23631iDn, (i & 32) != 0 ? C23630iDm.Companion.KWHzl() : c23630iDm, (i & 64) != 0 ? false : z2);
    }
}
