package com.okinc.business.dexlogic.main.swap.trade.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC23101hrq;
import o.C23314hvr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19755gOc;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseSwapTradeViewModel$getPreCheckResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $userWalletAddress;
    int label;
    final /* synthetic */ AbstractC23101hrq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSwapTradeViewModel$getPreCheckResult$1(AbstractC23101hrq abstractC23101hrq, String str, String str2, Continuation<? super BaseSwapTradeViewModel$getPreCheckResult$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC23101hrq;
        this.$chainId = str;
        this.$userWalletAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSwapTradeViewModel$getPreCheckResult$1(this.this$0, this.$chainId, this.$userWalletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseSwapTradeViewModel$getPreCheckResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC19755gOc interfaceC19755gOcGGvvIC = this.this$0.gGvvIC();
            String str = this.$chainId;
            String str2 = this.$userWalletAddress;
            this.label = 1;
            objOLrzqt = interfaceC19755gOcGGvvIC.OLrzqt(str, str2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Result.m7376boximpl(objOLrzqt)));
        C23314hvr c23314hvr = this.this$0.OLrzqt;
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        c23314hvr.setValue(objOLrzqt);
        return Unit.INSTANCE;
    }
}
