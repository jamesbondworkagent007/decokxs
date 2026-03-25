package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C20061gZl;
import o.C20064gZo;
import o.C20071gZv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.gZB;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPagerViewModel$loadHistoryOrderList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPagerViewModel$loadHistoryOrderList$1(OrderPagerViewModel orderPagerViewModel, Continuation<? super OrderPagerViewModel$loadHistoryOrderList$1> continuation) {
        super(2, continuation);
        this.this$0 = orderPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderPagerViewModel$loadHistoryOrderList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderPagerViewModel$loadHistoryOrderList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gZB gzb = this.this$0.AkhnZx;
            OrderSubStatus orderSubStatusAYXKKw = this.this$0.AYXKKw();
            OrderFilterStrategyType orderFilterStrategyTypeEZpvd = this.this$0.EZpvd();
            List<OrderStrategyType> types = orderFilterStrategyTypeEZpvd != null ? orderFilterStrategyTypeEZpvd.getTypes() : null;
            DefiChainInfo defiChainInfoGEmmrt = this.this$0.gEmmrt();
            C20071gZv c20071gZv = new C20071gZv("", orderSubStatusAYXKKw, null, types, defiChainInfoGEmmrt != null ? defiChainInfoGEmmrt.getChainId() : null, this.this$0.getNewProxyInstance, this.this$0.gEmmrt ? 100 : 20, 4, null);
            this.label = 1;
            objCopydefault = gzb.copydefault(c20071gZv, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        OrderPagerViewModel orderPagerViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            orderPagerViewModel.djBIcL = orderListPagerResult.getCursor();
            if (orderListPagerResult.getDataList().isEmpty()) {
                orderPagerViewModel.DbNXlk().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            List dataList = orderListPagerResult.getDataList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
            Iterator it = dataList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C20064gZo.Companion.KWHzl((HistoryOrderData) it.next()));
            }
            arrayList.addAll(orderPagerViewModel.AYXKKw.AEQbTJ(arrayList2));
            if (orderPagerViewModel.gEmmrt && arrayList.size() >= 100) {
                arrayList.add(new C20061gZl(100));
            }
            orderPagerViewModel.EZpvd((List<? extends Object>) arrayList, orderPagerViewModel.gEmmrt ? false : orderListPagerResult.getHasNext());
        }
        OrderPagerViewModel orderPagerViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            Exception exc = (Exception) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            MutableStateFlow<InterfaceC20068gZs> mutableStateFlowDbNXlk = orderPagerViewModel2.DbNXlk();
            if (!(exc instanceof WalletJwtException)) {
                z = exc instanceof OKServerException ? ((OKServerException) exc).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlowDbNXlk.setValue(new InterfaceC20068gZs.Application(z));
        }
        return Unit.INSTANCE;
    }
}
