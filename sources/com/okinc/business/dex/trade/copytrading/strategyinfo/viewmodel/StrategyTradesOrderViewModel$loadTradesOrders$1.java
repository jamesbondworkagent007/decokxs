package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C20012gXq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyTradesOrderViewModel$loadTradesOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrategyTradesOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyTradesOrderViewModel$loadTradesOrders$1(StrategyTradesOrderViewModel strategyTradesOrderViewModel, Continuation<? super StrategyTradesOrderViewModel$loadTradesOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyTradesOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyTradesOrderViewModel$loadTradesOrders$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyTradesOrderViewModel$loadTradesOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8610invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20012gXq c20012gXq = this.this$0.KWHzl;
            String str = this.this$0.djBIcL;
            String str2 = this.this$0.OLrzqt;
            this.label = 1;
            objM8610invokeBWLJW6A$default = C20012gXq.m8610invokeBWLJW6A$default(c20012gXq, str, str2, 0, this, 4, null);
            if (objM8610invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8610invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        StrategyTradesOrderViewModel strategyTradesOrderViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8610invokeBWLJW6A$default)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objM8610invokeBWLJW6A$default;
            if (!orderListPagerResult.getDataList().isEmpty()) {
                strategyTradesOrderViewModel.OLrzqt = orderListPagerResult.getCursor();
                MutableStateFlow<InterfaceC20068gZs> mutableStateFlowAEQbTJ = strategyTradesOrderViewModel.AEQbTJ();
                List dataList = orderListPagerResult.getDataList();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
                Iterator it = dataList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TradesOrderData) it.next()).toUiData());
                }
                mutableStateFlowAEQbTJ.setValue(new InterfaceC20068gZs.StateListAnimator(strategyTradesOrderViewModel.EZpvd.AEQbTJ(arrayList), orderListPagerResult.getHasNext(), null, 4, null));
            } else {
                strategyTradesOrderViewModel.AEQbTJ().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            }
        }
        StrategyTradesOrderViewModel strategyTradesOrderViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8610invokeBWLJW6A$default) != null) {
            strategyTradesOrderViewModel2.AEQbTJ().setValue(new InterfaceC20068gZs.Application(false));
        }
        return Unit.INSTANCE;
    }
}
