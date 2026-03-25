package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBF {
    public final java.lang.String AEQbTJ;
    public final java.util.List<LeaderBoardSortModel> EZpvd;
    public final java.util.List<LeaderBoardSortModel> OLrzqt;
    public final java.util.List<LeaderBoardSortModel> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBF() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jBF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jBF copy$default(jBF jbf, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jbf.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = jbf.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = jbf.EZpvd;
        }
        if ((i & 8) != 0) {
            list3 = jbf.OLrzqt;
        }
        return jbf.copydefault(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LeaderBoardSortModel> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LeaderBoardSortModel> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LeaderBoardSortModel> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBF copydefault(@NotNull java.lang.String str, @NotNull java.util.List<LeaderBoardSortModel> list, @NotNull java.util.List<LeaderBoardSortModel> list2, @NotNull java.util.List<LeaderBoardSortModel> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new jBF(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBF)) {
            return false;
        }
        jBF jbf = (jBF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) jbf.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, jbf.copydefault) && Intrinsics.EZpvd(this.EZpvd, jbf.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, jbf.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardSettingsGroup(chainId=" + this.AEQbTJ + ", categories=" + this.copydefault + ", durations=" + this.EZpvd + ", rankings=" + this.OLrzqt + ")";
    }

    public jBF(@NotNull java.lang.String str, @NotNull java.util.List<LeaderBoardSortModel> list, @NotNull java.util.List<LeaderBoardSortModel> list2, @NotNull java.util.List<LeaderBoardSortModel> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.AEQbTJ = str;
        this.copydefault = list;
        this.EZpvd = list2;
        this.OLrzqt = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel>, java.util.List<com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel>, java.util.List<com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel>):void (m)] (LINE:13) call: o.jBF.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ jBF(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? yDY.AhwBna() : list3);
    }
}
