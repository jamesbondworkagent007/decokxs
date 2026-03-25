package o;

import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55917xsw {
    public final java.util.List<TacticsInsideItemData> AEQbTJ;
    public final java.util.List<TacticsInsideItemData> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55917xsw() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xsw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55917xsw copy$default(C55917xsw c55917xsw, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c55917xsw.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = c55917xsw.OLrzqt;
        }
        return c55917xsw.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsInsideItemData> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsInsideItemData> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55917xsw OLrzqt(@NotNull java.util.List<TacticsInsideItemData> list, @NotNull java.util.List<TacticsInsideItemData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C55917xsw(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55917xsw)) {
            return false;
        }
        C55917xsw c55917xsw = (C55917xsw) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c55917xsw.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c55917xsw.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GridEditConfirmParam(before=" + this.AEQbTJ + ", after=" + this.OLrzqt + ")";
    }

    public C55917xsw(@NotNull java.util.List<TacticsInsideItemData> list, @NotNull java.util.List<TacticsInsideItemData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = list;
        this.OLrzqt = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:370)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:371)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.bot.data.TacticsInsideItemData>, java.util.List<com.okinc.unify_trade.bot.data.TacticsInsideItemData>):void (m)] (LINE:369) call: o.xsw.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C55917xsw(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
