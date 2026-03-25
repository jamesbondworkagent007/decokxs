package o;

import aws.sdk.kotlin.services.textract.model.ValidationException;
import aws.sdk.kotlin.services.textract.serde.ValidationExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44118sE implements BB<ValidationException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ValidationException> continuation) throws java.lang.Throwable {
        ValidationExceptionDeserializer$deserialize$1 validationExceptionDeserializer$deserialize$1;
        ValidationException.ActionBar actionBar;
        if (continuation instanceof ValidationExceptionDeserializer$deserialize$1) {
            validationExceptionDeserializer$deserialize$1 = (ValidationExceptionDeserializer$deserialize$1) continuation;
            int i = validationExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validationExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                validationExceptionDeserializer$deserialize$1 = new ValidationExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = validationExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = validationExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ValidationException.ActionBar actionBar2 = new ValidationException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            validationExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            validationExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, validationExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ValidationException.ActionBar) validationExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C44173sG.KWHzl(actionBar, bArr);
        }
        actionBar.OLrzqt();
        return actionBar.EZpvd();
    }
}
