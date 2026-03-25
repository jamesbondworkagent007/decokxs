package o;

import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pYW extends AbstractC49408unw<pYW> {
    public InterfaceC49371unL<? extends java.util.List<TokenGroupVo>> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pYW() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pYW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pYW copy$default(pYW pyw, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = pyw.AEQbTJ;
        }
        return pyw.OLrzqt(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends java.util.List<TokenGroupVo>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pYW OLrzqt(@NotNull InterfaceC49371unL<? extends java.util.List<TokenGroupVo>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        return new pYW(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<com.okinc.market.discover.features.filter.data.model.TokenGroupVo>>, o.unL<java.util.List<com.okinc.market.discover.features.filter.data.model.TokenGroupVo>> */
    public final InterfaceC49371unL<java.util.List<TokenGroupVo>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pYW) && Intrinsics.EZpvd(this.AEQbTJ, ((pYW) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenGroupState(groupList=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:57) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<com.okinc.market.discover.features.filter.data.model.TokenGroupVo>>):void (m)] (LINE:56) call: o.pYW.<init>(o.unL):void type: THIS */
    public /* synthetic */ pYW(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pYW(@NotNull InterfaceC49371unL<? extends java.util.List<TokenGroupVo>> interfaceC49371unL) {
        super(new Function1() { // from class: o.pYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pYW.copydefault((pYW) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    public static final pYW copydefault(pYW pyw) {
        Intrinsics.checkNotNullParameter(pyw, "");
        return copy$default(pyw, null, 1, null);
    }
}
