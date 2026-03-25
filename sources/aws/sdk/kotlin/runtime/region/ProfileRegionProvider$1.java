package aws.sdk.kotlin.runtime.region;

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

/* JADX INFO: loaded from: classes2.dex */
public final class ProfileRegionProvider$1 extends SuspendLambda implements Function1<Continuation<? super ObjectStreamField>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfileRegionProvider$1(Continuation<? super ProfileRegionProvider$1> continuation) {
        super(1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new ProfileRegionProvider$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ObjectStreamField> continuation) {
        return ((ProfileRegionProvider$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ObjectInput.loadAwsSharedConfig$default(o.HL, java.lang.String, o.ObjectOutput, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HL hlCopydefault = HL.OLrzqt.copydefault();
            this.label = 1;
            obj = ObjectInput.loadAwsSharedConfig$default(hlCopydefault, null, null, this, 6, null);
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
