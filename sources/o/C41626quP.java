package o;

import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41626quP {
    public final java.util.List<PeriodEnum> EZpvd;
    public final java.util.List<PeriodEnum> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41626quP() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.quP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41626quP copy$default(C41626quP c41626quP, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41626quP.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = c41626quP.KWHzl;
        }
        return c41626quP.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PeriodEnum> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41626quP EZpvd(@NotNull java.util.List<? extends PeriodEnum> list, @NotNull java.util.List<? extends PeriodEnum> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C41626quP(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PeriodEnum> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41626quP)) {
            return false;
        }
        C41626quP c41626quP = (C41626quP) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41626quP.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c41626quP.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RankingPeriodVo(period=" + this.EZpvd + ", allPeriod=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.market.time.filter.PeriodEnum> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.market.time.filter.PeriodEnum> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41626quP(@NotNull java.util.List<? extends PeriodEnum> list, @NotNull java.util.List<? extends PeriodEnum> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.KWHzl = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE 
  (wrap:com.okinc.market.time.filter.PeriodEnum[]:0x000c: FILLED_NEW_ARRAY 
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x0004: SGET  A[WRAPPED] (LINE:12) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1D com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x0006: SGET  A[WRAPPED] (LINE:13) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1H com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x0008: SGET  A[WRAPPED] (LINE:14) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1W com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x000a: SGET  A[WRAPPED] (LINE:15) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1M com.okinc.market.time.filter.PeriodEnum)
 A[WRAPPED] (LINE:15) elemType: com.okinc.market.time.filter.PeriodEnum)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:11)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0026: INVOKE 
  (wrap:com.okinc.market.time.filter.PeriodEnum[]:0x0022: FILLED_NEW_ARRAY 
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x0018: SGET  A[WRAPPED] (LINE:18) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1D com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x001a: SGET  A[WRAPPED] (LINE:19) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_5M com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x001c: SGET  A[WRAPPED] (LINE:20) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1H com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x001e: SGET  A[WRAPPED] (LINE:21) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1W com.okinc.market.time.filter.PeriodEnum)
  (wrap:com.okinc.market.time.filter.PeriodEnum:0x0020: SGET  A[WRAPPED] (LINE:22) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1M com.okinc.market.time.filter.PeriodEnum)
 A[WRAPPED] (LINE:22) elemType: com.okinc.market.time.filter.PeriodEnum)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:17)) : (r4v0 java.util.List))
 A[MD:(java.util.List<? extends com.okinc.market.time.filter.PeriodEnum>, java.util.List<? extends com.okinc.market.time.filter.PeriodEnum>):void (m)] (LINE:10) call: o.quP.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C41626quP(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.gEmmrt(PeriodEnum.RANKING_PERIOD_1D, PeriodEnum.RANKING_PERIOD_1H, PeriodEnum.RANKING_PERIOD_1W, PeriodEnum.RANKING_PERIOD_1M) : list, (i & 2) != 0 ? yDY.gEmmrt(PeriodEnum.RANKING_PERIOD_1D, PeriodEnum.RANKING_PERIOD_5M, PeriodEnum.RANKING_PERIOD_1H, PeriodEnum.RANKING_PERIOD_1W, PeriodEnum.RANKING_PERIOD_1M) : list2);
    }
}
