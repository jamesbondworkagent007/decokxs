package com.amplitude.core.utilities;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C5242Ke;
import o.C56391yDq;
import o.C56442yFn;
import o.KU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InMemoryResponseHandler$handleTooManyRequestsResponse$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C5242Ke> $eventsToRetryLater;
    int label;
    final /* synthetic */ KU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryResponseHandler$handleTooManyRequestsResponse$3(List<C5242Ke> list, KU ku, Continuation<? super InMemoryResponseHandler$handleTooManyRequestsResponse$3> continuation) {
        super(2, continuation);
        this.$eventsToRetryLater = list;
        this.this$0 = ku;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new InMemoryResponseHandler$handleTooManyRequestsResponse$3(this.$eventsToRetryLater, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InMemoryResponseHandler$handleTooManyRequestsResponse$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(30000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<C5242Ke> list = this.$eventsToRetryLater;
        KU ku = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ku.OLrzqt().EZpvd((C5242Ke) it.next());
        }
        return Unit.INSTANCE;
    }
}
