package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qRK extends C40512qYp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 com.okinc.market.quotation.ui.model.CategoryGroupVo)
  (r2v0 o.qsT)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:o.xNn:0x0004: INVOKE  STATIC call: o.pWO.KWHzl():o.xNn A[DONT_GENERATE, MD:():o.xNn (m), REMOVE, WRAPPED] (LINE:32))
 INTERFACE call: o.xNn.EZpvd():boolean A[DONT_GENERATE, MD:():boolean (m), REMOVE, WRAPPED] (LINE:32))
 A[WRAPPED]) : (r3v0 boolean))
 A[MD:(com.okinc.market.quotation.ui.model.CategoryGroupVo, o.qsT, boolean):void (m)] (LINE:29) call: o.qRK.<init>(com.okinc.market.quotation.ui.model.CategoryGroupVo, o.qsT, boolean):void type: THIS */
    public /* synthetic */ qRK(CategoryGroupVo categoryGroupVo, C41524qsT c41524qsT, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(categoryGroupVo, c41524qsT, (i & 4) != 0 ? !pWO.KWHzl().EZpvd() : z);
    }

    public qRK(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41524qsT c41524qsT, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41524qsT, "");
        register(qRT.class, new qRH(categoryGroupVo, c41524qsT, z));
    }
}
