package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C19878gSr;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $currentTokenAddress;
    int label;
    final /* synthetic */ CopyTradingTokenSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1(CopyTradingTokenSelectionViewModel copyTradingTokenSelectionViewModel, String str, String str2, Continuation<? super CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingTokenSelectionViewModel;
        this.$chainId = str;
        this.$currentTokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1(this.this$0, this.$chainId, this.$currentTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19878gSr c19878gSr = this.this$0.copydefault;
            String str = this.$chainId;
            this.label = 1;
            objOLrzqt = c19878gSr.OLrzqt(str, this);
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
        CopyTradingTokenSelectionViewModel copyTradingTokenSelectionViewModel = this.this$0;
        String str2 = this.$currentTokenAddress;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            copyTradingTokenSelectionViewModel.AEQbTJ(str2, (List) objOLrzqt);
        }
        CopyTradingTokenSelectionViewModel copyTradingTokenSelectionViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            MutableStateFlow mutableStateFlow = copyTradingTokenSelectionViewModel2.AEQbTJ;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, yDY.AhwBna()));
        }
        return Unit.INSTANCE;
    }
}
