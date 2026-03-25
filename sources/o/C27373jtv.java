package o;

import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27373jtv implements InterfaceC27436jvE {
    public final java.util.List<UnifiedRewardInfoByInvestment> AEQbTJ;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27373jtv() {
        this(0L, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jtv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27373jtv copy$default(C27373jtv c27373jtv, long j, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c27373jtv.EZpvd;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = c27373jtv.copydefault;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            list = c27373jtv.AEQbTJ;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            str2 = c27373jtv.KWHzl;
        }
        return c27373jtv.EZpvd(j2, str3, list2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27373jtv EZpvd(long j, @NotNull java.lang.String str, @NotNull java.util.List<UnifiedRewardInfoByInvestment> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27373jtv(j, str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UnifiedRewardInfoByInvestment> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27373jtv)) {
            return false;
        }
        C27373jtv c27373jtv = (C27373jtv) obj;
        return this.EZpvd == c27373jtv.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27373jtv.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c27373jtv.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27373jtv.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProtocolRewardsItem(analysisPlatformId=" + this.EZpvd + ", totalRewards=" + this.copydefault + ", rewards=" + this.AEQbTJ + ", totalRewardsValue=" + this.KWHzl + ")";
    }

    public C27373jtv(long j, @NotNull java.lang.String str, @NotNull java.util.List<UnifiedRewardInfoByInvestment> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.copydefault = str;
        this.AEQbTJ = list;
        this.KWHzl = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:0x0018: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(long, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment>, java.lang.String):void (m)] (LINE:14) call: o.jtv.<init>(long, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C27373jtv(long j, java.lang.String str, java.util.List list, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str2);
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27373jtv c27373jtv = interfaceC27436jvE instanceof C27373jtv ? (C27373jtv) interfaceC27436jvE : null;
        return c27373jtv != null && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27373jtv.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27373jtv.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c27373jtv.AEQbTJ);
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27373jtv c27373jtv = interfaceC27436jvE instanceof C27373jtv ? (C27373jtv) interfaceC27436jvE : null;
        return c27373jtv != null && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27373jtv.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27373jtv.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c27373jtv.AEQbTJ);
    }
}
