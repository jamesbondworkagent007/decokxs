package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41120qkn implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean DbNXlk;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;
    public java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41120qkn OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, @NotNull java.lang.String str7, boolean z2, @NotNull java.lang.String str8, int i2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new C41120qkn(i, str, str2, str3, str4, str5, str6, z, str7, z2, str8, i2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41120qkn)) {
            return false;
        }
        C41120qkn c41120qkn = (C41120qkn) obj;
        return this.EZpvd == c41120qkn.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c41120qkn.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c41120qkn.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41120qkn.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41120qkn.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c41120qkn.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c41120qkn.fetchVPNInfo) && this.AYXKKw == c41120qkn.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c41120qkn.values) && this.DbNXlk == c41120qkn.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41120qkn.copydefault) && this.OLrzqt == c41120qkn.OLrzqt && this.gEmmrt == c41120qkn.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + this.values.hashCode()) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverOverviewTrendingCategoryCryptoVo(index=" + this.EZpvd + ", instId=" + this.valueOf + ", instType=" + this.AhwBna + ", icon=" + this.KWHzl + ", coinName=" + this.AEQbTJ + ", indicate=" + this.djBIcL + ", lastPrice=" + this.fetchVPNInfo + ", isShowLastPrice=" + this.AYXKKw + ", quotePrice=" + this.values + ", isShowQuotePrice=" + this.DbNXlk + ", changePercent=" + this.copydefault + ", changePercentColor=" + this.OLrzqt + ", isShowChangePercent=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AYXKKw;
    }

    public C41120qkn(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, @NotNull java.lang.String str7, boolean z2, @NotNull java.lang.String str8, int i2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.EZpvd = i;
        this.valueOf = str;
        this.AhwBna = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.djBIcL = str5;
        this.fetchVPNInfo = str6;
        this.AYXKKw = z;
        this.values = str7;
        this.DbNXlk = z2;
        this.copydefault = str8;
        this.OLrzqt = i2;
        this.gEmmrt = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (r17v0 int)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("--") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("--") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("--") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("--") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("--") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r28v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, int, boolean):void (m)] (LINE:8) call: o.qkn.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ C41120qkn(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, java.lang.String str7, boolean z2, java.lang.String str8, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "--" : str4, (i3 & 32) != 0 ? "--" : str5, (i3 & 64) != 0 ? "--" : str6, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? "--" : str7, (i3 & 512) != 0 ? true : z2, (i3 & 1024) != 0 ? "--" : str8, (i3 & 2048) != 0 ? 5 : i2, (i3 & 4096) != 0 ? true : z3);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41120qkn) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41120qkn) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
