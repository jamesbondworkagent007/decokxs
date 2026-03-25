package com.okinc.business.dexlogic.main.swap.trade.viewmodel;

import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC23101hrq;
import o.AbstractC23151hsn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22299hcj;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseSwapTradeViewModel$fetchSwapConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ AbstractC23101hrq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSwapTradeViewModel$fetchSwapConfig$1(AbstractC23101hrq abstractC23101hrq, String str, Continuation<? super BaseSwapTradeViewModel$fetchSwapConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC23101hrq;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSwapTradeViewModel$fetchSwapConfig$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseSwapTradeViewModel$fetchSwapConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC22299hcj interfaceC22299hcjQHmsKR = this.this$0.QHmsKR();
            String str = this.$chainId;
            this.label = 1;
            objAEQbTJ = interfaceC22299hcjQHmsKR.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Result.m7376boximpl(objAEQbTJ)));
        AbstractC23101hrq abstractC23101hrq = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            MutableStateFlow mutableStateFlow2 = abstractC23101hrq.KWHzl;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, AbstractC23151hsn.Application.OLrzqt));
            abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        AbstractC23101hrq abstractC23101hrq2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow3 = abstractC23101hrq2.KWHzl;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, new AbstractC23151hsn.ActionBar(thM7380exceptionOrNullimpl)));
            abstractC23101hrq2.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_CONFIG_FETCH_FAILED, true, false));
        }
        return Unit.INSTANCE;
    }
}
