package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19577gHn {
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public final int KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;
    public final boolean djBIcL;
    public final java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19577gHn KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, int i, boolean z2, boolean z3, java.lang.String str5, int i2, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C19577gHn(str, str2, str3, z, str4, i, z2, z3, str5, i2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19577gHn)) {
            return false;
        }
        C19577gHn c19577gHn = (C19577gHn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c19577gHn.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c19577gHn.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c19577gHn.copydefault) && this.AhwBna == c19577gHn.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c19577gHn.AEQbTJ) && this.OLrzqt == c19577gHn.OLrzqt && this.AYXKKw == c19577gHn.AYXKKw && this.djBIcL == c19577gHn.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c19577gHn.fetchVPNInfo) && this.KWHzl == c19577gHn.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c19577gHn.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.AhwBna);
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode7 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode8 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.String str = this.fetchVPNInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SendCoinAddressChildBean(name=" + this.gEmmrt + ", address=" + this.EZpvd + ", displayName=" + this.copydefault + ", isLineShow=" + this.AhwBna + ", addressTag=" + this.AEQbTJ + ", addressType=" + this.OLrzqt + ", isAccountNameShow=" + this.AYXKKw + ", isSmartContract=" + this.djBIcL + ", walletId=" + this.fetchVPNInfo + ", addressGroup=" + this.KWHzl + ", exchangeMemo=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.djBIcL;
    }

    public C19577gHn(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, int i, boolean z2, boolean z3, java.lang.String str5, int i2, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.gEmmrt = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.AhwBna = z;
        this.AEQbTJ = str4;
        this.OLrzqt = i;
        this.AYXKKw = z2;
        this.djBIcL = z3;
        this.fetchVPNInfo = str5;
        this.KWHzl = i2;
        this.valueOf = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (r23v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, boolean, java.lang.String, int, java.lang.String):void (m)] (LINE:3) call: o.gHn.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, boolean, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ C19577gHn(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, boolean z2, boolean z3, java.lang.String str5, int i2, java.lang.String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? -1 : i, (i3 & 64) != 0 ? true : z2, z3, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? -1 : i2, (i3 & 1024) != 0 ? "" : str6);
    }
}
