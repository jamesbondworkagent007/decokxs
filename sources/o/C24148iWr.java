package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24148iWr {
    public final java.util.List<C55276xgr> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24148iWr() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iWr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C24148iWr copy$default(C24148iWr c24148iWr, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c24148iWr.EZpvd;
        }
        return c24148iWr.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C55276xgr> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24148iWr copydefault(@NotNull java.util.List<C55276xgr> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C24148iWr(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24148iWr) && Intrinsics.EZpvd(this.EZpvd, ((C24148iWr) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AggregateFilter(filters=" + this.EZpvd + ")";
    }

    public C24148iWr(@NotNull java.util.List<C55276xgr> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:144)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.xgr>):void (m)] (LINE:143) call: o.iWr.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C24148iWr(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
