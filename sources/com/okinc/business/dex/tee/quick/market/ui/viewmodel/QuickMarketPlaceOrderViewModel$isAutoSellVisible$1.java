package com.okinc.business.dex.tee.quick.market.ui.viewmodel;

import com.okinc.business.dexlogic.bean.TransactionType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickMarketPlaceOrderViewModel$isAutoSellVisible$1 extends SuspendLambda implements yHO<Boolean, TransactionType, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ QuickMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickMarketPlaceOrderViewModel$isAutoSellVisible$1(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, Continuation<? super QuickMarketPlaceOrderViewModel$isAutoSellVisible$1> continuation) {
        super(3, continuation);
        this.this$0 = quickMarketPlaceOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Boolean bool, TransactionType transactionType, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), transactionType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, TransactionType transactionType, Continuation<? super Boolean> continuation) {
        QuickMarketPlaceOrderViewModel$isAutoSellVisible$1 quickMarketPlaceOrderViewModel$isAutoSellVisible$1 = new QuickMarketPlaceOrderViewModel$isAutoSellVisible$1(this.this$0, continuation);
        quickMarketPlaceOrderViewModel$isAutoSellVisible$1.Z$0 = z;
        quickMarketPlaceOrderViewModel$isAutoSellVisible$1.L$0 = transactionType;
        return quickMarketPlaceOrderViewModel$isAutoSellVisible$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.gEmmrt() && this.Z$0 && ((TransactionType) this.L$0) == TransactionType.Buy);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
