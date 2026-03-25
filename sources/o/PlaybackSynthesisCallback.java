package o;

import aws.sdk.kotlin.services.comprehend.serde.DetectPiiEntitiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BatteryStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PlaybackSynthesisCallback implements BB<BatteryStats> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BatteryStats> continuation) throws java.lang.Throwable {
        DetectPiiEntitiesOperationDeserializer$deserialize$1 detectPiiEntitiesOperationDeserializer$deserialize$1;
        BatteryStats.Application application;
        byte[] bArr;
        if (continuation instanceof DetectPiiEntitiesOperationDeserializer$deserialize$1) {
            detectPiiEntitiesOperationDeserializer$deserialize$1 = (DetectPiiEntitiesOperationDeserializer$deserialize$1) continuation;
            int i = detectPiiEntitiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectPiiEntitiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectPiiEntitiesOperationDeserializer$deserialize$1 = new DetectPiiEntitiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectPiiEntitiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectPiiEntitiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (BatteryStats.Application) detectPiiEntitiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                PlaybackQueueItem.AEQbTJ(application, bArr);
            }
            application.AEQbTJ();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectPiiEntitiesOperationDeserializer$deserialize$1.label = 1;
            if (PlaybackQueueItem.AEQbTJ(dt, c58859zS, detectPiiEntitiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new BatteryStats.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectPiiEntitiesOperationDeserializer$deserialize$1.L$0 = application;
        detectPiiEntitiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectPiiEntitiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.KWHzl();
    }
}
