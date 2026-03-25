package aws.sdk.kotlin.services.cognitoidentity.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.DSAParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ListTagsForResourceOperationDeserializer$deserialize$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ DSAParams this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListTagsForResourceOperationDeserializer$deserialize$1(DSAParams dSAParams, Continuation<? super ListTagsForResourceOperationDeserializer$deserialize$1> continuation) {
        super(continuation);
        this.this$0 = dSAParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, null, this);
    }
}
