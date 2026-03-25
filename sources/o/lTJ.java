package o;

import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lTJ {
    public static final lTJ KWHzl = new lTJ();

    private lTJ() {
    }

    public final boolean EZpvd(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.PIX_BUY.getCode());
    }
}
