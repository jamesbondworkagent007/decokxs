package o;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23682iFk {
    public final InvestmentKind EZpvd;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23682iFk() {
        this(0L, null, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23682iFk copy$default(C23682iFk c23682iFk, long j, InvestmentKind investmentKind, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c23682iFk.OLrzqt;
        }
        if ((i & 2) != 0) {
            investmentKind = c23682iFk.EZpvd;
        }
        return c23682iFk.OLrzqt(j, investmentKind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23682iFk OLrzqt(long j, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        return new C23682iFk(j, investmentKind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23682iFk)) {
            return false;
        }
        C23682iFk c23682iFk = (C23682iFk) obj;
        return this.OLrzqt == c23682iFk.OLrzqt && this.EZpvd == c23682iFk.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductDetailsParams(investmentId=" + this.OLrzqt + ", kind=" + this.EZpvd + ")";
    }

    public C23682iFk(long j, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        this.OLrzqt = j;
        this.EZpvd = investmentKind;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:0x000a: SGET  A[WRAPPED] (LINE:7) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r3v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
 A[MD:(long, com.okinc.business.invest_biz.data.contants.InvestmentKind):void (m)] (LINE:5) call: o.iFk.<init>(long, com.okinc.business.invest_biz.data.contants.InvestmentKind):void type: THIS */
    public /* synthetic */ C23682iFk(long j, InvestmentKind investmentKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? InvestmentKind.Default : investmentKind);
    }
}
