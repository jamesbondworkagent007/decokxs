package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.Point;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$launchLoadingIfDelayed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$launchLoadingIfDelayed$1(SearchWalletViewModel searchWalletViewModel, Continuation<? super SearchWalletViewModel$launchLoadingIfDelayed$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletViewModel$launchLoadingIfDelayed$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletViewModel$launchLoadingIfDelayed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.values;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, C56443yFo.KWHzl(true)));
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) this.this$0.values.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new Point.StateListAnimator(null, 1, null)));
            MutableStateFlow mutableStateFlow3 = this.this$0.values;
            do {
                value3 = mutableStateFlow3.getValue();
                ((Boolean) value3).booleanValue();
            } while (!mutableStateFlow3.compareAndSet(value3, C56443yFo.KWHzl(false)));
        }
        return Unit.INSTANCE;
    }
}
