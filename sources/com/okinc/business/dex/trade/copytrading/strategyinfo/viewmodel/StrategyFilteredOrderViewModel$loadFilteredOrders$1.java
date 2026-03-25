package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.network.okg.response.OKServerException;
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
import o.C20006gXk;
import o.C20008gXm;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC20068gZs;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyFilteredOrderViewModel$loadFilteredOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrategyFilteredOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyFilteredOrderViewModel$loadFilteredOrders$1(StrategyFilteredOrderViewModel strategyFilteredOrderViewModel, Continuation<? super StrategyFilteredOrderViewModel$loadFilteredOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyFilteredOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyFilteredOrderViewModel$loadFilteredOrders$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyFilteredOrderViewModel$loadFilteredOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8608invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20006gXk c20006gXk = this.this$0.copydefault;
            String str = this.this$0.gEmmrt;
            String str2 = this.this$0.EZpvd;
            this.label = 1;
            objM8608invokeBWLJW6A$default = C20006gXk.m8608invokeBWLJW6A$default(c20006gXk, str, str2, 0, this, 4, null);
            if (objM8608invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8608invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        StrategyFilteredOrderViewModel strategyFilteredOrderViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8608invokeBWLJW6A$default)) {
            OrderListPagerResult orderListPagerResult = (OrderListPagerResult) objM8608invokeBWLJW6A$default;
            if (!orderListPagerResult.getDataList().isEmpty()) {
                strategyFilteredOrderViewModel.EZpvd = orderListPagerResult.getCursor();
                MutableStateFlow<InterfaceC20068gZs> mutableStateFlowKWHzl = strategyFilteredOrderViewModel.KWHzl();
                List dataList = orderListPagerResult.getDataList();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
                Iterator it = dataList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C20008gXm.Companion.EZpvd((CTFilteredOrderResponse) it.next()));
                }
                mutableStateFlowKWHzl.setValue(new InterfaceC20068gZs.StateListAnimator(strategyFilteredOrderViewModel.AEQbTJ.AEQbTJ(arrayList), orderListPagerResult.getHasNext(), null, 4, null));
            } else {
                strategyFilteredOrderViewModel.KWHzl().setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            }
        }
        StrategyFilteredOrderViewModel strategyFilteredOrderViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8608invokeBWLJW6A$default);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow<InterfaceC20068gZs> mutableStateFlowKWHzl2 = strategyFilteredOrderViewModel2.KWHzl();
            if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlowKWHzl2.setValue(new InterfaceC20068gZs.Application(z));
        }
        return Unit.INSTANCE;
    }
}
