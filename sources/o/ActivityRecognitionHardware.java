package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedOperationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UnsupportedOperationExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityRecognitionHardware implements BB<aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedOperationException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedOperationException> continuation) throws java.lang.Throwable {
        UnsupportedOperationExceptionDeserializer$deserialize$1 unsupportedOperationExceptionDeserializer$deserialize$1;
        UnsupportedOperationException.ActionBar actionBar;
        if (continuation instanceof UnsupportedOperationExceptionDeserializer$deserialize$1) {
            unsupportedOperationExceptionDeserializer$deserialize$1 = (UnsupportedOperationExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedOperationExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedOperationExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedOperationExceptionDeserializer$deserialize$1 = new UnsupportedOperationExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedOperationExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedOperationExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedOperationException.ActionBar actionBar2 = new UnsupportedOperationException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedOperationExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            unsupportedOperationExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedOperationExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (UnsupportedOperationException.ActionBar) unsupportedOperationExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ActivityRecognitionEvent.copydefault(actionBar, bArr);
        }
        actionBar.OLrzqt();
        return actionBar.EZpvd();
    }
}
