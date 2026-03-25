package com.okinc.business.defi.wallet.passkey.common.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.JsonElement;
import o.C17652fNg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateUopUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JsonElement>, Object> {
    final /* synthetic */ T $req;
    final /* synthetic */ SerializationStrategy<T> $reqSerializer;
    int label;
    final /* synthetic */ C17652fNg<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.serialization.SerializationStrategy<? super T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateUopUseCase$invoke$2(C17652fNg<T> c17652fNg, SerializationStrategy<? super T> serializationStrategy, T t, Continuation<? super CreateUopUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c17652fNg;
        this.$reqSerializer = serializationStrategy;
        this.$req = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateUopUseCase$invoke$2(this.this$0, this.$reqSerializer, this.$req, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JsonElement> continuation) {
        return ((CreateUopUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.copydefault().encodeToJsonElement(this.$reqSerializer, this.$req);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
