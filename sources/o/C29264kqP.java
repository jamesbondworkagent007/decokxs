package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.RankTypeFilter;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29264kqP {
    public final java.util.List<InterfaceC28823khz.ActionBar> AEQbTJ;
    public final TrendingFilter EZpvd;
    public final java.util.List<RankTypeFilter> KWHzl;
    public final C29259kqK OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29264kqP() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.kqP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29264kqP copy$default(C29264kqP c29264kqP, java.util.List list, TrendingFilter trendingFilter, C29259kqK c29259kqK, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29264kqP.AEQbTJ;
        }
        if ((i & 2) != 0) {
            trendingFilter = c29264kqP.EZpvd;
        }
        TrendingFilter trendingFilter2 = trendingFilter;
        if ((i & 4) != 0) {
            c29259kqK = c29264kqP.OLrzqt;
        }
        C29259kqK c29259kqK2 = c29259kqK;
        if ((i & 8) != 0) {
            list2 = c29264kqP.KWHzl;
        }
        java.util.List list3 = list2;
        if ((i & 16) != 0) {
            str = c29264kqP.copydefault;
        }
        return c29264kqP.AEQbTJ(list, trendingFilter2, c29259kqK2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC28823khz.ActionBar> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29264kqP AEQbTJ(@NotNull java.util.List<InterfaceC28823khz.ActionBar> list, @NotNull TrendingFilter trendingFilter, @NotNull C29259kqK c29259kqK, @NotNull java.util.List<RankTypeFilter> list2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(c29259kqK, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C29264kqP(list, trendingFilter, c29259kqK, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingFilter EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RankTypeFilter> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29259kqK copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29264kqP)) {
            return false;
        }
        C29264kqP c29264kqP = (C29264kqP) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c29264kqP.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c29264kqP.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c29264kqP.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c29264kqP.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29264kqP.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrendingFilterBottomSheetUiState(currentProtocolsState=" + this.AEQbTJ + ", filterState=" + this.EZpvd + ", validationState=" + this.OLrzqt + ", rankTypes=" + this.KWHzl + ", selectedRankType=" + this.copydefault + ")";
    }

    public C29264kqP(@NotNull java.util.List<InterfaceC28823khz.ActionBar> list, @NotNull TrendingFilter trendingFilter, @NotNull C29259kqK c29259kqK, @NotNull java.util.List<RankTypeFilter> list2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(c29259kqK, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = list;
        this.EZpvd = trendingFilter;
        this.OLrzqt = c29259kqK;
        this.KWHzl = list2;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r15v0 java.util.List))
  (wrap:com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.meme.filter.domain.TokenAgeType)
  (null java.lang.String)
  false
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:52) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter))
  (wrap:o.kqK:?: TERNARY null = ((wrap:int:0x0023: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR false, false, false, (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:53) call: o.kqK.<init>(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 o.kqK))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:54)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(java.util.List<o.khz$ActionBar>, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, o.kqK, java.util.List<com.okinc.business.market.features.scanner.surge.trending.ui.filter.RankTypeFilter>, java.lang.String):void (m)] (LINE:50) call: o.kqP.<init>(java.util.List, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, o.kqK, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C29264kqP(java.util.List list, TrendingFilter trendingFilter, C29259kqK c29259kqK, java.util.List list2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? new TrendingFilter(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null) : trendingFilter, (i & 4) != 0 ? new C29259kqK(false, false, false, 7, null) : c29259kqK, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? "" : str);
    }
}
