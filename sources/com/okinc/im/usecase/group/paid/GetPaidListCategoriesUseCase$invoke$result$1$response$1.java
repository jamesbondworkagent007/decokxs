package com.okinc.im.usecase.group.paid;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44424sPh;
import o.C35798oEb;
import o.C56391yDq;
import o.C56442yFn;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GetPaidListCategoriesUseCase$invoke$result$1$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44424sPh>, Object> {
    final /* synthetic */ long $id;
    final /* synthetic */ C35798oEb $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaidListCategoriesUseCase$invoke$result$1$response$1(C35798oEb c35798oEb, long j, Continuation<? super GetPaidListCategoriesUseCase$invoke$result$1$response$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = c35798oEb;
        this.$id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetPaidListCategoriesUseCase$invoke$result$1$response$1(this.$this_runCatching, this.$id, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44424sPh> continuation) {
        return ((GetPaidListCategoriesUseCase$invoke$result$1$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.$this_runCatching.AEQbTJ;
            long j = this.$id;
            this.label = 1;
            obj = sir.EZpvd(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
