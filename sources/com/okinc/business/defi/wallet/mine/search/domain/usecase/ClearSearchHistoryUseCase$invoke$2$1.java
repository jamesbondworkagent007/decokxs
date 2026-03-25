package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.xWH;

/* JADX INFO: loaded from: classes5.dex */
public final class ClearSearchHistoryUseCase$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClearSearchHistoryUseCase$invoke$2$1(Continuation<? super ClearSearchHistoryUseCase$invoke$2$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClearSearchHistoryUseCase$invoke$2$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClearSearchHistoryUseCase$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC58260yxt<Integer> abstractC58260yxtEZpvd = ((xWH) C43251rlk.copydefault(xWH.class)).EZpvd();
                this.label = 1;
                if (RxAwaitKt.await(abstractC58260yxtEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            pUU.EZpvd("ClearSearchHistoryUseCase", "Successfully cleared DApp search history");
        } catch (Exception e) {
            pUU.AEQbTJ("ClearSearchHistoryUseCase", "Failed to clear DApp history: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }
}
