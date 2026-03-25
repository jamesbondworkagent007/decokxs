package o;

import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qNG extends C40512qYp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r7v0 o.qsT)
  (r8v0 o.qrN)
  (r9v0 o.qso)
  (r10v0 o.qqW)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:NOT 
  (wrap:boolean:0x0008: INVOKE 
  (wrap:o.xNn:0x0004: INVOKE  STATIC call: o.pWO.KWHzl():o.xNn A[DONT_GENERATE, MD:():o.xNn (m), REMOVE, WRAPPED] (LINE:44))
 INTERFACE call: o.xNn.EZpvd():boolean A[DONT_GENERATE, MD:():boolean (m), REMOVE, WRAPPED] (LINE:44))
 A[WRAPPED]) : (r11v0 boolean))
 A[MD:(o.qsT, o.qrN, o.qso, o.qqW, boolean):void (m)] (LINE:39) call: o.qNG.<init>(o.qsT, o.qrN, o.qso, o.qqW, boolean):void type: THIS */
    public /* synthetic */ qNG(C41524qsT c41524qsT, C41465qrN c41465qrN, C41545qso c41545qso, C41421qqW c41421qqW, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41524qsT, c41465qrN, c41545qso, c41421qqW, (i & 16) != 0 ? !pWO.KWHzl().EZpvd() : z);
    }

    public qNG(@NotNull C41524qsT c41524qsT, @NotNull C41465qrN c41465qrN, @NotNull C41545qso c41545qso, @NotNull C41421qqW c41421qqW, boolean z) {
        Intrinsics.checkNotNullParameter(c41524qsT, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        Intrinsics.checkNotNullParameter(c41545qso, "");
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        register(C40246qOt.class, new qNU());
        register(C40241qOo.class, new qNL());
        register(C40245qOs.class, new qNT());
        register(C40240qOn.class, new qNO());
        register(qRT.class, new qNW(c41524qsT, z));
        register(C40249qOw.class, new qNX());
        register(C40238qOl.class, new qNY());
        register(C40243qOq.class, new qNP());
        register(C40239qOm.class, new qNH());
        register(qLB.class, new qNN(c41465qrN, z));
        register(C40206qNg.class, new qNS(c41545qso, z));
        register(C40236qOj.class, new qNK());
        register(C40242qOp.class, new qNM());
        register(C40128qKj.class, new qJY(DexChainGroupVo.Companion.copydefault(), c41421qqW));
    }
}
