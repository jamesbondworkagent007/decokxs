package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCB implements InterfaceC47221tlu {
    public final boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public double EZpvd;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public double gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uCB copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.lang.String str5, double d, java.lang.String str6, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new uCB(str, str2, str3, str4, z, str5, d, str6, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uCB)) {
            return false;
        }
        uCB ucb = (uCB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ucb.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) ucb.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) ucb.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ucb.copydefault) && this.AEQbTJ == ucb.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ucb.OLrzqt) && java.lang.Double.compare(this.EZpvd, ucb.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) ucb.AYXKKw) && java.lang.Double.compare(this.gEmmrt, ucb.gEmmrt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public java.lang.String getPrimary() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public java.lang.String getSecondary() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.OLrzqt;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = java.lang.Double.hashCode(this.EZpvd);
        java.lang.String str2 = this.AYXKKw;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Double.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.EZpvd = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.gEmmrt = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoUiModel(instId=" + this.KWHzl + ", url=" + this.AhwBna + ", shortName=" + this.valueOf + ", longName=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ", primary=" + this.OLrzqt + ", primarySimilarity=" + this.EZpvd + ", secondary=" + this.AYXKKw + ", secondarySimilarity=" + this.gEmmrt + ")";
    }

    public uCB(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.lang.String str5, double d, java.lang.String str6, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = str;
        this.AhwBna = str2;
        this.valueOf = str3;
        this.copydefault = str4;
        this.AEQbTJ = z;
        this.OLrzqt = str5;
        this.EZpvd = d;
        this.AYXKKw = str6;
        this.gEmmrt = d2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (r18v0 java.lang.String) : (r20v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0014: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r21v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (r18v0 java.lang.String) : (r23v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0027: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r24v0 double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, double, java.lang.String, double):void (m)] (LINE:5) call: o.uCB.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, double, java.lang.String, double):void type: THIS */
    public /* synthetic */ uCB(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, double d, java.lang.String str6, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? str4 : str5, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? str4 : str6, (i & 256) != 0 ? 0.0d : d2);
    }
}
