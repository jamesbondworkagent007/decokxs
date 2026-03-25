package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.Editable;
import o.InterfaceC57843yq;
import o.PersistableBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SsoTokenProvider$resolve$2 extends SuspendLambda implements Function1<Continuation<? super PersistableBundle>, Object> {
    final /* synthetic */ InterfaceC57843yq $attributes;
    int label;
    final /* synthetic */ Editable this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SsoTokenProvider$resolve$2(Editable editable, InterfaceC57843yq interfaceC57843yq, Continuation<? super SsoTokenProvider$resolve$2> continuation) {
        super(1, continuation);
        this.this$0 = editable;
        this.$attributes = interfaceC57843yq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new SsoTokenProvider$resolve$2(this.this$0, this.$attributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PersistableBundle> continuation) {
        return ((SsoTokenProvider$resolve$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Editable editable = this.this$0;
            InterfaceC57843yq interfaceC57843yq = this.$attributes;
            this.label = 1;
            obj = editable.AEQbTJ(interfaceC57843yq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
