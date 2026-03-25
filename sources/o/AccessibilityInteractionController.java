package o;

import aws.sdk.kotlin.services.comprehend.serde.StopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PrintJobInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AccessibilityInteractionController implements BB<PrintJobInfo> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PrintJobInfo> continuation) throws java.lang.Throwable {
        StopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1;
        PrintJobInfo.Application application;
        byte[] bArr;
        if (continuation instanceof StopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) {
            stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 = (StopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 = new StopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (PrintJobInfo.Application) stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                AbsSavedState.EZpvd(application, bArr);
            }
            application.AEQbTJ();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (AbsSavedState.AEQbTJ(dt, c58859zS, stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new PrintJobInfo.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.L$0 = application;
        stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopTargetedSentimentDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.copydefault();
    }
}
