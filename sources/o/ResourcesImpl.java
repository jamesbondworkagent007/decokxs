package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ForbiddenExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ResourcesImpl implements BB<ForbiddenException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ForbiddenException> continuation) throws java.lang.Throwable {
        ForbiddenExceptionDeserializer$deserialize$1 forbiddenExceptionDeserializer$deserialize$1;
        ForbiddenException.ActionBar actionBar;
        if (continuation instanceof ForbiddenExceptionDeserializer$deserialize$1) {
            forbiddenExceptionDeserializer$deserialize$1 = (ForbiddenExceptionDeserializer$deserialize$1) continuation;
            int i = forbiddenExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forbiddenExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                forbiddenExceptionDeserializer$deserialize$1 = new ForbiddenExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = forbiddenExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = forbiddenExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ForbiddenException.ActionBar actionBar2 = new ForbiddenException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            forbiddenExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            forbiddenExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, forbiddenExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ForbiddenException.ActionBar) forbiddenExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            AbstractCursor.EZpvd(actionBar, bArr);
        }
        actionBar.AEQbTJ();
        return actionBar.copydefault();
    }
}
