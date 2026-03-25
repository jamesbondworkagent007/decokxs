package o;

import aws.sdk.kotlin.services.rekognition.serde.StartFaceDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10258bl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27887kH implements BB<C10258bl> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10258bl> continuation) throws java.lang.Throwable {
        StartFaceDetectionOperationDeserializer$deserialize$1 startFaceDetectionOperationDeserializer$deserialize$1;
        C10258bl.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartFaceDetectionOperationDeserializer$deserialize$1) {
            startFaceDetectionOperationDeserializer$deserialize$1 = (StartFaceDetectionOperationDeserializer$deserialize$1) continuation;
            int i = startFaceDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startFaceDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startFaceDetectionOperationDeserializer$deserialize$1 = new StartFaceDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startFaceDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startFaceDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C10258bl.TaskDescription) startFaceDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C27805kE.copydefault(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startFaceDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C27805kE.OLrzqt(dt, c58859zS, startFaceDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C10258bl.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startFaceDetectionOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startFaceDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startFaceDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.KWHzl();
    }
}
