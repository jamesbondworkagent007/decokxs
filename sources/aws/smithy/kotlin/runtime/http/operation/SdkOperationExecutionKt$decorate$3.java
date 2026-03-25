package aws.smithy.kotlin.runtime.http.operation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BB;
import o.C58859zS;
import o.DT;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [O] */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SdkOperationExecutionKt$decorate$3<O> extends FunctionReferenceImpl implements yHO<DT, C58859zS, Continuation<? super O>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SdkOperationExecutionKt$decorate$3(Object obj) {
        super(3, obj, BB.class, "deserialize", "deserialize(Laws/smithy/kotlin/runtime/operation/ExecutionContext;Laws/smithy/kotlin/runtime/http/HttpCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super O> continuation) {
        return ((BB) this.receiver).AEQbTJ(dt, c58859zS, continuation);
    }
}
