package aws.sdk.kotlin.runtime.config.compression;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FilterReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1(Continuation<? super RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FilterReader.AEQbTJ(null, null, this);
    }
}
