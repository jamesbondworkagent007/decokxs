package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InvalidPasswordExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DdmHandleThread implements BB<InvalidPasswordException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidPasswordException> continuation) throws java.lang.Throwable {
        InvalidPasswordExceptionDeserializer$deserialize$1 invalidPasswordExceptionDeserializer$deserialize$1;
        InvalidPasswordException.ActionBar actionBar;
        if (continuation instanceof InvalidPasswordExceptionDeserializer$deserialize$1) {
            invalidPasswordExceptionDeserializer$deserialize$1 = (InvalidPasswordExceptionDeserializer$deserialize$1) continuation;
            int i = invalidPasswordExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidPasswordExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidPasswordExceptionDeserializer$deserialize$1 = new InvalidPasswordExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidPasswordExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidPasswordExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidPasswordException.ActionBar actionBar2 = new InvalidPasswordException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidPasswordExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidPasswordExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidPasswordExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidPasswordException.ActionBar) invalidPasswordExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            GestureConstants.KWHzl(actionBar, bArr);
        }
        actionBar.AEQbTJ();
        return actionBar.OLrzqt();
    }
}
