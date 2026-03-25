package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36157oRj extends AbstractC49408unw<C36157oRj> {
    public boolean OLrzqt;
    public InterfaceC49371unL<? extends java.util.List<? extends MarketEventsVo>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36157oRj() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oRj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36157oRj copy$default(C36157oRj c36157oRj, InterfaceC49371unL interfaceC49371unL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = c36157oRj.copydefault;
        }
        if ((i & 2) != 0) {
            z = c36157oRj.OLrzqt;
        }
        return c36157oRj.AEQbTJ(interfaceC49371unL, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36157oRj AEQbTJ(@NotNull InterfaceC49371unL<? extends java.util.List<? extends MarketEventsVo>> interfaceC49371unL, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        return new C36157oRj(interfaceC49371unL, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC49371unL<? extends java.util.List<? extends MarketEventsVo>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.copydefault = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo>>, o.unL<java.util.List<com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo>> */
    public final InterfaceC49371unL<java.util.List<MarketEventsVo>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36157oRj)) {
            return false;
        }
        C36157oRj c36157oRj = (C36157oRj) obj;
        return Intrinsics.EZpvd(this.copydefault, c36157oRj.copydefault) && this.OLrzqt == c36157oRj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketEventsUiState(eventList=" + this.copydefault + ", shouldShowRedDot=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:434) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 o.unL))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(o.unL<? extends java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo>>, boolean):void (m)] (LINE:433) call: o.oRj.<init>(o.unL, boolean):void type: THIS */
    public /* synthetic */ C36157oRj(InterfaceC49371unL interfaceC49371unL, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36157oRj(@NotNull InterfaceC49371unL<? extends java.util.List<? extends MarketEventsVo>> interfaceC49371unL, boolean z) {
        super(new Function1() { // from class: o.oRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36157oRj.AEQbTJ((C36157oRj) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.copydefault = interfaceC49371unL;
        this.OLrzqt = z;
    }

    public static final C36157oRj AEQbTJ(C36157oRj c36157oRj) {
        Intrinsics.checkNotNullParameter(c36157oRj, "");
        return copy$default(c36157oRj, null, false, 3, null);
    }
}
