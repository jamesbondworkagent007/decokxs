package o;

import aws.sdk.kotlin.services.comprehend.serde.StopEntitiesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PageRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApkVerityBuilder implements BB<PageRange> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PageRange> continuation) throws java.lang.Throwable {
        StopEntitiesDetectionJobOperationDeserializer$deserialize$1 stopEntitiesDetectionJobOperationDeserializer$deserialize$1;
        PageRange.Application application;
        byte[] bArr;
        if (continuation instanceof StopEntitiesDetectionJobOperationDeserializer$deserialize$1) {
            stopEntitiesDetectionJobOperationDeserializer$deserialize$1 = (StopEntitiesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = stopEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopEntitiesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopEntitiesDetectionJobOperationDeserializer$deserialize$1 = new StopEntitiesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopEntitiesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (PageRange.Application) stopEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DataDigester.EZpvd(application, bArr);
            }
            application.OLrzqt();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (DataDigester.copydefault(dt, c58859zS, stopEntitiesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new PageRange.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0 = application;
        stopEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopEntitiesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.OLrzqt();
        return application.copydefault();
    }
}
