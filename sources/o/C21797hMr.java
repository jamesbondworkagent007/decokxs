package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21797hMr extends AbstractC21793hMn {
    public Function0<Unit> AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult)
  (r2v0 java.lang.String)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:17) call: o.hMr.<init>(com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C21797hMr(OrderDetailResult orderDetailResult, java.lang.String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetailResult, str, (i & 4) != 0 ? null : function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21797hMr(@NotNull OrderDetailResult orderDetailResult, @NotNull java.lang.String str, Function0<Unit> function0) {
        super(orderDetailResult);
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = function0;
    }
}
