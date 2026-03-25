package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24227iZp {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Long copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24227iZp OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C24227iZp(str, str2, z, str3, str4, l, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
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
        if (!(obj instanceof C24227iZp)) {
            return false;
        }
        C24227iZp c24227iZp = (C24227iZp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c24227iZp.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c24227iZp.EZpvd) && this.KWHzl == c24227iZp.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c24227iZp.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c24227iZp.valueOf) && Intrinsics.EZpvd(this.copydefault, c24227iZp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c24227iZp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c24227iZp.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.gEmmrt;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.valueOf;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.Long l = this.copydefault;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssetItem(tokenName=" + this.AYXKKw + ", amount=" + this.EZpvd + ", isV3=" + this.KWHzl + ", quantity=" + this.gEmmrt + ", tokenAddress=" + this.valueOf + ", chainId=" + this.copydefault + ", innerPnl=" + this.AEQbTJ + ", originPnl=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.KWHzl;
    }

    public C24227iZp(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        this.EZpvd = str2;
        this.KWHzl = z;
        this.gEmmrt = str3;
        this.valueOf = str4;
        this.copydefault = l;
        this.AEQbTJ = str5;
        this.OLrzqt = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:70) call: o.iZp.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C24227iZp(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }
}
