package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27369jtr implements InterfaceC27436jvE {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final iZU EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final long djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27369jtr KWHzl(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, iZU izu, boolean z2, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new C27369jtr(j, j2, str, str2, str3, str4, str5, str6, str7, z, izu, z2, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iZU OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27369jtr)) {
            return false;
        }
        C27369jtr c27369jtr = (C27369jtr) obj;
        return this.djBIcL == c27369jtr.djBIcL && this.KWHzl == c27369jtr.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27369jtr.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27369jtr.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c27369jtr.values) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c27369jtr.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c27369jtr.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27369jtr.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c27369jtr.AkhnZx) && this.AEQbTJ == c27369jtr.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c27369jtr.EZpvd) && this.copydefault == c27369jtr.copydefault && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c27369jtr.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c27369jtr.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.djBIcL);
        int iHashCode2 = java.lang.Long.hashCode(this.KWHzl);
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        int iHashCode5 = this.values.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        int iHashCode7 = this.valueOf.hashCode();
        int iHashCode8 = this.AhwBna.hashCode();
        int iHashCode9 = this.AkhnZx.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.AEQbTJ);
        iZU izu = this.EZpvd;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (izu == null ? 0 : izu.hashCode())) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.isConnected.hashCode()) * 31) + this.fetchVPNInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProtocol(protocolId=" + this.djBIcL + ", chainId=" + this.KWHzl + ", protocolName=" + this.AYXKKw + ", protocolLogoUrl=" + this.gEmmrt + ", protocolWebAddress=" + this.values + ", investedAmount=" + this.OLrzqt + ", networkName=" + this.valueOf + ", networkLogoUrl=" + this.AhwBna + ", warning=" + this.AkhnZx + ", isExpanded=" + this.AEQbTJ + ", details=" + this.EZpvd + ", hideAssets=" + this.copydefault + ", totalEarnings=" + this.isConnected + ", totalEarningsShowValue=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fetchVPNInfo;
    }

    public C27369jtr(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, iZU izu, boolean z2, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.djBIcL = j;
        this.KWHzl = j2;
        this.AYXKKw = str;
        this.gEmmrt = str2;
        this.values = str3;
        this.OLrzqt = str4;
        this.valueOf = str5;
        this.AhwBna = str6;
        this.AkhnZx = str7;
        this.AEQbTJ = z;
        this.EZpvd = izu;
        this.copydefault = z2;
        this.isConnected = str8;
        this.fetchVPNInfo = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (r21v0 long)
  (r23v0 long)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:o.iZU:?: TERNARY null = ((wrap:int:0x0015: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null o.iZU) : (r33v0 o.iZU))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, o.iZU, boolean, java.lang.String, java.lang.String):void (m)] (LINE:31) call: o.jtr.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, o.iZU, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C27369jtr(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, iZU izu, boolean z2, java.lang.String str8, java.lang.String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, str2, str3, str4, str5, str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : izu, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? "" : str9);
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27369jtr c27369jtr = interfaceC27436jvE instanceof C27369jtr ? (C27369jtr) interfaceC27436jvE : null;
        return c27369jtr != null && this.djBIcL == c27369jtr.djBIcL && this.KWHzl == c27369jtr.KWHzl;
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27369jtr c27369jtr = interfaceC27436jvE instanceof C27369jtr ? (C27369jtr) interfaceC27436jvE : null;
        return c27369jtr != null && this.djBIcL == c27369jtr.djBIcL && this.KWHzl == c27369jtr.KWHzl && Intrinsics.EZpvd(this.EZpvd, c27369jtr.EZpvd) && this.AEQbTJ == c27369jtr.AEQbTJ && this.copydefault == c27369jtr.copydefault;
    }
}
