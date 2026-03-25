package com.okinc.planet.domain.usecase;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.tQX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes10.dex */
public final class PaginationUseCase$invoke$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super tQX.TaskDescription<T>>, Object> {
    final /* synthetic */ Input $input;
    Object L$0;
    int label;
    final /* synthetic */ tQX<Input, T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginationUseCase$invoke$2(tQX<Input, T> tqx, Input input, Continuation<? super PaginationUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = tqx;
        this.$input = input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaginationUseCase$invoke$2(this.this$0, this.$input, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super tQX.TaskDescription<T>> continuation) {
        return ((PaginationUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        tQX tqx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tQX tqx2 = this.this$0;
            Input input = this.$input;
            this.L$0 = tqx2;
            this.label = 1;
            Object objEZpvd = tqx2.EZpvd(input, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            tqx = tqx2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tqx = (tQX) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return tqx.OLrzqt((List) obj);
    }
}
