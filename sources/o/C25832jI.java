package o;

import aws.sdk.kotlin.services.rekognition.model.ResourceAlreadyExistsException;
import aws.sdk.kotlin.services.rekognition.serde.ResourceAlreadyExistsExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25832jI implements BB<ResourceAlreadyExistsException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceAlreadyExistsException> continuation) throws java.lang.Throwable {
        ResourceAlreadyExistsExceptionDeserializer$deserialize$1 resourceAlreadyExistsExceptionDeserializer$deserialize$1;
        ResourceAlreadyExistsException.Application application;
        if (continuation instanceof ResourceAlreadyExistsExceptionDeserializer$deserialize$1) {
            resourceAlreadyExistsExceptionDeserializer$deserialize$1 = (ResourceAlreadyExistsExceptionDeserializer$deserialize$1) continuation;
            int i = resourceAlreadyExistsExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceAlreadyExistsExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceAlreadyExistsExceptionDeserializer$deserialize$1 = new ResourceAlreadyExistsExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceAlreadyExistsExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceAlreadyExistsExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceAlreadyExistsException.Application application2 = new ResourceAlreadyExistsException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceAlreadyExistsExceptionDeserializer$deserialize$1.L$0 = application2;
            resourceAlreadyExistsExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceAlreadyExistsExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (ResourceAlreadyExistsException.Application) resourceAlreadyExistsExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C25967jN.AEQbTJ(application, bArr);
        }
        application.copydefault();
        return application.EZpvd();
    }
}
