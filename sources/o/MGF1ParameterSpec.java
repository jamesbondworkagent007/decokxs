package o;

import aws.sdk.kotlin.services.cognitoidentity.model.ResourceConflictException;
import aws.sdk.kotlin.services.cognitoidentity.serde.ResourceConflictExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MGF1ParameterSpec implements BB<ResourceConflictException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceConflictException> continuation) throws java.lang.Throwable {
        ResourceConflictExceptionDeserializer$deserialize$1 resourceConflictExceptionDeserializer$deserialize$1;
        ResourceConflictException.ActionBar actionBar;
        if (continuation instanceof ResourceConflictExceptionDeserializer$deserialize$1) {
            resourceConflictExceptionDeserializer$deserialize$1 = (ResourceConflictExceptionDeserializer$deserialize$1) continuation;
            int i = resourceConflictExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceConflictExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceConflictExceptionDeserializer$deserialize$1 = new ResourceConflictExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceConflictExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceConflictExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceConflictException.ActionBar actionBar2 = new ResourceConflictException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceConflictExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            resourceConflictExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceConflictExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ResourceConflictException.ActionBar) resourceConflictExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            RSAKeyGenParameterSpec.KWHzl(actionBar, bArr);
        }
        actionBar.KWHzl();
        return actionBar.OLrzqt();
    }
}
