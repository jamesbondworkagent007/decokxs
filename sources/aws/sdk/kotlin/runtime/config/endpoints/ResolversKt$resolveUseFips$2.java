package aws.sdk.kotlin.runtime.config.endpoints;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.HL;
import o.ObjectInput;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ResolversKt$resolveUseFips$2 extends SuspendLambda implements Function1<Continuation<? super ObjectStreamField>, Object> {
    final /* synthetic */ HL $provider;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolversKt$resolveUseFips$2(HL hl, Continuation<? super ResolversKt$resolveUseFips$2> continuation) {
        super(1, continuation);
        this.$provider = hl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new ResolversKt$resolveUseFips$2(this.$provider, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ObjectStreamField> continuation) {
        return ((ResolversKt$resolveUseFips$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HL hl = this.$provider;
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
