package aws.smithy.kotlin.runtime.http.middleware;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BP;
import o.C4787Br;
import o.C5036Cg;
import o.C58859zS;
import o.CG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultValidateResponse$handle$1<H extends CG<? super BP<C5036Cg>, ? extends C58859zS>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C4787Br this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultValidateResponse$handle$1(C4787Br c4787Br, Continuation<? super DefaultValidateResponse$handle$1> continuation) {
        super(continuation);
        this.this$0 = c4787Br;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, null, this);
    }
}
