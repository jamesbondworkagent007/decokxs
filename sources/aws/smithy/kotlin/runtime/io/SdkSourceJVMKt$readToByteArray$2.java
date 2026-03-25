package aws.smithy.kotlin.runtime.io;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.CX;
import o.InterfaceC5060De;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkSourceJVMKt$readToByteArray$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    final /* synthetic */ InterfaceC5060De $this_readToByteArray;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkSourceJVMKt$readToByteArray$2(InterfaceC5060De interfaceC5060De, Continuation<? super SdkSourceJVMKt$readToByteArray$2> continuation) {
        super(2, continuation);
        this.$this_readToByteArray = interfaceC5060De;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SdkSourceJVMKt$readToByteArray$2(this.$this_readToByteArray, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((SdkSourceJVMKt$readToByteArray$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5060De interfaceC5060De = this.$this_readToByteArray;
            try {
                byte[] bArrKWHzl = CX.copydefault(interfaceC5060De).KWHzl();
                interfaceC5060De.close();
                return bArrKWHzl;
            } catch (Throwable th) {
                try {
                    interfaceC5060De.close();
                } catch (Throwable th2) {
                    C56379yDe.EZpvd(th, th2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
