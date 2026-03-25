package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinVo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pYU extends AbstractC49408unw<pYU> {
    public InterfaceC49371unL<FilterCoinVo> KWHzl;
    public InterfaceC49371unL<TokenGroupVo> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pYU() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pYU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pYU copy$default(pYU pyu, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = pyu.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC49371unL2 = pyu.OLrzqt;
        }
        return pyu.AEQbTJ(interfaceC49371unL, interfaceC49371unL2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pYU AEQbTJ(@NotNull InterfaceC49371unL<FilterCoinVo> interfaceC49371unL, @NotNull InterfaceC49371unL<TokenGroupVo> interfaceC49371unL2) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        return new pYU(interfaceC49371unL, interfaceC49371unL2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<TokenGroupVo> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<FilterCoinVo> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC49371unL<TokenGroupVo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.OLrzqt = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC49371unL<FilterCoinVo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pYU)) {
            return false;
        }
        pYU pyu = (pYU) obj;
        return Intrinsics.EZpvd(this.KWHzl, pyu.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, pyu.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomFilterState(filterCoin=" + this.KWHzl + ", customGroup=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:67) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:68) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 o.unL))
 A[MD:(o.unL<com.okinc.market.discover.features.filter.data.model.FilterCoinVo>, o.unL<com.okinc.market.discover.features.filter.data.model.TokenGroupVo>):void (m)] (LINE:66) call: o.pYU.<init>(o.unL, o.unL):void type: THIS */
    public /* synthetic */ pYU(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pYU(@NotNull InterfaceC49371unL<FilterCoinVo> interfaceC49371unL, @NotNull InterfaceC49371unL<TokenGroupVo> interfaceC49371unL2) {
        super(new Function1() { // from class: o.pYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pYU.KWHzl((pYU) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        this.KWHzl = interfaceC49371unL;
        this.OLrzqt = interfaceC49371unL2;
    }

    public static final pYU KWHzl(pYU pyu) {
        Intrinsics.checkNotNullParameter(pyu, "");
        return copy$default(pyu, null, null, 3, null);
    }
}
