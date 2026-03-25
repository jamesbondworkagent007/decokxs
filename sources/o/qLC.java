package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLC extends C40512qYp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 com.okinc.market.quotation.ui.model.CategoryGroupVo)
  (r2v0 o.qrN)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:o.xNn:0x0004: INVOKE  STATIC call: o.pWO.KWHzl():o.xNn A[DONT_GENERATE, MD:():o.xNn (m), REMOVE, WRAPPED] (LINE:35))
 INTERFACE call: o.xNn.EZpvd():boolean A[DONT_GENERATE, MD:():boolean (m), REMOVE, WRAPPED] (LINE:35))
 A[WRAPPED]) : (r3v0 boolean))
 A[MD:(com.okinc.market.quotation.ui.model.CategoryGroupVo, o.qrN, boolean):void (m)] (LINE:32) call: o.qLC.<init>(com.okinc.market.quotation.ui.model.CategoryGroupVo, o.qrN, boolean):void type: THIS */
    public /* synthetic */ qLC(CategoryGroupVo categoryGroupVo, C41465qrN c41465qrN, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(categoryGroupVo, c41465qrN, (i & 4) != 0 ? !pWO.KWHzl().EZpvd() : z);
    }

    public qLC(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41465qrN c41465qrN, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        register(qLB.class, new C40168qLw(categoryGroupVo, c41465qrN, z));
    }
}
