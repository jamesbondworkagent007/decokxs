package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserImportInProgressException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserImportInProgressExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AbstractInputMethodService implements BB<UserImportInProgressException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserImportInProgressException> continuation) throws java.lang.Throwable {
        UserImportInProgressExceptionDeserializer$deserialize$1 userImportInProgressExceptionDeserializer$deserialize$1;
        UserImportInProgressException.ActionBar actionBar;
        if (continuation instanceof UserImportInProgressExceptionDeserializer$deserialize$1) {
            userImportInProgressExceptionDeserializer$deserialize$1 = (UserImportInProgressExceptionDeserializer$deserialize$1) continuation;
            int i = userImportInProgressExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userImportInProgressExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                userImportInProgressExceptionDeserializer$deserialize$1 = new UserImportInProgressExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = userImportInProgressExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = userImportInProgressExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UserImportInProgressException.ActionBar actionBar2 = new UserImportInProgressException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            userImportInProgressExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            userImportInProgressExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, userImportInProgressExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (UserImportInProgressException.ActionBar) userImportInProgressExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            CompactExtractEditLayout.AEQbTJ(actionBar, bArr);
        }
        actionBar.copydefault();
        return actionBar.KWHzl();
    }
}
