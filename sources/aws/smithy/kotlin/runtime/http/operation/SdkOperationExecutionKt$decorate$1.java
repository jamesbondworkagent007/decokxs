package aws.smithy.kotlin.runtime.http.operation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BP;
import o.C5031Cb;
import o.C5036Cg;
import o.C58859zS;
import o.CG;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SdkOperationExecutionKt$decorate$1 extends FunctionReferenceImpl implements yHO<BP<C5036Cg>, CG<? super BP<C5036Cg>, ? extends C58859zS>, Continuation<? super C58859zS>, Object> {
    public static final SdkOperationExecutionKt$decorate$1 INSTANCE = new SdkOperationExecutionKt$decorate$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SdkOperationExecutionKt$decorate$1() {
        super(3, C5031Cb.class, "httpTraceMiddleware", "httpTraceMiddleware(Laws/smithy/kotlin/runtime/http/operation/OperationRequest;Laws/smithy/kotlin/runtime/io/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull BP<C5036Cg> bp, @NotNull CG<? super BP<C5036Cg>, ? extends C58859zS> cg, @NotNull Continuation<? super C58859zS> continuation) {
        return C5031Cb.OLrzqt(bp, cg, continuation);
    }
}
