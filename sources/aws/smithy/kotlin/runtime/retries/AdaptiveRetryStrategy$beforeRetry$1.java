package aws.smithy.kotlin.runtime.retries;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC5091Ej;
import o.DR;
import o.InterfaceC5093El;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AdaptiveRetryStrategy$beforeRetry$1<R> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ DR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveRetryStrategy$beforeRetry$1(DR dr, Continuation<? super AdaptiveRetryStrategy$beforeRetry$1> continuation) {
        super(continuation);
        this.this$0 = dr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0, (Object) null, (AbstractC5091Ej) null, (InterfaceC5093El) null, this);
    }
}
