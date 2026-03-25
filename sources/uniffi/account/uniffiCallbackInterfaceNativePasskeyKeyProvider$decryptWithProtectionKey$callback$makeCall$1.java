package uniffi.account;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.zIR;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super byte[]>, Object> {
    final /* synthetic */ RustBuffer.ByValue $encryptedData;
    final /* synthetic */ RustBuffer.ByValue $rpId;
    final /* synthetic */ RustBuffer.ByValue $uid;
    final /* synthetic */ zIR $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, Continuation<? super uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = zir;
        this.$uid = byValue;
        this.$rpId = byValue2;
        this.$encryptedData = byValue3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1(this.$uniffiObj, this.$uid, this.$rpId, this.$encryptedData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super byte[]> continuation) {
        return ((uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            zIR zir = this.$uniffiObj;
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            String strLift2 = ffiConverterString.lift2(this.$uid);
            String strLift22 = ffiConverterString.lift2(this.$rpId);
            byte[] bArr = (byte[]) FfiConverterByteArray.INSTANCE.lift2(this.$encryptedData);
            this.label = 1;
            obj = zir.copydefault(strLift2, strLift22, bArr, this);
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
