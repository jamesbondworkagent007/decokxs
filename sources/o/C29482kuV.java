package o;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29482kuV {
    public final java.util.List<C29635kxP> EZpvd;
    public final java.util.List<SignalMultiSelectUiModel> KWHzl;
    public final java.util.Map<java.lang.String, java.util.List<SignalMultiSelectUiModel>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29482kuV() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kuV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29482kuV copy$default(C29482kuV c29482kuV, java.util.List list, java.util.List list2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29482kuV.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = c29482kuV.EZpvd;
        }
        if ((i & 4) != 0) {
            map = c29482kuV.OLrzqt;
        }
        return c29482kuV.KWHzl(list, list2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SignalMultiSelectUiModel> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C29635kxP> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29482kuV KWHzl(@NotNull java.util.List<SignalMultiSelectUiModel> list, @NotNull java.util.List<C29635kxP> list2, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<SignalMultiSelectUiModel>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new C29482kuV(list, list2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<SignalMultiSelectUiModel>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29482kuV)) {
            return false;
        }
        C29482kuV c29482kuV = (C29482kuV) obj;
        return Intrinsics.EZpvd(this.KWHzl, c29482kuV.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c29482kuV.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c29482kuV.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalFilterConfigState(availableInfluencerSelectors=" + this.KWHzl + ", availableChainFilters=" + this.EZpvd + ", chainSupportedProtocols=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C29482kuV(@NotNull java.util.List<SignalMultiSelectUiModel> list, @NotNull java.util.List<C29635kxP> list2, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<SignalMultiSelectUiModel>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = list;
        this.EZpvd = list2;
        this.OLrzqt = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r2v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0014: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:29)) : (r3v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>, java.util.List<o.kxP>, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>>):void (m)] (LINE:26) call: o.kuV.<init>(java.util.List, java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ C29482kuV(java.util.List list, java.util.List list2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }
}
