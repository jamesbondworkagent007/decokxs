package aws.sdk.kotlin.runtime.config.imds;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BP;
import o.C5036Cg;
import o.LineNumberInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TokenMiddleware$modifyRequest$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ LineNumberInputStream this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenMiddleware$modifyRequest$1(LineNumberInputStream lineNumberInputStream, Continuation<? super TokenMiddleware$modifyRequest$1> continuation) {
        super(continuation);
        this.this$0 = lineNumberInputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((BP<C5036Cg>) null, (Continuation<? super BP<C5036Cg>>) this);
    }
}
