package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hUX extends hUT {
    public final int AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.bean.OrderDetailBean)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.hvD.Fragment.gUEfcq int) : (r4v0 int))
 A[MD:(com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String, java.lang.String, int):void (m)] (LINE:37) call: o.hUX.<init>(com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ hUX(OrderDetailBean orderDetailBean, java.lang.String str, java.lang.String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetailBean, str, str2, (i2 & 8) != 0 ? C23274hvD.Fragment.gUEfcq : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hUX(@NotNull OrderDetailBean orderDetailBean, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i) {
        super(orderDetailBean);
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = i;
        this.copydefault = ItemType.ITEM_TYPE_WALLET_USED.getValue();
    }
}
