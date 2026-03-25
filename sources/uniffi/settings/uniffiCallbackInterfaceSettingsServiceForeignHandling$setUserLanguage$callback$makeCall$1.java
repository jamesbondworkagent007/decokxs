package uniffi.settings;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C2777AYv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC4736Bpc;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterTypeLanguageUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ RustBuffer.ByValue $language;
    final /* synthetic */ InterfaceC4736Bpc $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1(InterfaceC4736Bpc interfaceC4736Bpc, RustBuffer.ByValue byValue, Continuation<? super uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC4736Bpc;
        this.$language = byValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1(this.$uniffiObj, this.$language, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC4736Bpc interfaceC4736Bpc = this.$uniffiObj;
            C2777AYv c2777AYv = (C2777AYv) FfiConverterTypeLanguageUnit.INSTANCE.lift2(this.$language);
            this.label = 1;
            if (interfaceC4736Bpc.AEQbTJ(c2777AYv, this) == objCopydefault) {
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
