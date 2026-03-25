package aws.smithy.kotlin.runtime.http.operation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BH;
import o.C5036Cg;
import o.DT;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [I] */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SdkOperationExecutionKt$decorate$2<I> extends FunctionReferenceImpl implements yHO<DT, I, Continuation<? super C5036Cg>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SdkOperationExecutionKt$decorate$2(Object obj) {
        super(3, obj, BH.class, "serialize", "serialize(Laws/smithy/kotlin/runtime/operation/ExecutionContext;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull DT dt, I i, @NotNull Continuation<? super C5036Cg> continuation) {
        return ((BH) this.receiver).KWHzl(dt, i, continuation);
    }
}
