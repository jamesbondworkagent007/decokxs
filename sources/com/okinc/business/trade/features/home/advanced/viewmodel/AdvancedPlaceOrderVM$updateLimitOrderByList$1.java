package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
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
public final class AdvancedPlaceOrderVM$updateLimitOrderByList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $hasMCap;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateLimitOrderByList$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Boolean bool, Continuation<? super AdvancedPlaceOrderVM$updateLimitOrderByList$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$hasMCap = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateLimitOrderByList$1(this.this$0, this.$hasMCap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateLimitOrderByList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.isConnected;
            Boolean bool = this.$hasMCap;
            do {
                value = mutableStateFlow.getValue();
                List<C55276xgr> list = (List) value;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C55276xgr c55276xgrCopy$default : list) {
                    if ((c55276xgrCopy$default.OLrzqt() instanceof AdvancedLimitBy) && c55276xgrCopy$default.OLrzqt() == AdvancedLimitBy.MCap) {
                        c55276xgrCopy$default = C55276xgr.copy$default(c55276xgrCopy$default, null, null, null, false, bool.booleanValue(), null, null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, null);
                    }
                    arrayList.add(c55276xgrCopy$default);
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            if (!this.$hasMCap.booleanValue()) {
                this.this$0.OLrzqt(AdvancedLimitBy.Price);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
