package com.okinc.business.dexlogic.main.limmitorder.viewmodel;

import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C22495hgT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22299hcj;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentViewModel$fetchSwapConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C22495hgT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderContentViewModel$fetchSwapConfig$1(C22495hgT c22495hgT, String str, Continuation<? super LimitOrderContentViewModel$fetchSwapConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = c22495hgT;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderContentViewModel$fetchSwapConfig$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderContentViewModel$fetchSwapConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC22299hcj interfaceC22299hcj = this.this$0.accept;
            String str = this.$chainId;
            this.label = 1;
            objAEQbTJ = interfaceC22299hcj.AEQbTJ(str, this);
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
        C22495hgT c22495hgT = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        C22495hgT c22495hgT2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            c22495hgT2.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_CONFIG_FETCH_FAILED, true, false));
        }
        return Unit.INSTANCE;
    }
}
