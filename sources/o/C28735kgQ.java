package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28735kgQ {
    public final boolean AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28735kgQ() {
        this(false, null, false, false, false, null, false, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28735kgQ EZpvd(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str2, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C28735kgQ(z, str, z2, z3, z4, str2, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28735kgQ)) {
            return false;
        }
        C28735kgQ c28735kgQ = (C28735kgQ) obj;
        return this.gEmmrt == c28735kgQ.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28735kgQ.EZpvd) && this.OLrzqt == c28735kgQ.OLrzqt && this.copydefault == c28735kgQ.copydefault && this.djBIcL == c28735kgQ.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c28735kgQ.AhwBna) && this.KWHzl == c28735kgQ.KWHzl && this.AEQbTJ == c28735kgQ.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.gEmmrt) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TranslationUiState(showMainTranslation=" + this.gEmmrt + ", mainTranslatedText=" + this.EZpvd + ", isMainTranslating=" + this.OLrzqt + ", mainTranslateError=" + this.copydefault + ", showQuoteTranslation=" + this.djBIcL + ", quoteTranslatedText=" + this.AhwBna + ", isQuoteTranslating=" + this.KWHzl + ", quoteTranslateError=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.OLrzqt;
    }

    public C28735kgQ(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str2, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt = z;
        this.EZpvd = str;
        this.OLrzqt = z2;
        this.copydefault = z3;
        this.djBIcL = z4;
        this.AhwBna = str2;
        this.KWHzl = z5;
        this.AEQbTJ = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
 A[MD:(boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:28) call: o.kgQ.<init>(boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ C28735kgQ(boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, java.lang.String str2, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? str2 : "", (i & 64) != 0 ? false : z5, (i & 128) == 0 ? z6 : false);
    }
}
