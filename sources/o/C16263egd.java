package o;

import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.egd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16263egd {
    public final boolean AEQbTJ;
    public final C13924dbk AhwBna;
    public final boolean EZpvd;
    public final CoinProtocol KWHzl;
    public final java.util.List<CoinProtocol> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C16263egd() {
        this(null, false, false, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.egd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C16263egd copy$default(C16263egd c16263egd, C13924dbk c13924dbk, boolean z, boolean z2, java.util.List list, CoinProtocol coinProtocol, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c13924dbk = c16263egd.AhwBna;
        }
        if ((i & 2) != 0) {
            z = c16263egd.copydefault;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = c16263egd.EZpvd;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            list = c16263egd.OLrzqt;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            coinProtocol = c16263egd.KWHzl;
        }
        CoinProtocol coinProtocol2 = coinProtocol;
        if ((i & 32) != 0) {
            z3 = c16263egd.AEQbTJ;
        }
        return c16263egd.KWHzl(c13924dbk, z4, z5, list2, coinProtocol2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinProtocol EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CoinProtocol> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16263egd KWHzl(C13924dbk c13924dbk, boolean z, boolean z2, @NotNull java.util.List<CoinProtocol> list, CoinProtocol coinProtocol, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C16263egd(c13924dbk, z, z2, list, coinProtocol, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16263egd)) {
            return false;
        }
        C16263egd c16263egd = (C16263egd) obj;
        return Intrinsics.EZpvd(this.AhwBna, c16263egd.AhwBna) && this.copydefault == c16263egd.copydefault && this.EZpvd == c16263egd.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c16263egd.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c16263egd.KWHzl) && this.AEQbTJ == c16263egd.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13924dbk gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C13924dbk c13924dbk = this.AhwBna;
        int iHashCode = c13924dbk == null ? 0 : c13924dbk.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode4 = this.OLrzqt.hashCode();
        CoinProtocol coinProtocol = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (coinProtocol != null ? coinProtocol.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomTokenViewState(supportCustomCoinChainMeta=" + this.AhwBna + ", showProtocolSelection=" + this.copydefault + ", protocolAvailable=" + this.EZpvd + ", protocolList=" + this.OLrzqt + ", selectedProtocol=" + this.KWHzl + ", getChainsSupportCustomCoinsError=" + this.AEQbTJ + ")";
    }

    public C16263egd(C13924dbk c13924dbk, boolean z, boolean z2, @NotNull java.util.List<CoinProtocol> list, CoinProtocol coinProtocol, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = c13924dbk;
        this.copydefault = z;
        this.EZpvd = z2;
        this.OLrzqt = list;
        this.KWHzl = coinProtocol;
        this.AEQbTJ = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:o.dbk:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.dbk) : (r6v0 o.dbk))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:java.util.List:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:180)) : (r9v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.CoinProtocol:?: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 com.okinc.business.defi.biz.net.bean.CoinProtocol) : (null com.okinc.business.defi.biz.net.bean.CoinProtocol))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(o.dbk, boolean, boolean, java.util.List<com.okinc.business.defi.biz.net.bean.CoinProtocol>, com.okinc.business.defi.biz.net.bean.CoinProtocol, boolean):void (m)] (LINE:176) call: o.egd.<init>(o.dbk, boolean, boolean, java.util.List, com.okinc.business.defi.biz.net.bean.CoinProtocol, boolean):void type: THIS */
    public /* synthetic */ C16263egd(C13924dbk c13924dbk, boolean z, boolean z2, java.util.List list, CoinProtocol coinProtocol, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c13924dbk, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) == 0 ? coinProtocol : null, (i & 32) != 0 ? false : z3);
    }
}
