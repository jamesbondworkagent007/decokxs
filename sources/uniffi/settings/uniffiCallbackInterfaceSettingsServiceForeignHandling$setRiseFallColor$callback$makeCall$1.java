package uniffi.settings;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC4736Bpc;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ int $colorType;
    final /* synthetic */ InterfaceC4736Bpc $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1(InterfaceC4736Bpc interfaceC4736Bpc, int i, Continuation<? super uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC4736Bpc;
        this.$colorType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1(this.$uniffiObj, this.$colorType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC4736Bpc interfaceC4736Bpc = this.$uniffiObj;
            int iIntValue = FfiConverterInt.INSTANCE.lift(this.$colorType).intValue();
            this.label = 1;
            if (interfaceC4736Bpc.copydefault(iIntValue, this) == objCopydefault) {
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
