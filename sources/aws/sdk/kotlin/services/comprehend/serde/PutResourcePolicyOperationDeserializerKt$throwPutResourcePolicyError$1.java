package aws.sdk.kotlin.services.comprehend.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.LogWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PutResourcePolicyOperationDeserializerKt$throwPutResourcePolicyError$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PutResourcePolicyOperationDeserializerKt$throwPutResourcePolicyError$1(Continuation<? super PutResourcePolicyOperationDeserializerKt$throwPutResourcePolicyError$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LogWriter.AEQbTJ(null, null, this);
    }
}
