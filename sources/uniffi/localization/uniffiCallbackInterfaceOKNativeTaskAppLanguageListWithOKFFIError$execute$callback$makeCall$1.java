package uniffi.localization;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AYE;
import o.C2758AYc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super C2758AYc>, Object> {
    final /* synthetic */ AYE $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1(AYE aye, Continuation<? super uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = aye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1(this.$uniffiObj, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C2758AYc> continuation) {
        return ((uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AYE aye = this.$uniffiObj;
            this.label = 1;
            obj = aye.copydefault(this);
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
