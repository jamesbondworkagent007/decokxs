package aws.sdk.kotlin.runtime.http.interceptors;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.StreamTokenizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class UnsupportedSigningAlgorithmInterceptor$modifyBeforeCompletion$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ StreamTokenizer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedSigningAlgorithmInterceptor$modifyBeforeCompletion$1(StreamTokenizer streamTokenizer, Continuation<? super UnsupportedSigningAlgorithmInterceptor$modifyBeforeCompletion$1> continuation) {
        super(continuation);
        this.this$0 = streamTokenizer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo5947modifyBeforeCompletiongIAlus = this.this$0.mo5947modifyBeforeCompletiongIAlus(null, this);
        return objMo5947modifyBeforeCompletiongIAlus == C56442yFn.copydefault() ? objMo5947modifyBeforeCompletiongIAlus : Result.m7376boximpl(objMo5947modifyBeforeCompletiongIAlus);
    }
}
