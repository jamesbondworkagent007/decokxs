package uniffi.settings;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AXZ;
import o.BnI;
import o.C56391yDq;
import o.C56442yFn;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterTypeAppLanguageItem;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ RustBuffer.ByValue $lang;
    final /* synthetic */ BnI $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1(BnI bnI, RustBuffer.ByValue byValue, Continuation<? super uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = bnI;
        this.$lang = byValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1(this.$uniffiObj, this.$lang, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BnI bnI = this.$uniffiObj;
            AXZ axz = (AXZ) FfiConverterTypeAppLanguageItem.INSTANCE.lift2(this.$lang);
            this.label = 1;
            obj = bnI.EZpvd(axz, this);
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
