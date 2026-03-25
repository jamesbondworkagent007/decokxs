package aws.smithy.kotlin.runtime.retries.policy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import o.C5092Ek;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class StandardRetryPolicy$evaluationStrategies$1 extends FunctionReferenceImpl implements Function1<Throwable, AbstractC5091Ej> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StandardRetryPolicy$evaluationStrategies$1(Object obj) {
        super(1, obj, C5092Ek.class, "evaluateSpecificExceptions", "evaluateSpecificExceptions(Ljava/lang/Throwable;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final AbstractC5091Ej invoke(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return ((C5092Ek) this.receiver).OLrzqt(th);
    }
}
