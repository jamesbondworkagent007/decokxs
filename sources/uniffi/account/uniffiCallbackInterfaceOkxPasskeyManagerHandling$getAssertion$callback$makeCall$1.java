package uniffi.account;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.C60207zyQ;
import o.InterfaceC58880zSu;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super C60207zyQ>, Object> {
    final /* synthetic */ RustBuffer.ByValue $androidPackageName;
    final /* synthetic */ RustBuffer.ByValue $challenge;
    final /* synthetic */ RustBuffer.ByValue $credentialIds;
    final /* synthetic */ RustBuffer.ByValue $origin;
    final /* synthetic */ RustBuffer.ByValue $protectionPublicKey;
    final /* synthetic */ RustBuffer.ByValue $rpId;
    final /* synthetic */ InterfaceC58880zSu $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1(InterfaceC58880zSu interfaceC58880zSu, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, RustBuffer.ByValue byValue5, RustBuffer.ByValue byValue6, Continuation<? super uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC58880zSu;
        this.$rpId = byValue;
        this.$challenge = byValue2;
        this.$credentialIds = byValue3;
        this.$origin = byValue4;
        this.$androidPackageName = byValue5;
        this.$protectionPublicKey = byValue6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1(this.$uniffiObj, this.$rpId, this.$challenge, this.$credentialIds, this.$origin, this.$androidPackageName, this.$protectionPublicKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C60207zyQ> continuation) {
        return ((uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC58880zSu interfaceC58880zSu = this.$uniffiObj;
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            String strLift2 = ffiConverterString.lift2(this.$rpId);
            String strLift22 = ffiConverterString.lift2(this.$challenge);
            List<String> list = (List) FfiConverterSequenceString.INSTANCE.lift2(this.$credentialIds);
            FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
            String strLift23 = ffiConverterOptionalString.lift2(this.$origin);
            String strLift24 = ffiConverterOptionalString.lift2(this.$androidPackageName);
            String strLift25 = ffiConverterOptionalString.lift2(this.$protectionPublicKey);
            this.label = 1;
            obj = interfaceC58880zSu.copydefault(strLift2, strLift22, list, strLift23, strLift24, strLift25, this);
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
