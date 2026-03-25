package o;

import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21997hUb {
    public final java.lang.String AEQbTJ;
    public final NetworkSource AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21997hUb copydefault(@NotNull NetworkSource networkSource, @NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, @NotNull java.lang.String str3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(networkSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C21997hUb(networkSource, str, z, str2, z2, str3, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21997hUb)) {
            return false;
        }
        C21997hUb c21997hUb = (C21997hUb) obj;
        return this.AYXKKw == c21997hUb.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c21997hUb.AEQbTJ) && this.copydefault == c21997hUb.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c21997hUb.AhwBna) && this.valueOf == c21997hUb.valueOf && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c21997hUb.EZpvd) && this.OLrzqt == c21997hUb.OLrzqt && this.KWHzl == c21997hUb.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkSource gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.AhwBna;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectNetworkPageData(source=" + this.AYXKKw + ", selectedChainId=" + this.AEQbTJ + ", showAllNetWork=" + this.copydefault + ", tradeMode=" + this.AhwBna + ", showPopular=" + this.valueOf + ", fromChainId=" + this.EZpvd + ", isFrom=" + this.OLrzqt + ", hideSearch=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.OLrzqt;
    }

    public C21997hUb(@NotNull NetworkSource networkSource, @NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, @NotNull java.lang.String str3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(networkSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = networkSource;
        this.AEQbTJ = str;
        this.copydefault = z;
        this.AhwBna = str2;
        this.valueOf = z2;
        this.EZpvd = str3;
        this.OLrzqt = z3;
        this.KWHzl = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r13v0 com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource)
  (r14v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:5) call: o.hUb.<init>(com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ C21997hUb(NetworkSource networkSource, java.lang.String str, boolean z, java.lang.String str2, boolean z2, java.lang.String str3, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkSource, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4);
    }
}
