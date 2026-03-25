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
import o.C20064gZo;
import o.C20071gZv;
import o.C20075gZz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56532yIw;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPagerViewModel$loadMoreOpenOrderList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPagerViewModel$loadMoreOpenOrderList$1(OrderPagerViewModel orderPagerViewModel, Continuation<? super OrderPagerViewModel$loadMoreOpenOrderList$1> continuation) {
        super(2, continuation);
        this.this$0 = orderPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderPagerViewModel$loadMoreOpenOrderList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderPagerViewModel$loadMoreOpenOrderList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        List<Object> listEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.this$0.djBIcL;
            OrderSubStatus orderSubStatusAYXKKw = this.this$0.AYXKKw();
            OrderFilterStrategyType orderFilterStrategyTypeEZpvd = this.this$0.EZpvd();
            List<OrderStrategyType> types = orderFilterStrategyTypeEZpvd != null ? orderFilterStrategyTypeEZpvd.getTypes() : null;
            DefiChainInfo defiChainInfoGEmmrt = this.this$0.gEmmrt();
            C20071gZv c20071gZv = new C20071gZv(str, orderSubStatusAYXKKw, null, types, defiChainInfoGEmmrt != null ? defiChainInfoGEmmrt.getChainId() : null, this.this$0.getNewProxyInstance, 20, 4, null);
            C20075gZz c20075gZz = this.this$0.fetchVPNInfo;
            this.label = 1;
            objEZpvd = c20075gZz.EZpvd(c20071gZv, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        OrderPagerViewModel orderPagerViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objEZpvd;
            InterfaceC20068gZs.StateListAnimator stateListAnimatorUzCIH = orderPagerViewModel.uzCIH();
            List listFJNWhG = (stateListAnimatorUzCIH == null || (listEZpvd = stateListAnimatorUzCIH.EZpvd()) == null) ? null : CollectionsKt___CollectionsKt.fJNWhG((Collection) listEZpvd);
            if (!C56532yIw.DbNXlk(listFJNWhG)) {
                listFJNWhG = null;
            }
            if (listFJNWhG == null) {
                return Unit.INSTANCE;
            }
            List dataList = orderListPagerResult.getDataList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
            Iterator it = dataList.iterator();
            while (it.hasNext()) {
                arrayList.add(C20064gZo.Companion.OLrzqt((OpenOrderData) it.next(), orderPagerViewModel.uzCIH.KWHzl()));
            }
            listFJNWhG.addAll(arrayList);
            List listAEQbTJ = orderPagerViewModel.AYXKKw.AEQbTJ(listFJNWhG);
            if (!listAEQbTJ.isEmpty()) {
                orderPagerViewModel.djBIcL = orderListPagerResult.getCursor();
                orderPagerViewModel.EZpvd((List<? extends Object>) listAEQbTJ, orderListPagerResult.getHasNext());
            } else {
                orderPagerViewModel.DbNXlk().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
                return Unit.INSTANCE;
            }
        }
        OrderPagerViewModel orderPagerViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            if ((thM7380exceptionOrNullimpl instanceof WalletJwtException) || ((thM7380exceptionOrNullimpl instanceof OKServerException) && (((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException))) {
                orderPagerViewModel2.DbNXlk().setValue(new InterfaceC20068gZs.Application(true));
            } else {
                orderPagerViewModel2.DbNXlk().setValue(InterfaceC20068gZs.Fragment.KWHzl);
            }
        }
        return Unit.INSTANCE;
    }
}
