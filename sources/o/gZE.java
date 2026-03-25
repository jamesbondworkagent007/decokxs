package o;

import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZE {
    public final InterfaceC20053gZd EZpvd;
    public final kYC copydefault;

    @yCM
    public gZE(@NotNull kYC kyc, @NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.copydefault = kyc;
        this.EZpvd = interfaceC20053gZd;
    }

    public final java.lang.Object copydefault(@NotNull C20071gZv c20071gZv, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<TradesOrderData>, OKServerException>> continuation) {
        InterfaceC20053gZd interfaceC20053gZd = this.EZpvd;
        java.lang.String strKWHzl = this.copydefault.KWHzl();
        java.lang.String strAhwBna = c20071gZv.AhwBna();
        java.lang.String strCopydefault = c20071gZv.copydefault();
        java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(c20071gZv.OLrzqt());
        OrderSubStatus orderSubStatusEZpvd = c20071gZv.EZpvd();
        return interfaceC20053gZd.copydefault(strKWHzl, strAhwBna, strCopydefault, numAEQbTJ, orderSubStatusEZpvd != null ? C56443yFo.AEQbTJ(orderSubStatusEZpvd.getStatus()) : null, continuation);
    }
}
