package uniffi.growth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AOQ;
import o.C2510AOn;
import o.C2533APk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC2568AQt;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ long $callbacks;
    final /* synthetic */ long $context;
    final /* synthetic */ long $provider;
    final /* synthetic */ InterfaceC2568AQt $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1(InterfaceC2568AQt interfaceC2568AQt, long j, long j2, long j3, Continuation<? super uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC2568AQt;
        this.$provider = j;
        this.$context = j2;
        this.$callbacks = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1(this.$uniffiObj, this.$provider, this.$context, this.$callbacks, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC2568AQt interfaceC2568AQt = this.$uniffiObj;
            AOQ aoqLift = FfiConverterTypePopupProvider.INSTANCE.lift(this.$provider);
            C2533APk c2533APkLift = FfiConverterTypePopupTriggerContext.INSTANCE.lift(this.$context);
            C2510AOn c2510AOnLift = FfiConverterTypePopupCallbacks.INSTANCE.lift(this.$callbacks);
            this.label = 1;
            if (interfaceC2568AQt.KWHzl(aoqLift, c2533APkLift, c2510AOnLift, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
