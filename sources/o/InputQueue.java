package o;

import aws.sdk.kotlin.services.comprehend.model.TooManyTagKeysException;
import aws.sdk.kotlin.services.comprehend.serde.TooManyTagKeysExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputQueue implements BB<TooManyTagKeysException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TooManyTagKeysException> continuation) throws java.lang.Throwable {
        TooManyTagKeysExceptionDeserializer$deserialize$1 tooManyTagKeysExceptionDeserializer$deserialize$1;
        TooManyTagKeysException.Activity activity;
        if (continuation instanceof TooManyTagKeysExceptionDeserializer$deserialize$1) {
            tooManyTagKeysExceptionDeserializer$deserialize$1 = (TooManyTagKeysExceptionDeserializer$deserialize$1) continuation;
            int i = tooManyTagKeysExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tooManyTagKeysExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                tooManyTagKeysExceptionDeserializer$deserialize$1 = new TooManyTagKeysExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = tooManyTagKeysExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tooManyTagKeysExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            TooManyTagKeysException.Activity activity2 = new TooManyTagKeysException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            tooManyTagKeysExceptionDeserializer$deserialize$1.L$0 = activity2;
            tooManyTagKeysExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, tooManyTagKeysExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (TooManyTagKeysException.Activity) tooManyTagKeysExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeyCharacterMap.KWHzl(activity, bArr);
        }
        activity.AEQbTJ();
        return activity.EZpvd();
    }
}
