package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31680mA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class VideoTooLargeExceptionDeserializer$deserialize$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31680mA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTooLargeExceptionDeserializer$deserialize$1(C31680mA c31680mA, Continuation<? super VideoTooLargeExceptionDeserializer$deserialize$1> continuation) {
        super(continuation);
        this.this$0 = c31680mA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, null, this);
    }
}
