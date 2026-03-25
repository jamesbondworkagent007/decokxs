package aws.sdk.kotlin.runtime.config.useragent;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.OptionalDataException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ResolveUserAgentKt$resolveUserAgentAppId$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResolveUserAgentKt$resolveUserAgentAppId$1(Continuation<? super ResolveUserAgentKt$resolveUserAgentAppId$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OptionalDataException.EZpvd(null, null, this);
    }
}
