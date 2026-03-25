package aws.sdk.kotlin.runtime.config.imds;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.HL;
import o.InvalidClassException;
import o.ObjectInput;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ImdsEndpointProvider$activeProfile$1 extends SuspendLambda implements Function1<Continuation<? super ObjectStreamField>, Object> {
    int label;
    final /* synthetic */ InvalidClassException this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImdsEndpointProvider$activeProfile$1(InvalidClassException invalidClassException, Continuation<? super ImdsEndpointProvider$activeProfile$1> continuation) {
        super(1, continuation);
        this.this$0 = invalidClassException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new ImdsEndpointProvider$activeProfile$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ObjectStreamField> continuation) {
        return ((ImdsEndpointProvider$activeProfile$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HL hl = this.this$0.EZpvd;
            this.label = 1;
            obj = ObjectInput.loadAwsSharedConfig$default(hl, null, null, this, 6, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return ((ObjectOutputStream) obj).OLrzqt();
    }
}
