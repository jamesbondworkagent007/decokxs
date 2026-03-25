package aws.smithy.kotlin.runtime.retries.delay;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5089Eh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5089Eh.TaskDescription this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1(C5089Eh.TaskDescription taskDescription, Continuation<? super StandardRetryTokenBucket$StandardRetryToken$scheduleRetry$1> continuation) {
        super(continuation);
        this.this$0 = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, this);
    }
}
