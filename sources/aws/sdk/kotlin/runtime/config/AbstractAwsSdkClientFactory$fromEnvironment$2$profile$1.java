package aws.sdk.kotlin.runtime.config;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.HH;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1 extends SuspendLambda implements Function1<Continuation<? super ObjectStreamField>, Object> {
    final /* synthetic */ HH<ObjectOutputStream> $sharedConfig;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1(HH<ObjectOutputStream> hh, Continuation<? super AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1> continuation) {
        super(1, continuation);
        this.$sharedConfig = hh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1(this.$sharedConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ObjectStreamField> continuation) {
        return ((AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HH<ObjectOutputStream> hh = this.$sharedConfig;
            this.label = 1;
            obj = hh.KWHzl(this);
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
