package o;

import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZB {
    public final InterfaceC20053gZd KWHzl;
    public final kYC copydefault;

    @yCM
    public gZB(@NotNull kYC kyc, @NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.copydefault = kyc;
        this.KWHzl = interfaceC20053gZd;
    }

    public final java.lang.Object copydefault(@NotNull C20071gZv c20071gZv, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<HistoryOrderData>, ? extends java.lang.Exception>> continuation) {
        InterfaceC9738bbJ interfaceC9738bbJCopydefault;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (this.copydefault.copydefault() == null || ((interfaceC9738bbJCopydefault = this.copydefault.copydefault()) != null && interfaceC9738bbJCopydefault.QfsBiF())) {
            return new AbstractC43419rot.StateListAnimator(new OrderListPagerResult(yDY.AhwBna(), "", false));
        }
        InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
        java.lang.String strKWHzl = this.copydefault.KWHzl();
        OrderSubStatus orderSubStatusEZpvd = c20071gZv.EZpvd();
        java.util.List listEZpvd = orderSubStatusEZpvd != null ? C56402yEa.EZpvd(C56443yFo.AEQbTJ(orderSubStatusEZpvd.getStatus())) : null;
        java.util.List<OrderStrategyType> listKWHzl = c20071gZv.KWHzl();
        if (listKWHzl != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.AEQbTJ(((OrderStrategyType) it.next()).getType()));
            }
        } else {
            arrayList = null;
        }
        java.lang.String strAhwBna = c20071gZv.AhwBna();
        java.util.List listEZpvd2 = strAhwBna != null ? C56402yEa.EZpvd(strAhwBna) : null;
        java.util.List<DexMultiTokenInfoBean> listGEmmrt = c20071gZv.gEmmrt();
        if (listGEmmrt != null) {
            arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (DexMultiTokenInfoBean dexMultiTokenInfoBean : listGEmmrt) {
                arrayList2.add(new HistoryOrderRequest.TokenAddress(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()));
            }
        } else {
            arrayList2 = null;
        }
        java.lang.String strCopydefault = c20071gZv.copydefault();
        return interfaceC20053gZd.AEQbTJ(new HistoryOrderRequest(strKWHzl, listEZpvd, arrayList, listEZpvd2, strCopydefault.length() == 0 ? null : strCopydefault, arrayList2, c20071gZv.OLrzqt()), continuation);
    }
}
