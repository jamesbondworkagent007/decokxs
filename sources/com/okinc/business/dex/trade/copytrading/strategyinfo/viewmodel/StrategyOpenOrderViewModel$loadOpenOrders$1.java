package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C20010gXo;
import o.C20064gZo;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyOpenOrderViewModel$loadOpenOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrategyOpenOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyOpenOrderViewModel$loadOpenOrders$1(StrategyOpenOrderViewModel strategyOpenOrderViewModel, Continuation<? super StrategyOpenOrderViewModel$loadOpenOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyOpenOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyOpenOrderViewModel$loadOpenOrders$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyOpenOrderViewModel$loadOpenOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8609invokeyxL6bBk$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20010gXo c20010gXo = this.this$0.djBIcL;
            String str = this.this$0.AkhnZx;
            boolean z2 = this.this$0.AYXKKw;
            String str2 = this.this$0.gEmmrt;
            this.label = 1;
            objM8609invokeyxL6bBk$default = C20010gXo.m8609invokeyxL6bBk$default(c20010gXo, str, z2, str2, 0, this, 8, null);
            if (objM8609invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8609invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        StrategyOpenOrderViewModel strategyOpenOrderViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8609invokeyxL6bBk$default)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objM8609invokeyxL6bBk$default;
            if (!orderListPagerResult.getDataList().isEmpty()) {
                strategyOpenOrderViewModel.gEmmrt = orderListPagerResult.getCursor();
                HashMap map = strategyOpenOrderViewModel.isConnected;
                List dataList = orderListPagerResult.getDataList();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(dataList, 10)), 16));
                for (Object obj2 : dataList) {
                    linkedHashMap.put(((CTOpenOrderResponse) obj2).getOrderId(), obj2);
                }
                map.putAll(linkedHashMap);
                MutableStateFlow<InterfaceC20068gZs> mutableStateFlowValueOf = strategyOpenOrderViewModel.valueOf();
                List dataList2 = orderListPagerResult.getDataList();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList2, 10));
                Iterator it = dataList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C20064gZo.Companion.OLrzqt((CTOpenOrderResponse) it.next(), strategyOpenOrderViewModel.DbNXlk.KWHzl()));
                }
                mutableStateFlowValueOf.setValue(new InterfaceC20068gZs.StateListAnimator(strategyOpenOrderViewModel.OLrzqt.AEQbTJ(arrayList), orderListPagerResult.getHasNext(), null, 4, null));
            } else {
                strategyOpenOrderViewModel.valueOf().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            }
        }
        StrategyOpenOrderViewModel strategyOpenOrderViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8609invokeyxL6bBk$default);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow<InterfaceC20068gZs> mutableStateFlowValueOf2 = strategyOpenOrderViewModel2.valueOf();
            if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlowValueOf2.setValue(new InterfaceC20068gZs.Application(z));
        }
        return Unit.INSTANCE;
    }
}
