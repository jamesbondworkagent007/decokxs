package o;

import aws.sdk.kotlin.services.comprehend.serde.StopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PrintDocumentAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ProtoOutputStream implements BB<PrintDocumentAdapter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PrintDocumentAdapter> continuation) throws java.lang.Throwable {
        StopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
        PrintDocumentAdapter.Application application;
        byte[] bArr;
        if (continuation instanceof StopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) {
            stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = (StopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = new StopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (PrintDocumentAdapter.Application) stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                StrictJarVerifier.KWHzl(application, bArr);
            }
            application.AEQbTJ();
            return application.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (StrictJarVerifier.EZpvd(dt, c58859zS, stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new PrintDocumentAdapter.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0 = application;
        stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopPiiEntitiesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.OLrzqt();
    }
}
