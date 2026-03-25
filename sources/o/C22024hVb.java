package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22024hVb extends hUT {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22024hVb(@NotNull OrderDetailBean orderDetailBean, @NotNull java.lang.String str) {
        super(orderDetailBean);
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.bean.OrderDetailBean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE 
  (wrap:com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType:0x0004: SGET  A[WRAPPED] (LINE:35) com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType.ITEM_TYPE_BOOST_VOLUME com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType)
 VIRTUAL call: com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:35)) : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String):void (m)] (LINE:35) call: o.hVb.<init>(com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String):void type: THIS */
    public /* synthetic */ C22024hVb(OrderDetailBean orderDetailBean, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetailBean, (i & 2) != 0 ? ItemType.ITEM_TYPE_BOOST_VOLUME.getValue() : str);
    }
}
