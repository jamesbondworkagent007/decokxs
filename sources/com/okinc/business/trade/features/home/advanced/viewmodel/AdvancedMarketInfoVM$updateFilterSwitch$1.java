package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$updateFilterSwitch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderFilter $filter;
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$updateFilterSwitch$1(AdvancedMarketInfoVM advancedMarketInfoVM, OrderFilter orderFilter, Continuation<? super AdvancedMarketInfoVM$updateFilterSwitch$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
        this.$filter = orderFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$updateFilterSwitch$1(this.this$0, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$updateFilterSwitch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            OrderFilter orderFilter = this.$filter;
            do {
                value = mutableStateFlow.getValue();
                List<C55276xgr> list = (List) value;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C55276xgr c55276xgr : list) {
                    arrayList.add(C55276xgr.copy$default(c55276xgr, null, null, null, c55276xgr.OLrzqt() == orderFilter, false, null, null, 119, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
