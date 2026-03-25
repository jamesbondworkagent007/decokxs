package o;

import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23670iEz {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final C23670iEz OLrzqt = new C23670iEz(null, 0, 0, null, null, null, null, null, 255, null);
    public final long AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.Map<java.lang.Long, InvestmentKind> KWHzl;
    public final long copydefault;
    public final HealthRate djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23670iEz() {
        this(null, 0L, 0L, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23670iEz EZpvd(@NotNull java.lang.String str, long j, long j2, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, HealthRate healthRate, @NotNull java.util.Map<java.lang.Long, ? extends InvestmentKind> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new C23670iEz(str, j, j2, str2, str3, str4, healthRate, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23670iEz)) {
            return false;
        }
        C23670iEz c23670iEz = (C23670iEz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c23670iEz.AhwBna) && this.AEQbTJ == c23670iEz.AEQbTJ && this.copydefault == c23670iEz.copydefault && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c23670iEz.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c23670iEz.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c23670iEz.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c23670iEz.djBIcL) && Intrinsics.EZpvd(this.KWHzl, c23670iEz.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Long.hashCode(this.copydefault);
        int iHashCode4 = this.valueOf.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        HealthRate healthRate = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (healthRate == null ? 0 : healthRate.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketInvestmentBasicInfo(network=" + this.AhwBna + ", chainId=" + this.AEQbTJ + ", analysisPlatformId=" + this.copydefault + ", marketId=" + this.valueOf + ", investTypeName=" + this.AYXKKw + ", totalValue=" + this.gEmmrt + ", healthRate=" + this.djBIcL + ", categoryMap=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Map<java.lang.Long, ? extends com.okinc.business.invest_biz.data.contants.InvestmentKind> */
    /* JADX WARN: Multi-variable type inference failed */
    public C23670iEz(@NotNull java.lang.String str, long j, long j2, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, HealthRate healthRate, @NotNull java.util.Map<java.lang.Long, ? extends InvestmentKind> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AhwBna = str;
        this.AEQbTJ = j;
        this.copydefault = j2;
        this.valueOf = str2;
        this.AYXKKw = str3;
        this.gEmmrt = str4;
        this.djBIcL = healthRate;
        this.KWHzl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r14v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x0031: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r19v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:109)) : (r20v0 java.util.Map))
 A[MD:(java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.util.Map<java.lang.Long, ? extends com.okinc.business.invest_biz.data.contants.InvestmentKind>):void (m)] (LINE:101) call: o.iEz.<init>(java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.util.Map):void type: THIS */
    public /* synthetic */ C23670iEz(java.lang.String str, long j, long j2, java.lang.String str2, java.lang.String str3, java.lang.String str4, HealthRate healthRate, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? null : healthRate, (i & 128) != 0 ? C56424yEw.KWHzl() : map);
    }

    /* JADX INFO: renamed from: o.iEz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C23670iEz copydefault() {
            return C23670iEz.OLrzqt;
        }
    }
}
