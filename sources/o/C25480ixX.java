package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25480ixX {
    public final java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final int fetchVPNInfo;
    public final boolean gEmmrt;
    public final boolean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25480ixX EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C25480ixX(str, str2, str3, str4, z, z2, z3, z4, z5, str5, i, str6, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25480ixX)) {
            return false;
        }
        C25480ixX c25480ixX = (C25480ixX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c25480ixX.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25480ixX.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25480ixX.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25480ixX.AEQbTJ) && this.valueOf == c25480ixX.valueOf && this.AYXKKw == c25480ixX.AYXKKw && this.AhwBna == c25480ixX.AhwBna && this.gEmmrt == c25480ixX.gEmmrt && this.djBIcL == c25480ixX.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c25480ixX.values) && this.fetchVPNInfo == c25480ixX.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c25480ixX.AkhnZx) && this.copydefault == c25480ixX.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.values.hashCode()) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestMultiInputUIBean(coinAmount=" + this.OLrzqt + ", coinSymbol=" + this.EZpvd + ", coinLogo=" + this.KWHzl + ", currencyAmount=" + this.AEQbTJ + ", isBalanceInsufficient=" + this.valueOf + ", isFeeInsufficient=" + this.AYXKKw + ", isNetError=" + this.AhwBna + ", isInit=" + this.gEmmrt + ", isShowKeyboard=" + this.djBIcL + ", msgText=" + this.values + ", tokenPrecision=" + this.fetchVPNInfo + ", walletBalanceAmount=" + this.AkhnZx + ", forceChange=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public C25480ixX(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.valueOf = z;
        this.AYXKKw = z2;
        this.AhwBna = z3;
        this.gEmmrt = z4;
        this.djBIcL = z5;
        this.values = str5;
        this.fetchVPNInfo = i;
        this.AkhnZx = str6;
        this.copydefault = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005a: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, int, java.lang.String, boolean):void (m)] (LINE:297) call: o.ixX.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C25480ixX(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str5, int i, java.lang.String str6, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? true : z5, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? -1 : i, (i2 & 2048) != 0 ? "" : str6, (i2 & 4096) != 0 ? false : z6);
    }
}
