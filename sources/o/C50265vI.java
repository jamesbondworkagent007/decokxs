package o;

import aws.sdk.kotlin.services.translate.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.translate.serde.ResourceNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50265vI implements BB<ResourceNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceNotFoundException> continuation) throws java.lang.Throwable {
        ResourceNotFoundExceptionDeserializer$deserialize$1 resourceNotFoundExceptionDeserializer$deserialize$1;
        ResourceNotFoundException.ActionBar actionBar;
        if (continuation instanceof ResourceNotFoundExceptionDeserializer$deserialize$1) {
            resourceNotFoundExceptionDeserializer$deserialize$1 = (ResourceNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = resourceNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceNotFoundExceptionDeserializer$deserialize$1 = new ResourceNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceNotFoundException.ActionBar actionBar2 = new ResourceNotFoundException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceNotFoundExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            resourceNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ResourceNotFoundException.ActionBar) resourceNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C50319vK.AEQbTJ(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.copydefault();
    }
}
