package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FileReader;
import o.HH;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileCredentialsProvider$toCredentialsProvider$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ Looper this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCredentialsProvider$toCredentialsProvider$2(Looper looper, Continuation<? super ProfileCredentialsProvider$toCredentialsProvider$2> continuation) {
        super(continuation);
        this.this$0 = looper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((FileReader) null, (InterfaceC52697wV) null, (HH<String>) null, (Continuation<? super InterfaceC52805wZ>) this);
    }
}
