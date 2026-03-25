package o;

import com.okinc.unify_trade.biz.UserTierData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36180oSf extends AbstractC49408unw<C36180oSf> {
    public InterfaceC49371unL<? extends java.util.List<UserTierData>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36180oSf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oSf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36180oSf copy$default(C36180oSf c36180oSf, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = c36180oSf.KWHzl;
        }
        return c36180oSf.OLrzqt((InterfaceC49371unL<? extends java.util.List<UserTierData>>) interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends java.util.List<UserTierData>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<com.okinc.unify_trade.biz.UserTierData>>, o.unL<java.util.List<com.okinc.unify_trade.biz.UserTierData>> */
    public final InterfaceC49371unL<java.util.List<UserTierData>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36180oSf OLrzqt(@NotNull InterfaceC49371unL<? extends java.util.List<UserTierData>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        return new C36180oSf(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36180oSf) && Intrinsics.EZpvd(this.KWHzl, ((C36180oSf) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PositionTierUiState(tierList=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:91) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<com.okinc.unify_trade.biz.UserTierData>>):void (m)] (LINE:90) call: o.oSf.<init>(o.unL):void type: THIS */
    public /* synthetic */ C36180oSf(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36180oSf(@NotNull InterfaceC49371unL<? extends java.util.List<UserTierData>> interfaceC49371unL) {
        super(new Function1() { // from class: o.oSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36180oSf.OLrzqt((C36180oSf) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    public static final C36180oSf OLrzqt(C36180oSf c36180oSf) {
        Intrinsics.checkNotNullParameter(c36180oSf, "");
        return copy$default(c36180oSf, null, 1, null);
    }
}
