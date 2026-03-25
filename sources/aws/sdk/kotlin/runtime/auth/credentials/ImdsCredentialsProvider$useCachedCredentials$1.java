package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.IBinder;
import o.InterfaceC52697wV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ImdsCredentialsProvider$useCachedCredentials$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ IBinder this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImdsCredentialsProvider$useCachedCredentials$1(IBinder iBinder, Continuation<? super ImdsCredentialsProvider$useCachedCredentials$1> continuation) {
        super(continuation);
        this.this$0 = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Exception) null, (Continuation<? super InterfaceC52697wV>) this);
    }
}
