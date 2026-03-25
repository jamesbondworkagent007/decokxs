package o;

import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53393wke {
    public java.util.List<? extends java.lang.Object> EZpvd;
    public java.util.List<TacticsInsideItemData> KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53393wke() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wke */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C53393wke copy$default(C53393wke c53393wke, java.util.List list, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c53393wke.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = c53393wke.KWHzl;
        }
        if ((i & 4) != 0) {
            str = c53393wke.copydefault;
        }
        return c53393wke.KWHzl(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53393wke KWHzl(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.util.List<TacticsInsideItemData> list2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C53393wke(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsInsideItemData> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53393wke)) {
            return false;
        }
        C53393wke c53393wke = (C53393wke) obj;
        return Intrinsics.EZpvd(this.EZpvd, c53393wke.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c53393wke.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c53393wke.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SpotDcaEditConfirmParam(before=" + this.EZpvd + ", after=" + this.KWHzl + ", notice=" + this.copydefault + ")";
    }

    public C53393wke(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.util.List<TacticsInsideItemData> list2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = list;
        this.KWHzl = list2;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:888)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:889)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.util.List<? extends java.lang.Object>, java.util.List<com.okinc.unify_trade.bot.data.TacticsInsideItemData>, java.lang.String):void (m)] (LINE:887) call: o.wke.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C53393wke(java.util.List list, java.util.List list2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? "" : str);
    }
}
