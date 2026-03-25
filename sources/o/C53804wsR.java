package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53804wsR {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final boolean DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final int fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53804wsR() {
        this(null, null, null, false, null, null, false, null, 0, null, 0, null, 0, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53804wsR OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z2, @NotNull java.lang.String str6, int i, @NotNull java.lang.String str7, int i2, @NotNull java.lang.String str8, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new C53804wsR(str, str2, str3, z, str4, str5, z2, str6, i, str7, i2, str8, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53804wsR)) {
            return false;
        }
        C53804wsR c53804wsR = (C53804wsR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c53804wsR.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c53804wsR.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c53804wsR.gEmmrt) && this.AhwBna == c53804wsR.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c53804wsR.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c53804wsR.AEQbTJ) && this.DbNXlk == c53804wsR.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c53804wsR.djBIcL) && this.valueOf == c53804wsR.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c53804wsR.AYXKKw) && this.fetchVPNInfo == c53804wsR.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c53804wsR.AkhnZx) && this.OLrzqt == c53804wsR.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DcaHeaderData(botName=" + this.KWHzl + ", direction=" + this.EZpvd + ", lever=" + this.gEmmrt + ", isContract=" + this.AhwBna + ", cycleText=" + this.copydefault + ", adlLevel=" + this.AEQbTJ + ", showAdl=" + this.DbNXlk + ", pnl=" + this.djBIcL + ", pnlColor=" + this.valueOf + ", pnlRatio=" + this.AYXKKw + ", pnlRatioColor=" + this.fetchVPNInfo + ", pnlTitleText=" + this.AkhnZx + ", directionTagStyle=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C53804wsR(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z2, @NotNull java.lang.String str6, int i, @NotNull java.lang.String str7, int i2, @NotNull java.lang.String str8, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.gEmmrt = str3;
        this.AhwBna = z;
        this.copydefault = str4;
        this.AEQbTJ = str5;
        this.DbNXlk = z2;
        this.djBIcL = str6;
        this.valueOf = i;
        this.AYXKKw = str7;
        this.fetchVPNInfo = i2;
        this.AkhnZx = str8;
        this.OLrzqt = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("--") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r29v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : ("--"))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, int, java.lang.String, int):void (m)] (LINE:16) call: o.wsR.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ C53804wsR(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, java.lang.String str6, int i, java.lang.String str7, int i2, java.lang.String str8, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? "--" : str6, (i4 & 256) != 0 ? 0 : i, (i4 & 512) == 0 ? str7 : "--", (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) == 0 ? str8 : "", (i4 & 4096) == 0 ? i3 : 0);
    }
}
