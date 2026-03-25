package com.okinc.oklive.app.ui.list.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1(sUN sun, String str, LifecycleOwner lifecycleOwner, Continuation<? super LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$channelId = str;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1(this.this$0, this.$channelId, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$joinAndStartListening$1$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault(this.$channelId, this.$lifecycleOwner);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
