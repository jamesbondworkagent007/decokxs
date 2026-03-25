package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36223oTv extends AbstractC49408unw<C36223oTv> {
    public java.util.List<? extends oSJ> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36223oTv() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oTv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36223oTv copy$default(C36223oTv c36223oTv, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c36223oTv.OLrzqt;
        }
        return c36223oTv.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<? extends oSJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36223oTv OLrzqt(@NotNull java.util.List<? extends oSJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C36223oTv(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.oSJ>, java.util.List<o.oSJ> */
    public final java.util.List<oSJ> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36223oTv) && Intrinsics.EZpvd(this.OLrzqt, ((C36223oTv) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineSettingUiState(settingItems=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r1v0 java.util.List))
 A[MD:(java.util.List<? extends o.oSJ>):void (m)] (LINE:49) call: o.oTv.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C36223oTv(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36223oTv(@NotNull java.util.List<? extends oSJ> list) {
        super(new Function1() { // from class: o.oTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36223oTv.EZpvd((C36223oTv) obj);
            }
        });
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    public static final C36223oTv EZpvd(C36223oTv c36223oTv) {
        Intrinsics.checkNotNullParameter(c36223oTv, "");
        return copy$default(c36223oTv, null, 1, null);
    }
}
