package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30236lQx {
    public final boolean AEQbTJ;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30236lQx() {
        this(false, null, null, null, false, null, false, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30236lQx copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, @NotNull java.lang.String str4, boolean z3, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C30236lQx(z, str, str2, str3, z2, str4, z3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30236lQx)) {
            return false;
        }
        C30236lQx c30236lQx = (C30236lQx) obj;
        return this.AEQbTJ == c30236lQx.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c30236lQx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c30236lQx.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c30236lQx.OLrzqt) && this.valueOf == c30236lQx.valueOf && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c30236lQx.KWHzl) && this.AhwBna == c30236lQx.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c30236lQx.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailBannerUiModel(isVisible=" + this.AEQbTJ + ", errorType=" + this.EZpvd + ", title=" + this.gEmmrt + ", message=" + this.OLrzqt + ", showDepositButton=" + this.valueOf + ", depositButtonLabel=" + this.KWHzl + ", shouldNavigateToBuyCrypto=" + this.AhwBna + ", cryptoSymbolToBuy=" + this.copydefault + ")";
    }

    public C30236lQx(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, @NotNull java.lang.String str4, boolean z3, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = z;
        this.EZpvd = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.valueOf = z2;
        this.KWHzl = str4;
        this.AhwBna = z3;
        this.copydefault = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void (m)] (LINE:16) call: o.lQx.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C30236lQx(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, java.lang.String str4, boolean z3, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? z3 : false, (i & 128) == 0 ? str5 : "");
    }
}
