package aws.smithy.kotlin.runtime.retries;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import o.DY;
import o.InterfaceC5088Eg;
import o.InterfaceC5093El;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardRetryStrategy$doTryLoop$1<R> extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ DY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardRetryStrategy$doTryLoop$1(DY dy, Continuation<? super StandardRetryStrategy$doTryLoop$1> continuation) {
        super(continuation);
        this.this$0 = dy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((Function1) null, (InterfaceC5093El) null, 0, (InterfaceC5088Eg) null, this);
    }
}
