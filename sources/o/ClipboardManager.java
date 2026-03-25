package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CodeMismatchExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ClipboardManager implements BB<CodeMismatchException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CodeMismatchException> continuation) throws java.lang.Throwable {
        CodeMismatchExceptionDeserializer$deserialize$1 codeMismatchExceptionDeserializer$deserialize$1;
        CodeMismatchException.ActionBar actionBar;
        if (continuation instanceof CodeMismatchExceptionDeserializer$deserialize$1) {
            codeMismatchExceptionDeserializer$deserialize$1 = (CodeMismatchExceptionDeserializer$deserialize$1) continuation;
            int i = codeMismatchExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                codeMismatchExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                codeMismatchExceptionDeserializer$deserialize$1 = new CodeMismatchExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = codeMismatchExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = codeMismatchExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            CodeMismatchException.ActionBar actionBar2 = new CodeMismatchException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            codeMismatchExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            codeMismatchExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, codeMismatchExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (CodeMismatchException.ActionBar) codeMismatchExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            AsyncQueryHandler.copydefault(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.AEQbTJ();
    }
}
