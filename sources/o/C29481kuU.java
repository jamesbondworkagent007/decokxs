package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29481kuU {
    public final C29635kxP AEQbTJ;
    public final java.util.List<SignalMultiSelectUiModel> EZpvd;
    public final SignalGemType KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final SignalMetricsFilter copydefault;
    public final SignalGemsUiSortType djBIcL;
    public final SignalsFilter gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29481kuU() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.kuU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29481kuU copy$default(C29481kuU c29481kuU, java.util.List list, C29635kxP c29635kxP, java.util.List list2, SignalMetricsFilter signalMetricsFilter, SignalsFilter signalsFilter, SignalGemType signalGemType, SignalGemsUiSortType signalGemsUiSortType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29481kuU.EZpvd;
        }
        if ((i & 2) != 0) {
            c29635kxP = c29481kuU.AEQbTJ;
        }
        C29635kxP c29635kxP2 = c29635kxP;
        if ((i & 4) != 0) {
            list2 = c29481kuU.OLrzqt;
        }
        java.util.List list3 = list2;
        if ((i & 8) != 0) {
            signalMetricsFilter = c29481kuU.copydefault;
        }
        SignalMetricsFilter signalMetricsFilter2 = signalMetricsFilter;
        if ((i & 16) != 0) {
            signalsFilter = c29481kuU.gEmmrt;
        }
        SignalsFilter signalsFilter2 = signalsFilter;
        if ((i & 32) != 0) {
            signalGemType = c29481kuU.KWHzl;
        }
        SignalGemType signalGemType2 = signalGemType;
        if ((i & 64) != 0) {
            signalGemsUiSortType = c29481kuU.djBIcL;
        }
        return c29481kuU.OLrzqt(list, c29635kxP2, list3, signalMetricsFilter2, signalsFilter2, signalGemType2, signalGemsUiSortType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalsFilter AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMetricsFilter KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SignalMultiSelectUiModel> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29481kuU OLrzqt(@NotNull java.util.List<SignalMultiSelectUiModel> list, @NotNull C29635kxP c29635kxP, @NotNull java.util.List<java.lang.String> list2, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter, @NotNull SignalGemType signalGemType, @NotNull SignalGemsUiSortType signalGemsUiSortType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c29635kxP, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        Intrinsics.checkNotNullParameter(signalGemType, "");
        Intrinsics.checkNotNullParameter(signalGemsUiSortType, "");
        return new C29481kuU(list, c29635kxP, list2, signalMetricsFilter, signalsFilter, signalGemType, signalGemsUiSortType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29635kxP copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29481kuU)) {
            return false;
        }
        C29481kuU c29481kuU = (C29481kuU) obj;
        return Intrinsics.EZpvd(this.EZpvd, c29481kuU.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c29481kuU.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c29481kuU.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c29481kuU.copydefault) && Intrinsics.EZpvd(this.gEmmrt, c29481kuU.gEmmrt) && this.KWHzl == c29481kuU.KWHzl && this.djBIcL == c29481kuU.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalFilterUserState(selectedInfluencers=" + this.EZpvd + ", selectedChain=" + this.AEQbTJ + ", selectedProtocolIds=" + this.OLrzqt + ", metricsFilter=" + this.copydefault + ", signalsFilter=" + this.gEmmrt + ", selectedGemsFilterType=" + this.KWHzl + ", selectedSortType=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemsUiSortType valueOf() {
        return this.djBIcL;
    }

    public C29481kuU(@NotNull java.util.List<SignalMultiSelectUiModel> list, @NotNull C29635kxP c29635kxP, @NotNull java.util.List<java.lang.String> list2, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter, @NotNull SignalGemType signalGemType, @NotNull SignalGemsUiSortType signalGemsUiSortType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c29635kxP, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        Intrinsics.checkNotNullParameter(signalGemType, "");
        Intrinsics.checkNotNullParameter(signalGemsUiSortType, "");
        this.EZpvd = list;
        this.AEQbTJ = c29635kxP;
        this.OLrzqt = list2;
        this.copydefault = signalMetricsFilter;
        this.gEmmrt = signalsFilter;
        this.KWHzl = signalGemType;
        this.djBIcL = signalGemsUiSortType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r17v0 java.util.List))
  (wrap:o.kxP:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  ("")
  (null android.graphics.drawable.Drawable)
  (null java.lang.String)
  (null java.lang.Integer)
  true
  ("501")
  (14 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:40) call: o.kxP.<init>(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 o.kxP))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:45)) : (r19v0 java.util.List))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter:?: TERNARY null = ((wrap:int:0x002e: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: CONSTRUCTOR 
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.meme.filter.domain.TokenAgeType)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (wrap:int:0x003d: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:46) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter:?: TERNARY null = ((wrap:int:0x0047: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: CONSTRUCTOR 
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:47) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter))
  (wrap:com.okinc.business.market.data.model.smart_money.SignalGemType:?: TERNARY null = ((wrap:int:0x005b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: SGET  A[WRAPPED] (LINE:48) com.okinc.business.market.data.model.smart_money.SignalGemType.ALL com.okinc.business.market.data.model.smart_money.SignalGemType) : (r22v0 com.okinc.business.market.data.model.smart_money.SignalGemType))
  (wrap:com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType:?: TERNARY null = ((wrap:int:0x0064: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: SGET  A[WRAPPED] (LINE:49) com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType.MARKET_CAP_INCREASE com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType) : (r23v0 com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType))
 A[MD:(java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>, o.kxP, java.util.List<java.lang.String>, com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter, com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter, com.okinc.business.market.data.model.smart_money.SignalGemType, com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType):void (m)] (LINE:38) call: o.kuU.<init>(java.util.List, o.kxP, java.util.List, com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter, com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter, com.okinc.business.market.data.model.smart_money.SignalGemType, com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType):void type: THIS */
    public /* synthetic */ C29481kuU(java.util.List list, C29635kxP c29635kxP, java.util.List list2, SignalMetricsFilter signalMetricsFilter, SignalsFilter signalsFilter, SignalGemType signalGemType, SignalGemsUiSortType signalGemsUiSortType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? new C29635kxP("", null, null, null, true, "501", 14, null) : c29635kxP, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? new SignalMetricsFilter(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : signalMetricsFilter, (i & 16) != 0 ? new SignalsFilter(null, null, null, null, 15, null) : signalsFilter, (i & 32) != 0 ? SignalGemType.ALL : signalGemType, (i & 64) != 0 ? SignalGemsUiSortType.MARKET_CAP_INCREASE : signalGemsUiSortType);
    }
}
