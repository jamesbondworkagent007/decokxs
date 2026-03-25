package o;

import aws.sdk.kotlin.services.rekognition.model.ResourceInUseException;
import aws.sdk.kotlin.services.rekognition.serde.ResourceInUseExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25940jM implements BB<ResourceInUseException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceInUseException> continuation) throws java.lang.Throwable {
        ResourceInUseExceptionDeserializer$deserialize$1 resourceInUseExceptionDeserializer$deserialize$1;
        ResourceInUseException.Application application;
        if (continuation instanceof ResourceInUseExceptionDeserializer$deserialize$1) {
            resourceInUseExceptionDeserializer$deserialize$1 = (ResourceInUseExceptionDeserializer$deserialize$1) continuation;
            int i = resourceInUseExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceInUseExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceInUseExceptionDeserializer$deserialize$1 = new ResourceInUseExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceInUseExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceInUseExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceInUseException.Application application2 = new ResourceInUseException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceInUseExceptionDeserializer$deserialize$1.L$0 = application2;
            resourceInUseExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceInUseExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (ResourceInUseException.Application) resourceInUseExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C25913jL.copydefault(application, bArr);
        }
        application.EZpvd();
        return application.copydefault();
    }
}
