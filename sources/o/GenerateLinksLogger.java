package o;

import aws.sdk.kotlin.services.polly.model.InvalidNextTokenException;
import aws.sdk.kotlin.services.polly.serde.InvalidNextTokenExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GenerateLinksLogger implements BB<InvalidNextTokenException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidNextTokenException> continuation) throws java.lang.Throwable {
        InvalidNextTokenExceptionDeserializer$deserialize$1 invalidNextTokenExceptionDeserializer$deserialize$1;
        InvalidNextTokenException.ActionBar actionBar;
        if (continuation instanceof InvalidNextTokenExceptionDeserializer$deserialize$1) {
            invalidNextTokenExceptionDeserializer$deserialize$1 = (InvalidNextTokenExceptionDeserializer$deserialize$1) continuation;
            int i = invalidNextTokenExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidNextTokenExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidNextTokenExceptionDeserializer$deserialize$1 = new InvalidNextTokenExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidNextTokenExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidNextTokenExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidNextTokenException.ActionBar actionBar2 = new InvalidNextTokenException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidNextTokenExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidNextTokenExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidNextTokenExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidNextTokenException.ActionBar) invalidNextTokenExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            InputMethodSubtypeArray.KWHzl(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.OLrzqt();
    }
}
