package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTZ extends AbstractC49408unw<oTZ> {
    public java.util.List<? extends oTB> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oTZ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oTZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oTZ copy$default(oTZ otz, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = otz.copydefault;
        }
        return otz.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<? extends oTB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.oTB>, java.util.List<o.oTB> */
    public final java.util.List<oTB> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oTZ KWHzl(@NotNull java.util.List<? extends oTB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new oTZ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oTZ) && Intrinsics.EZpvd(this.copydefault, ((oTZ) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineSubSettingUiState(settings=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:68)) : (r1v0 java.util.List))
 A[MD:(java.util.List<? extends o.oTB>):void (m)] (LINE:67) call: o.oTZ.<init>(java.util.List):void type: THIS */
    public /* synthetic */ oTZ(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oTZ(@NotNull java.util.List<? extends oTB> list) {
        super(new Function1() { // from class: o.oUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oTZ.OLrzqt((oTZ) obj);
            }
        });
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    public static final oTZ OLrzqt(oTZ otz) {
        Intrinsics.checkNotNullParameter(otz, "");
        return copy$default(otz, null, 1, null);
    }
}
