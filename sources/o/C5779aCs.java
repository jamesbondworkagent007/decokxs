package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aCs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5779aCs {
    public final kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>> AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5779aCs() {
        this(false, null, null, null, null, false, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.aCs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5779aCs copy$default(C5779aCs c5779aCs, boolean z, java.lang.String str, java.lang.String str2, kotlin.Pair pair, java.lang.String str3, boolean z2, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c5779aCs.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c5779aCs.copydefault;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c5779aCs.gEmmrt;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            pair = c5779aCs.AEQbTJ;
        }
        kotlin.Pair pair2 = pair;
        if ((i & 16) != 0) {
            str3 = c5779aCs.valueOf;
        }
        java.lang.String str7 = str3;
        if ((i & 32) != 0) {
            z2 = c5779aCs.EZpvd;
        }
        boolean z3 = z2;
        if ((i & 64) != 0) {
            str4 = c5779aCs.OLrzqt;
        }
        return c5779aCs.EZpvd(z, str5, str6, pair2, str7, z3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5779aCs EZpvd(boolean z, java.lang.String str, java.lang.String str2, kotlin.Pair<java.lang.Integer, ? extends java.util.Map<java.lang.String, java.lang.String>> pair, java.lang.String str3, boolean z2, java.lang.String str4) {
        return new C5779aCs(z, str, str2, pair, str3, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5779aCs)) {
            return false;
        }
        C5779aCs c5779aCs = (C5779aCs) obj;
        return this.KWHzl == c5779aCs.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c5779aCs.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c5779aCs.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, c5779aCs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c5779aCs.valueOf) && this.EZpvd == c5779aCs.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c5779aCs.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gEmmrt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>> pair = this.AEQbTJ;
        int iHashCode4 = pair == null ? 0 : pair.hashCode();
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.String str4 = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaUiState(loading=" + this.KWHzl + ", errorMessage=" + this.copydefault + ", title=" + this.gEmmrt + ", subTitle=" + this.AEQbTJ + ", subTitleInBlack=" + this.valueOf + ", showResendButton=" + this.EZpvd + ", contentDescription=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.Pair<java.lang.Integer, ? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5779aCs(boolean z, java.lang.String str, java.lang.String str2, kotlin.Pair<java.lang.Integer, ? extends java.util.Map<java.lang.String, java.lang.String>> pair, java.lang.String str3, boolean z2, java.lang.String str4) {
        this.KWHzl = z;
        this.copydefault = str;
        this.gEmmrt = str2;
        this.AEQbTJ = pair;
        this.valueOf = str3;
        this.EZpvd = z2;
        this.OLrzqt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r10v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Integer, ? extends java.util.Map<java.lang.String, java.lang.String>>, java.lang.String, boolean, java.lang.String):void (m)] (LINE:3) call: o.aCs.<init>(boolean, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C5779aCs(boolean z, java.lang.String str, java.lang.String str2, kotlin.Pair pair, java.lang.String str3, boolean z2, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : pair, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : str4);
    }
}
