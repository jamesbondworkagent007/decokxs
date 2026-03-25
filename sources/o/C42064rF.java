package o;

import aws.sdk.kotlin.services.textract.model.ProvisionedThroughputExceededException;
import aws.sdk.kotlin.services.textract.serde.ProvisionedThroughputExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C42064rF implements BB<ProvisionedThroughputExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ProvisionedThroughputExceededException> continuation) throws java.lang.Throwable {
        ProvisionedThroughputExceededExceptionDeserializer$deserialize$1 provisionedThroughputExceededExceptionDeserializer$deserialize$1;
        ProvisionedThroughputExceededException.Application application;
        if (continuation instanceof ProvisionedThroughputExceededExceptionDeserializer$deserialize$1) {
            provisionedThroughputExceededExceptionDeserializer$deserialize$1 = (ProvisionedThroughputExceededExceptionDeserializer$deserialize$1) continuation;
            int i = provisionedThroughputExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                provisionedThroughputExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                provisionedThroughputExceededExceptionDeserializer$deserialize$1 = new ProvisionedThroughputExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = provisionedThroughputExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = provisionedThroughputExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ProvisionedThroughputExceededException.Application application2 = new ProvisionedThroughputExceededException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            provisionedThroughputExceededExceptionDeserializer$deserialize$1.L$0 = application2;
            provisionedThroughputExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, provisionedThroughputExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (ProvisionedThroughputExceededException.Application) provisionedThroughputExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C42253rM.EZpvd(application, bArr);
        }
        application.EZpvd();
        return application.KWHzl();
    }
}
