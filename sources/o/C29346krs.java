package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.krs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29346krs {
    public final C29345krr AEQbTJ;
    public final java.lang.String KWHzl;
    public final TrendingFilter OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29346krs() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29346krs copy$default(C29346krs c29346krs, java.lang.String str, TrendingFilter trendingFilter, C29345krr c29345krr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c29346krs.KWHzl;
        }
        if ((i & 2) != 0) {
            trendingFilter = c29346krs.OLrzqt;
        }
        if ((i & 4) != 0) {
            c29345krr = c29346krs.AEQbTJ;
        }
        return c29346krs.EZpvd(str, trendingFilter, c29345krr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29345krr AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29346krs EZpvd(@NotNull java.lang.String str, @NotNull TrendingFilter trendingFilter, @NotNull C29345krr c29345krr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(c29345krr, "");
        return new C29346krs(str, trendingFilter, c29345krr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingFilter OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29346krs)) {
            return false;
        }
        C29346krs c29346krs = (C29346krs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29346krs.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c29346krs.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c29346krs.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SurgeFilterUiState(rankType=" + this.KWHzl + ", localFilter=" + this.OLrzqt + ", protocolFilter=" + this.AEQbTJ + ")";
    }

    public C29346krs(@NotNull java.lang.String str, @NotNull TrendingFilter trendingFilter, @NotNull C29345krr c29345krr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(c29345krr, "");
        this.KWHzl = str;
        this.OLrzqt = trendingFilter;
        this.AEQbTJ = c29345krr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:428) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter))
  (wrap:o.krr:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: CONSTRUCTOR 
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:429) call: o.krr.<init>(java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 o.krr))
 A[MD:(java.lang.String, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, o.krr):void (m)] (LINE:426) call: o.krs.<init>(java.lang.String, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, o.krr):void type: THIS */
    public /* synthetic */ C29346krs(java.lang.String str, TrendingFilter trendingFilter, C29345krr c29345krr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new TrendingFilter(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null) : trendingFilter, (i & 4) != 0 ? new C29345krr(null, null, null, 7, null) : c29345krr);
    }
}
