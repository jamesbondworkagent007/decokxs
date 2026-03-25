package aws.smithy.kotlin.runtime.auth.awssigning;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C5165Hf;
import o.C55656xo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC5060De;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultCanonicalizer$calculateHash$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ InterfaceC5060De $source;
    int label;
    final /* synthetic */ C55656xo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCanonicalizer$calculateHash$3(C55656xo c55656xo, InterfaceC5060De interfaceC5060De, Continuation<? super DefaultCanonicalizer$calculateHash$3> continuation) {
        super(2, continuation);
        this.this$0 = c55656xo;
        this.$source = interfaceC5060De;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultCanonicalizer$calculateHash$3(this.this$0, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefaultCanonicalizer$calculateHash$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C5165Hf.AEQbTJ(this.this$0.OLrzqt(this.$source));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
