package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnexpectedLambdaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UnexpectedLambdaExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HdmiTimerRecordSources implements BB<UnexpectedLambdaException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnexpectedLambdaException> continuation) throws java.lang.Throwable {
        UnexpectedLambdaExceptionDeserializer$deserialize$1 unexpectedLambdaExceptionDeserializer$deserialize$1;
        UnexpectedLambdaException.StateListAnimator stateListAnimator;
        if (continuation instanceof UnexpectedLambdaExceptionDeserializer$deserialize$1) {
            unexpectedLambdaExceptionDeserializer$deserialize$1 = (UnexpectedLambdaExceptionDeserializer$deserialize$1) continuation;
            int i = unexpectedLambdaExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unexpectedLambdaExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unexpectedLambdaExceptionDeserializer$deserialize$1 = new UnexpectedLambdaExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unexpectedLambdaExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unexpectedLambdaExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnexpectedLambdaException.StateListAnimator stateListAnimator2 = new UnexpectedLambdaException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unexpectedLambdaExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            unexpectedLambdaExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unexpectedLambdaExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UnexpectedLambdaException.StateListAnimator) unexpectedLambdaExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeyboardLayout.copydefault(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.EZpvd();
    }
}
