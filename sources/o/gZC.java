package o;

import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.usecase.GetBridgeOrderListUseCase$invoke$1;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexlogic.bean.HistoryOrdersBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZC {
    public final InterfaceC20053gZd EZpvd;
    public final kYC copydefault;

    @yCM
    public gZC(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.EZpvd = interfaceC20053gZd;
        this.copydefault = kyc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C20071gZv c20071gZv, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<DefiBridgeOrderInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetBridgeOrderListUseCase$invoke$1 getBridgeOrderListUseCase$invoke$1;
        C20071gZv c20071gZv2;
        java.lang.Integer numAEQbTJ;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof GetBridgeOrderListUseCase$invoke$1) {
            getBridgeOrderListUseCase$invoke$1 = (GetBridgeOrderListUseCase$invoke$1) continuation;
            int i = getBridgeOrderListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBridgeOrderListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getBridgeOrderListUseCase$invoke$1 = new GetBridgeOrderListUseCase$invoke$1(this, continuation);
            }
        }
        GetBridgeOrderListUseCase$invoke$1 getBridgeOrderListUseCase$invoke$12 = getBridgeOrderListUseCase$invoke$1;
        java.lang.Object obj = getBridgeOrderListUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBridgeOrderListUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC20053gZd interfaceC20053gZd = this.EZpvd;
            java.lang.String strCopydefault = c20071gZv.copydefault();
            int iOLrzqt = c20071gZv.OLrzqt();
            java.lang.String strKWHzl = this.copydefault.KWHzl();
            java.lang.String strAhwBna = c20071gZv.AhwBna();
            BridgeOrderSubStatus bridgeOrderSubStatusAEQbTJ = c20071gZv.AEQbTJ();
            if (bridgeOrderSubStatusAEQbTJ != null) {
                numAEQbTJ = C56443yFo.AEQbTJ(bridgeOrderSubStatusAEQbTJ.getStatus());
                c20071gZv2 = c20071gZv;
            } else {
                c20071gZv2 = c20071gZv;
                numAEQbTJ = null;
            }
            getBridgeOrderListUseCase$invoke$12.L$0 = c20071gZv2;
            getBridgeOrderListUseCase$invoke$12.label = 1;
            objAEQbTJ = interfaceC20053gZd.AEQbTJ(strCopydefault, iOLrzqt, strKWHzl, strAhwBna, null, null, null, numAEQbTJ, null, getBridgeOrderListUseCase$invoke$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20071gZv c20071gZv3 = (C20071gZv) getBridgeOrderListUseCase$invoke$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            c20071gZv2 = c20071gZv3;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            HistoryOrdersBean historyOrdersBean = (HistoryOrdersBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            java.util.List<DefiBridgeOrderInfo> dataList = historyOrdersBean.getDataList();
            DefiBridgeOrderInfo defiBridgeOrderInfo = (DefiBridgeOrderInfo) CollectionsKt___CollectionsKt.wlaJM(historyOrdersBean.getDataList());
            java.lang.String time = defiBridgeOrderInfo != null ? defiBridgeOrderInfo.getTime() : null;
            if (time == null) {
                time = "";
            }
            return new AbstractC43419rot.StateListAnimator(new OrderListPagerResult(dataList, time, historyOrdersBean.getDataList().size() >= c20071gZv2.OLrzqt()));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
