package uniffi.growth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AOQ;
import o.C2533APk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $context;
    final /* synthetic */ AOQ $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1(AOQ aoq, long j, Continuation<? super uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = aoq;
        this.$context = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1(this.$uniffiObj, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AOQ aoq = this.$uniffiObj;
            C2533APk c2533APkLift = FfiConverterTypePopupTriggerContext.INSTANCE.lift(this.$context);
            this.label = 1;
            obj = aoq.AEQbTJ(c2533APkLift, this);
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
