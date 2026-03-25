package aws.smithy.kotlin.runtime.retries.policy;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import o.C5092Ek;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class StandardRetryPolicy$evaluationStrategies$2 extends FunctionReferenceImpl implements Function1<ServiceException, AbstractC5091Ej> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StandardRetryPolicy$evaluationStrategies$2(Object obj) {
        super(1, obj, C5092Ek.class, "evaluateServiceException", "evaluateServiceException(Laws/smithy/kotlin/runtime/ServiceException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final AbstractC5091Ej invoke(@NotNull ServiceException serviceException) {
        Intrinsics.checkNotNullParameter(serviceException, "");
        return ((C5092Ek) this.receiver).KWHzl(serviceException);
    }
}
