package o;

import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27338jtM {
    public final long AEQbTJ;
    public final InvestLogo AYXKKw;
    public final java.lang.String EZpvd;
    public final java.util.List<InvestTokenWithAmount> KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27338jtM() {
        this(null, null, null, 0L, 0L, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27338jtM AEQbTJ(@NotNull java.lang.String str, @NotNull InvestLogo investLogo, @NotNull java.util.List<InvestTokenWithAmount> list, long j, long j2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27338jtM(str, investLogo, list, j, j2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27338jtM)) {
            return false;
        }
        C27338jtM c27338jtM = (C27338jtM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27338jtM.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, c27338jtM.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, c27338jtM.KWHzl) && this.AEQbTJ == c27338jtM.AEQbTJ && this.OLrzqt == c27338jtM.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27338jtM.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiBonusDetails(availableRewards=" + this.EZpvd + ", tokenLogos=" + this.AYXKKw + ", acceptedTokens=" + this.KWHzl + ", endTime=" + this.AEQbTJ + ", startTime=" + this.OLrzqt + ", sponsor=" + this.copydefault + ")";
    }

    public C27338jtM(@NotNull java.lang.String str, @NotNull InvestLogo investLogo, @NotNull java.util.List<InvestTokenWithAmount> list, long j, long j2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AYXKKw = investLogo;
        this.KWHzl = list;
        this.AEQbTJ = j;
        this.OLrzqt = j2;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x0009: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.business.invest_biz.data.bean.InvestLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r13v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r19v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r16v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r19v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, long, long, java.lang.String):void (m)] (LINE:19) call: o.jtM.<init>(java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, java.util.List, long, long, java.lang.String):void type: THIS */
    public /* synthetic */ C27338jtM(java.lang.String str, InvestLogo investLogo, java.util.List list, long j, long j2, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new InvestLogo((java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 15, (DefaultConstructorMarker) null) : investLogo, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L, (i & 32) == 0 ? str2 : "");
    }
}
