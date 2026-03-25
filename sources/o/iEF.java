package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEF {
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.List<InvestUserRewardInfoByInvestment> KWHzl;
    public final java.lang.String copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final iEF AEQbTJ = new iEF(null, null, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEF() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iEF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iEF copy$default(iEF ief, java.util.List list, java.lang.String str, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = ief.KWHzl;
        }
        if ((i & 2) != 0) {
            str = ief.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = ief.EZpvd;
        }
        return ief.KWHzl(list, str, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEF KWHzl(@NotNull java.util.List<InvestUserRewardInfoByInvestment> list, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new iEF(list, str, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEF)) {
            return false;
        }
        iEF ief = (iEF) obj;
        return Intrinsics.EZpvd(this.KWHzl, ief.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ief.copydefault) && Intrinsics.EZpvd(this.EZpvd, ief.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolAvailableRewards(rewardTokens=" + this.KWHzl + ", totalRewardAmount=" + this.copydefault + ", rewardTokenLogos=" + this.EZpvd + ")";
    }

    public iEF(@NotNull java.util.List<InvestUserRewardInfoByInvestment> list, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.KWHzl = list;
        this.copydefault = str;
        this.EZpvd = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:75)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:77)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:74) call: o.iEF.<init>(java.util.List, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ iEF(java.util.List list, java.lang.String str, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
