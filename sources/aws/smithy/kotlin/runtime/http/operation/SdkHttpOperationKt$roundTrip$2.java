package aws.smithy.kotlin.runtime.http.operation;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [O] */
/* JADX INFO: loaded from: classes2.dex */
public final class SdkHttpOperationKt$roundTrip$2<O> extends SuspendLambda implements Function2<O, Continuation<? super O>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SdkHttpOperationKt$roundTrip$2(Continuation<? super SdkHttpOperationKt$roundTrip$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        SdkHttpOperationKt$roundTrip$2 sdkHttpOperationKt$roundTrip$2 = new SdkHttpOperationKt$roundTrip$2(continuation);
        sdkHttpOperationKt$roundTrip$2.L$0 = obj;
        return sdkHttpOperationKt$roundTrip$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o2, Continuation<? super O> continuation) {
        return ((SdkHttpOperationKt$roundTrip$2) create(o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return this.L$0;
    }
}
