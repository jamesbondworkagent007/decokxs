package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidLambdaResponseException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InvalidLambdaResponseExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DdmHandleHeap implements BB<InvalidLambdaResponseException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidLambdaResponseException> continuation) throws java.lang.Throwable {
        InvalidLambdaResponseExceptionDeserializer$deserialize$1 invalidLambdaResponseExceptionDeserializer$deserialize$1;
        InvalidLambdaResponseException.ActionBar actionBar;
        if (continuation instanceof InvalidLambdaResponseExceptionDeserializer$deserialize$1) {
            invalidLambdaResponseExceptionDeserializer$deserialize$1 = (InvalidLambdaResponseExceptionDeserializer$deserialize$1) continuation;
            int i = invalidLambdaResponseExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidLambdaResponseExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidLambdaResponseExceptionDeserializer$deserialize$1 = new InvalidLambdaResponseExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidLambdaResponseExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidLambdaResponseExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidLambdaResponseException.ActionBar actionBar2 = new InvalidLambdaResponseException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidLambdaResponseExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidLambdaResponseExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidLambdaResponseExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidLambdaResponseException.ActionBar) invalidLambdaResponseExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DdmHandleHello.EZpvd(actionBar, bArr);
        }
        actionBar.copydefault();
        return actionBar.AEQbTJ();
    }
}
