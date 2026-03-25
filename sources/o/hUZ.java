package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hUZ extends hUT {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hUZ(@NotNull OrderDetailBean orderDetailBean) {
        super(orderDetailBean);
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        this.KWHzl = ItemType.ITEM_TYPE_DIVIDER.getValue();
    }
}
