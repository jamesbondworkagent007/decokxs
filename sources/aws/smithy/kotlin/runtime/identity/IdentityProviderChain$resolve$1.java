package aws.smithy.kotlin.runtime.identity;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC5051Cv;
import o.InterfaceC5045Cp;
import o.InterfaceC5047Cr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityProviderChain$resolve$1<P extends InterfaceC5045Cp, I extends InterfaceC5047Cr> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC5051Cv<P, I> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityProviderChain$resolve$1(AbstractC5051Cv<P, I> abstractC5051Cv, Continuation<? super IdentityProviderChain$resolve$1> continuation) {
        super(continuation);
        this.this$0 = abstractC5051Cv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5051Cv.copydefault(this.this$0, null, this);
    }
}
