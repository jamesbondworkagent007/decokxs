package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C20061gZl;
import o.C20064gZo;
import o.C20071gZv;
import o.C20075gZz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPagerViewModel$loadOpenOrderList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPagerViewModel$loadOpenOrderList$1(OrderPagerViewModel orderPagerViewModel, Continuation<? super OrderPagerViewModel$loadOpenOrderList$1> continuation) {
        super(2, continuation);
        this.this$0 = orderPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderPagerViewModel$loadOpenOrderList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderPagerViewModel$loadOpenOrderList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OrderSubStatus orderSubStatusAYXKKw = this.this$0.AYXKKw();
            OrderFilterStrategyType orderFilterStrategyTypeEZpvd = this.this$0.EZpvd();
            List<OrderStrategyType> types = orderFilterStrategyTypeEZpvd != null ? orderFilterStrategyTypeEZpvd.getTypes() : null;
            DefiChainInfo defiChainInfoGEmmrt = this.this$0.gEmmrt();
            C20071gZv c20071gZv = new C20071gZv("", orderSubStatusAYXKKw, null, types, defiChainInfoGEmmrt != null ? defiChainInfoGEmmrt.getChainId() : null, this.this$0.getNewProxyInstance, this.this$0.gEmmrt ? 100 : 20, 4, null);
            C20075gZz c20075gZz = this.this$0.fetchVPNInfo;
            this.label = 1;
            Object objEZpvd = c20075gZz.EZpvd(c20071gZv, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        OrderPagerViewModel orderPagerViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objM7386unboximpl;
            List dataList = orderListPagerResult.getDataList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
            Iterator it = dataList.iterator();
            while (it.hasNext()) {
                arrayList.add(C20064gZo.Companion.OLrzqt((OpenOrderData) it.next(), orderPagerViewModel.uzCIH.KWHzl()));
            }
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) orderPagerViewModel.AYXKKw.AEQbTJ(arrayList));
            if (!listFJNWhG.isEmpty()) {
                orderPagerViewModel.djBIcL = orderListPagerResult.getCursor();
                if (orderPagerViewModel.gEmmrt && listFJNWhG.size() >= 100) {
                    listFJNWhG.add(new C20061gZl(100));
                }
                orderPagerViewModel.EZpvd((List<? extends Object>) listFJNWhG, orderPagerViewModel.gEmmrt ? false : orderListPagerResult.getHasNext());
            } else {
                orderPagerViewModel.DbNXlk().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
                return Unit.INSTANCE;
            }
        }
        OrderPagerViewModel orderPagerViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow<InterfaceC20068gZs> mutableStateFlowDbNXlk = orderPagerViewModel2.DbNXlk();
            if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlowDbNXlk.setValue(new InterfaceC20068gZs.Application(z));
        }
        return Unit.INSTANCE;
    }
}
