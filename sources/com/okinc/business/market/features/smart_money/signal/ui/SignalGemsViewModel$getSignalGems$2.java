package com.okinc.business.market.features.smart_money.signal.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29481kuU;
import o.C29505kus;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29553kvn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalGemsViewModel$getSignalGems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29481kuU $signalFilter;
    int label;
    final /* synthetic */ SignalGemsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalGemsViewModel$getSignalGems$2(SignalGemsViewModel signalGemsViewModel, C29481kuU c29481kuU, Continuation<? super SignalGemsViewModel$getSignalGems$2> continuation) {
        super(2, continuation);
        this.this$0 = signalGemsViewModel;
        this.$signalFilter = c29481kuU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalGemsViewModel$getSignalGems$2(this.this$0, this.$signalFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalGemsViewModel$getSignalGems$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8674invokeyxL6bBk$default;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29505kus c29505kus = this.this$0.EZpvd;
            C29481kuU c29481kuU = this.$signalFilter;
            this.label = 1;
            objM8674invokeyxL6bBk$default = C29505kus.m8674invokeyxL6bBk$default(c29505kus, c29481kuU, null, false, null, this, 14, null);
            if (objM8674invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8674invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        SignalGemsViewModel signalGemsViewModel = this.this$0;
        C29481kuU c29481kuU2 = this.$signalFilter;
        if (Result.m7384isSuccessimpl(objM8674invokeyxL6bBk$default)) {
            signalGemsViewModel.copydefault = (List) objM8674invokeyxL6bBk$default;
            signalGemsViewModel.AEQbTJ(c29481kuU2);
        }
        SignalGemsViewModel signalGemsViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8674invokeyxL6bBk$default) != null) {
            MutableStateFlow mutableStateFlow = signalGemsViewModel2.KWHzl;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, InterfaceC29553kvn.Activity.AEQbTJ));
        }
        return Unit.INSTANCE;
    }
}
