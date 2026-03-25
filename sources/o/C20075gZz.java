package o;

import com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TeeOrderStatusData;
import com.okinc.business.dex.trade.order.domain.usecase.GetOpenOrderUseCase$invoke$1;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20075gZz {
    public final InterfaceC20053gZd EZpvd;
    public final kYC KWHzl;

    @yCM
    public C20075gZz(@NotNull kYC kyc, @NotNull InterfaceC20053gZd interfaceC20053gZd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        this.KWHzl = kyc;
        this.EZpvd = interfaceC20053gZd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C20071gZv c20071gZv, @NotNull Continuation<? super Result<OrderListPagerResult<OpenOrderData>>> continuation) {
        GetOpenOrderUseCase$invoke$1 getOpenOrderUseCase$invoke$1;
        InterfaceC9738bbJ interfaceC9738bbJCopydefault;
        C20075gZz c20075gZz;
        C20071gZv c20071gZv2;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (continuation instanceof GetOpenOrderUseCase$invoke$1) {
            getOpenOrderUseCase$invoke$1 = (GetOpenOrderUseCase$invoke$1) continuation;
            int i = getOpenOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOpenOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOpenOrderUseCase$invoke$1 = new GetOpenOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getOpenOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOpenOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (this.KWHzl.copydefault() == null || ((interfaceC9738bbJCopydefault = this.KWHzl.copydefault()) != null && interfaceC9738bbJCopydefault.QfsBiF())) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(new OrderListPagerResult(yDY.AhwBna(), "", false));
                }
                InterfaceC20053gZd interfaceC20053gZd = this.EZpvd;
                java.lang.String strKWHzl = this.KWHzl.KWHzl();
                getOpenOrderUseCase$invoke$1.L$0 = this;
                getOpenOrderUseCase$invoke$1.L$1 = c20071gZv;
                getOpenOrderUseCase$invoke$1.label = 1;
                objAEQbTJ = interfaceC20053gZd.AEQbTJ(strKWHzl, getOpenOrderUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c20075gZz = this;
                c20071gZv2 = c20071gZv;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    return Result.m7377constructorimpl((OrderListPagerResult) C25389ivm.KWHzl((AbstractC43419rot) objAEQbTJ));
                }
                c20071gZv2 = (C20071gZv) getOpenOrderUseCase$invoke$1.L$1;
                c20075gZz = (C20075gZz) getOpenOrderUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            java.util.List list = (java.util.List) ((AbstractC43419rot) objAEQbTJ).copydefault();
            if (list != null) {
                java.lang.String strAhwBna = c20071gZv2.AhwBna();
                if (strAhwBna != null && strAhwBna.length() != 0) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((TeeOrderStatusData) obj).getChainId(), (java.lang.Object) c20071gZv2.AhwBna())) {
                            arrayList3.add(obj);
                        }
                    }
                    list = arrayList3;
                }
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(new OrderListPagerResult(yDY.AhwBna(), "", false));
            }
            Result.Application application3 = Result.Companion;
            InterfaceC20053gZd interfaceC20053gZd2 = c20075gZz.EZpvd;
            java.lang.String strKWHzl2 = c20075gZz.KWHzl.KWHzl();
            int iOLrzqt = c20071gZv2.OLrzqt();
            java.lang.String strCopydefault = c20071gZv2.copydefault();
            OrderSubStatus orderSubStatusEZpvd = c20071gZv2.EZpvd();
            java.util.List listEZpvd = orderSubStatusEZpvd != null ? C56402yEa.EZpvd(C56443yFo.AEQbTJ(orderSubStatusEZpvd.getStatus())) : null;
            java.util.List<OrderStrategyType> listKWHzl = c20071gZv2.KWHzl();
            if (listKWHzl != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    arrayList4.add(C56443yFo.AEQbTJ(((OrderStrategyType) it.next()).getType()));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            java.lang.String strAhwBna2 = c20071gZv2.AhwBna();
            java.util.List listEZpvd2 = strAhwBna2 != null ? C56402yEa.EZpvd(strAhwBna2) : null;
            java.util.List<DexMultiTokenInfoBean> listGEmmrt = c20071gZv2.gEmmrt();
            if (listGEmmrt != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
                for (DexMultiTokenInfoBean dexMultiTokenInfoBean : listGEmmrt) {
                    arrayList5.add(new HistoryOrderRequest.TokenAddress(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()));
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            OpenOrderRequest openOrderRequest = new OpenOrderRequest(strKWHzl2, iOLrzqt, strCopydefault, listEZpvd2, arrayList, arrayList2, listEZpvd);
            getOpenOrderUseCase$invoke$1.L$0 = null;
            getOpenOrderUseCase$invoke$1.L$1 = null;
            getOpenOrderUseCase$invoke$1.label = 2;
            objAEQbTJ = interfaceC20053gZd2.OLrzqt(openOrderRequest, getOpenOrderUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            return Result.m7377constructorimpl((OrderListPagerResult) C25389ivm.KWHzl((AbstractC43419rot) objAEQbTJ));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
