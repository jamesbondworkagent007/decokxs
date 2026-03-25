package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21795hMp extends AbstractC21793hMn {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21795hMp(@NotNull OrderDetailResult orderDetailResult) {
        super(orderDetailResult);
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        this.KWHzl = ItemType.ITEM_TYPE_BOOST_VOLUME.getValue();
    }
}
