package o;

import aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PreferenceDataStore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PrintWriterPrinter implements BB<PreferenceDataStore> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PreferenceDataStore> continuation) throws java.lang.Throwable {
        StartEventsDetectionJobOperationDeserializer$deserialize$1 startEventsDetectionJobOperationDeserializer$deserialize$1;
        PreferenceDataStore.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartEventsDetectionJobOperationDeserializer$deserialize$1) {
            startEventsDetectionJobOperationDeserializer$deserialize$1 = (StartEventsDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = startEventsDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startEventsDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startEventsDetectionJobOperationDeserializer$deserialize$1 = new StartEventsDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startEventsDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startEventsDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (PreferenceDataStore.TaskDescription) startEventsDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Rational.copydefault(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startEventsDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (Rational.KWHzl(dt, c58859zS, startEventsDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new PreferenceDataStore.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startEventsDetectionJobOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startEventsDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startEventsDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.KWHzl();
    }
}
