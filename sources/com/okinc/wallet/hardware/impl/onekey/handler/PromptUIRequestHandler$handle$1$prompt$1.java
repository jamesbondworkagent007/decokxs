package com.okinc.wallet.hardware.impl.onekey.handler;

import com.okinc.wallet.hardware.impl.onekey.handler.PromptUIRequestHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.DeserializationStrategy;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes24.dex */
public final class PromptUIRequestHandler$handle$1$prompt$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PromptUIRequestHandler.PromptUIRequest>, Object> {
    final /* synthetic */ String $params;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptUIRequestHandler$handle$1$prompt$1(String str, Continuation<? super PromptUIRequestHandler$handle$1$prompt$1> continuation) {
        super(2, continuation);
        this.$params = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PromptUIRequestHandler$handle$1$prompt$1(this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PromptUIRequestHandler.PromptUIRequest> continuation) {
        return ((PromptUIRequestHandler$handle$1$prompt$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) PromptUIRequestHandler.PromptUIRequest.Companion.serializer(), this.$params);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
