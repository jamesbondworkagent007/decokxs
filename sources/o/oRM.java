package o;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRM extends AbstractC49408unw<oRM> {
    public InterfaceC49371unL<IndexComponentsResp> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oRM() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oRM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oRM copy$default(oRM orm, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = orm.AEQbTJ;
        }
        return orm.AEQbTJ(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oRM AEQbTJ(@NotNull InterfaceC49371unL<IndexComponentsResp> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        return new oRM(interfaceC49371unL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<IndexComponentsResp> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC49371unL<IndexComponentsResp> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oRM) && Intrinsics.EZpvd(this.AEQbTJ, ((oRM) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IndexComponentsUiState(components=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:52) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp>):void (m)] (LINE:51) call: o.oRM.<init>(o.unL):void type: THIS */
    public /* synthetic */ oRM(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oRM(@NotNull InterfaceC49371unL<IndexComponentsResp> interfaceC49371unL) {
        super(new Function1() { // from class: o.oRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oRM.copydefault((oRM) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    public static final oRM copydefault(oRM orm) {
        Intrinsics.checkNotNullParameter(orm, "");
        return copy$default(orm, null, 1, null);
    }
}
